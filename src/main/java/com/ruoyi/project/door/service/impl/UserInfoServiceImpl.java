package com.ruoyi.project.door.service.impl;

import java.util.List;

import com.ruoyi.project.door.domain.UserInfo;
import com.ruoyi.project.door.mapper.UserInfoMapper;
import com.ruoyi.project.door.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-03-04
 */
@Service
public class UserInfoServiceImpl implements IUserInfoService
{
    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     *查询有效人数
     * @return
     */
    @Override
    public Integer selectUserNumber() {
        return userInfoMapper.selectUserNumber();
    }

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public UserInfo selectUserInfoById(Integer id)
    {
        return userInfoMapper.selectUserInfoById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param userInfo 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<UserInfo> selectUserInfoList(UserInfo userInfo)
    {
        return userInfoMapper.selectUserInfoList(userInfo);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param userInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertUserInfo(UserInfo userInfo)
    {
        return userInfoMapper.insertUserInfo(userInfo);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param userInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateUserInfo(UserInfo userInfo)
    {
        return userInfoMapper.updateUserInfo(userInfo);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteUserInfoByIds(Integer[] ids)
    {
        return userInfoMapper.deleteUserInfoByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteUserInfoById(Integer id)
    {
        return userInfoMapper.deleteUserInfoById(id);
    }
}
