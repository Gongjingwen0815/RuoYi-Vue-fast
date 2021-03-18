package com.ruoyi.project.door.service.impl;

import java.util.List;

import com.ruoyi.project.door.domain.Equipment;
import com.ruoyi.project.door.mapper.EquipmentMapper;
import com.ruoyi.project.door.service.IEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-03-18
 */
@Service
public class EquipmentServiceImpl implements IEquipmentService
{
    @Autowired
    private EquipmentMapper equipmentMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public Equipment selectEquipmentById(String id)
    {
        return equipmentMapper.selectEquipmentById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param equipment 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Equipment> selectEquipmentList(Equipment equipment)
    {
        return equipmentMapper.selectEquipmentList(equipment);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param equipment 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertEquipment(Equipment equipment)
    {
        return equipmentMapper.insertEquipment(equipment);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param equipment 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateEquipment(Equipment equipment)
    {
        return equipmentMapper.updateEquipment(equipment);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteEquipmentByIds(String[] ids)
    {
        return equipmentMapper.deleteEquipmentByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteEquipmentById(String id)
    {
        return equipmentMapper.deleteEquipmentById(id);
    }

    /**
     * 批量逻辑删除
     * @param ids
     * @return
     */
    @Override
    public int updateEquipmentByIds(String[] ids) {
        return equipmentMapper.updateEquipmentByIds(ids);
    }
}
