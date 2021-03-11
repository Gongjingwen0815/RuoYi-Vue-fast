package com.ruoyi.project.door.mapper;

import com.ruoyi.project.door.domain.DoorOpenRecord;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;


/**
 * 进出记录Mapper接口
 * 
 * @author ruoyi
 * @date 2021-03-04
 */
public interface DoorOpenRecordMapper 
{

    Integer selectDoorPeople(String startTime, String endTime);

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public DoorOpenRecord selectDoorOpenRecordById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param doorOpenRecord 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<DoorOpenRecord> selectDoorOpenRecordList(DoorOpenRecord doorOpenRecord);

    /**
     * 新增【请填写功能名称】
     * 
     * @param doorOpenRecord 【请填写功能名称】
     * @return 结果
     */
    public int insertDoorOpenRecord(DoorOpenRecord doorOpenRecord);

    /**
     * 修改【请填写功能名称】
     * 
     * @param doorOpenRecord 【请填写功能名称】
     * @return 结果
     */
    public int updateDoorOpenRecord(DoorOpenRecord doorOpenRecord);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteDoorOpenRecordById(Integer id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDoorOpenRecordByIds(Integer[] ids);
}
