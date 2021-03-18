package com.ruoyi.project.door.mapper;

import com.ruoyi.project.door.domain.Equipment;

import java.util.List;


/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2021-03-18
 */
public interface EquipmentMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Equipment selectEquipmentById(String id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param equipment 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Equipment> selectEquipmentList(Equipment equipment);

    /**
     * 新增【请填写功能名称】
     * 
     * @param equipment 【请填写功能名称】
     * @return 结果
     */
    public int insertEquipment(Equipment equipment);

    /**
     * 修改【请填写功能名称】
     * 
     * @param equipment 【请填写功能名称】
     * @return 结果
     */
    public int updateEquipment(Equipment equipment);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteEquipmentById(String id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteEquipmentByIds(String[] ids);

    /**
     *  批量逻辑删除
     * @param ids
     * @return
     */
    public int updateEquipmentByIds(String[] ids);
}
