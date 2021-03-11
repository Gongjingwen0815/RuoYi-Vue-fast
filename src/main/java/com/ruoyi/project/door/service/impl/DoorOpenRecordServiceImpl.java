package com.ruoyi.project.door.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.ruoyi.project.door.domain.DoorOpenRecord;
import com.ruoyi.project.door.mapper.DoorOpenRecordMapper;
import com.ruoyi.project.door.service.IDoorOpenRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 进出记录 Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-03-04
 */
@Service
public class DoorOpenRecordServiceImpl implements IDoorOpenRecordService
{
    @Autowired
    private DoorOpenRecordMapper doorOpenRecordMapper;

    /**
     * 今日识别人数
     * @return
     */
    @Override
    public Integer selectDoorPeople(String startTime, String endTime) {
        return doorOpenRecordMapper.selectDoorPeople(startTime,endTime);
    }

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public DoorOpenRecord selectDoorOpenRecordById(Integer id)
    {
        return doorOpenRecordMapper.selectDoorOpenRecordById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param doorOpenRecord 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<DoorOpenRecord> selectDoorOpenRecordList(DoorOpenRecord doorOpenRecord)
    {
        return doorOpenRecordMapper.selectDoorOpenRecordList(doorOpenRecord);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param doorOpenRecord 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDoorOpenRecord(DoorOpenRecord doorOpenRecord)
    {
        return doorOpenRecordMapper.insertDoorOpenRecord(doorOpenRecord);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param doorOpenRecord 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDoorOpenRecord(DoorOpenRecord doorOpenRecord)
    {
        return doorOpenRecordMapper.updateDoorOpenRecord(doorOpenRecord);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDoorOpenRecordByIds(Integer[] ids)
    {
        return doorOpenRecordMapper.deleteDoorOpenRecordByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDoorOpenRecordById(Integer id)
    {
        return doorOpenRecordMapper.deleteDoorOpenRecordById(id);
    }
}
