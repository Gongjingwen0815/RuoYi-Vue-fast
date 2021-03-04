package com.ruoyi.project.door.controller;

import java.util.List;

import com.ruoyi.project.door.domain.DoorOpenRecord;
import com.ruoyi.project.door.service.IDoorOpenRecordService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2021-03-04
 */
@RestController
@RequestMapping("/door/record")
public class DoorOpenRecordController extends BaseController
{
    @Autowired
    private IDoorOpenRecordService doorOpenRecordService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:record:list')")
    @GetMapping("/list")
    public TableDataInfo list(DoorOpenRecord doorOpenRecord)
    {
        startPage();
        List<DoorOpenRecord> list = doorOpenRecordService.selectDoorOpenRecordList(doorOpenRecord);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:record:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(DoorOpenRecord doorOpenRecord)
    {
        List<DoorOpenRecord> list = doorOpenRecordService.selectDoorOpenRecordList(doorOpenRecord);
        ExcelUtil<DoorOpenRecord> util = new ExcelUtil<DoorOpenRecord>(DoorOpenRecord.class);
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
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:record:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DoorOpenRecord doorOpenRecord)
    {
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
