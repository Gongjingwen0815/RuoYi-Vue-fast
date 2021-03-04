package com.ruoyi.project.door.service;

import com.ruoyi.project.door.domain.UserInfo;

import java.util.List;


/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2021-03-04
 */
public interface IUserInfoService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public UserInfo selectUserInfoById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param userInfo 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<UserInfo> selectUserInfoList(UserInfo userInfo);

    /**
     * 新增【请填写功能名称】
     * 
     * @param userInfo 【请填写功能名称】
     * @return 结果
     */
    public int insertUserInfo(UserInfo userInfo);

    /**
     * 修改【请填写功能名称】
     * 
     * @param userInfo 【请填写功能名称】
     * @return 结果
     */
    public int updateUserInfo(UserInfo userInfo);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deleteUserInfoByIds(Integer[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteUserInfoById(Integer id);
}
