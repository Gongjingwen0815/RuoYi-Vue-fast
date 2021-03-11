package com.ruoyi.project.door.mapper;


import com.ruoyi.project.door.domain.UserInfo;

import java.util.List;

/**
 * 用户信息Mapper接口
 * 
 * @author ruoyi
 * @date 2021-03-04
 */
public interface UserInfoMapper
{
    /**
     * 查询有效人数
     * @return
     */
    Integer selectUserNumber();

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
     UserInfo selectUserInfoById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param userInfo 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
     List<UserInfo> selectUserInfoList(UserInfo userInfo);

    /**
     * 新增【请填写功能名称】
     * 
     * @param userInfo 【请填写功能名称】
     * @return 结果
     */
     int insertUserInfo(UserInfo userInfo);

    /**
     * 修改【请填写功能名称】
     * 
     * @param userInfo 【请填写功能名称】
     * @return 结果
     */
    public int updateUserInfo(UserInfo userInfo);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
     int deleteUserInfoById(Integer id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
     int deleteUserInfoByIds(Integer[] ids);
}
