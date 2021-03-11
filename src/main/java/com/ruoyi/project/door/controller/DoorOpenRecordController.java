package com.ruoyi.project.door.controller;

import java.util.Date;
import java.util.List;

import com.ruoyi.project.door.config.util.AddImg;
import com.ruoyi.project.door.domain.DoorOpenRecord;
import com.ruoyi.project.door.domain.UserInfo;
import com.ruoyi.project.door.domain.vo.DoorOpenRecordVo;
import com.ruoyi.project.door.service.IDoorOpenRecordService;
import com.ruoyi.project.door.service.IUserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2021-03-04
 */
@RestController
@RequestMapping("/door/record")
@Api(tags = "识别记录")
public class DoorOpenRecordController extends BaseController
{
    @Autowired
    private IDoorOpenRecordService doorOpenRecordService;
    AddImg addImg = new AddImg();
    @Autowired
    private IUserInfoService iUserInfoService;
    /**
     * 查询【进出记录】列表
     */
    @PreAuthorize("@ss.hasPermi('system:record:doorpeople')")
    @GetMapping("/DoorPeople")
    @ApiOperation("查询进出记录")
    public Integer doorpeople()
    {

        return doorOpenRecordService.selectDoorPeople();
    }


    /**
     * 查询【进出记录】列表
     */
    @PreAuthorize("@ss.hasPermi('system:record:list')")
    @GetMapping("/list")
    @ApiOperation("查询进出记录列表")
    public TableDataInfo list(DoorOpenRecordVo doorOpenRecord)
    {
        startPage();
        List<DoorOpenRecordVo> list = doorOpenRecordService.selectDoorOpenRecordList(doorOpenRecord);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:record:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(DoorOpenRecordVo doorOpenRecord)
    {
        List<DoorOpenRecordVo> list = doorOpenRecordService.selectDoorOpenRecordList(doorOpenRecord);
        ExcelUtil<DoorOpenRecordVo> util = new ExcelUtil<DoorOpenRecordVo>(DoorOpenRecordVo.class);
        return util.exportExcel(list, "record");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:record:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(doorOpenRecordService.selectDoorOpenRecordById(id));
    }

    /**
     * 新增【进出记录】
     */
    @PreAuthorize("@ss.hasPermi('system:record:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    @ApiOperation("新增进出记录")
    public AjaxResult add(@Validated DoorOpenRecord doorOpenRecord, @RequestParam("newFile") MultipartFile newFile, UserInfo userInfo)
    {
        String originalPicture = null;
        Long deadline = 10*24*60*60*1000L;
        //得到传过来的这个工号
        Integer number = doorOpenRecord.getNumber();
        //把工号传到userInfo
        userInfo.setNumber(number);
        //根据工号从userInfo中查询这个人的底片
        List<UserInfo> userInfos = iUserInfoService.selectUserInfoList(userInfo);
        for (UserInfo userInfo1:userInfos) {
            originalPicture = userInfo1.getOriginalPicture();
        }
        //把工号对应的底片添加到记录表中
        doorOpenRecord.setOriginalPicture(originalPicture);
        doorOpenRecord.setRecordTime(new Date());
        doorOpenRecord.setEndTime(new Date(doorOpenRecord.getRecordTime().getTime() + deadline));
        //把抓拍图存在指定路径下，然后把路径存在数据库中
        addImg.AddRecordImg(doorOpenRecord,newFile);
        return toAjax(doorOpenRecordService.insertDoorOpenRecord(doorOpenRecord));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:record:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DoorOpenRecord doorOpenRecord)
    {
        return toAjax(doorOpenRecordService.updateDoorOpenRecord(doorOpenRecord));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:record:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(doorOpenRecordService.deleteDoorOpenRecordByIds(ids));
    }
}
