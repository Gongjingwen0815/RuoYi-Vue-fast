package com.ruoyi.project.door.controller;

import java.util.Date;
import java.util.List;

import com.ruoyi.project.door.config.util.AddImg;
import com.ruoyi.project.door.domain.UserInfo;
import com.ruoyi.project.door.domain.vo.UserInfoVo;
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
 * 【用户】Controller
 *
 * @author ruoyi
 * @date 2021-03-04
 */
@RestController
@RequestMapping("/door/userinfo")
@Api(tags = "用户信息")
public class UserInfoController extends BaseController {
    @Autowired
    private IUserInfoService userInfoService;
    AddImg addImg = new AddImg();


    /**
     * 查询有效人数
     */
    @PreAuthorize("@ss.hasPermi('system:info:usernumber')")
    @GetMapping("/UserNumber")
    @ApiOperation("有效人数")
    public Integer usernumber() {
        Integer list = userInfoService.selectUserNumber();
        return list;
    }

    /**
     * 查询【用户】列表
     */
    @PreAuthorize("@ss.hasPermi('system:info:list')")
    @GetMapping("/list")
    @ApiOperation("员工列表")
    public TableDataInfo list(UserInfo userInfo) {
        startPage();
        List<UserInfo> list = userInfoService.selectUserInfoList(userInfo);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:info:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(UserInfo userInfo) {
        List<UserInfo> list = userInfoService.selectUserInfoList(userInfo);
        ExcelUtil<UserInfo> util = new ExcelUtil<UserInfo>(UserInfo.class);
        return util.exportExcel(list, "info");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:info:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id) {
        return AjaxResult.success(userInfoService.selectUserInfoById(id));
    }



    /**
     * 新增【用户】姓名 性别 原始图片
     * 前端人员操作时deadline是有效日期
     */
    @PreAuthorize("@ss.hasPermi('system:info:add')")
    @Log(title = "【用户新增】", businessType = BusinessType.INSERT)
    @PostMapping
    @ApiOperation("添加用户信息")
    public AjaxResult add(@RequestParam("file") MultipartFile file, @Validated UserInfo userInfo, @RequestParam("deadline") Long deadline) {
        addImg.AddUpdateImg(userInfo, file);
        userInfo.setStartTime(new Date());
        userInfo.setEndTime(new Date(userInfo.getStartTime().getTime() + deadline));
        return toAjax(userInfoService.insertUserInfo(userInfo));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:info:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UserInfo userInfo) {
        return toAjax(userInfoService.updateUserInfo(userInfo));
    }

    /**
     * 删除【用户信息】
     */
    @PreAuthorize("@ss.hasPermi('system:info:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    @ApiOperation("删除此用户信息")
    public AjaxResult remove(@PathVariable Integer[] ids) {
        return toAjax(userInfoService.deleteUserInfoByIds(ids));
    }

    /**
     * 根据创建时间排序只取前四条数据
     */
    @PreAuthorize("@ss.hasPermi('system:info:usernumber')")
    @GetMapping("/selectAllOrderByStartTime")
    @ApiOperation("根据创建时间排序")
    public TableDataInfo selectAllOrderByStartTime() {
        startPage();
        List<UserInfo> userInfos = userInfoService.selectAllOrderByStartTime();
        return getDataTable(userInfos);
    }

    /**
     * 查询用户的姓名和截止期限大于0天  取前6条数据
     */
    @PreAuthorize("@ss.hasPermi('system:info:usernumber')")
    @GetMapping("/selectUserDeadline")
    @ApiOperation("查询用户的姓名和截止期限")
    public TableDataInfo selectUserDeadline() {
        startPage();
        List<UserInfoVo> userInfos = userInfoService.selectUserDeadline();
        System.out.println(userInfos);
        return getDataTable(userInfos);
    }

}
