package com.ruoyi.project.door.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.ruoyi.project.door.domain.DoorOpenRecord;
import com.ruoyi.project.door.domain.bo.DoorOpenRecordBo;
import com.ruoyi.project.door.domain.vo.DoorOpenRecordLimitVo;
import com.ruoyi.project.door.domain.vo.DoorOpenRecordVo;
import com.ruoyi.project.door.domain.vo.DoorOpenRecordPeopleTimeVo;
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
    public Integer selectDoorPeople() {
        return doorOpenRecordMapper.selectDoorPeople();
    }

    /**
     * 获取前六条识别记录
     * @return
     */
    @Override
    public List<DoorOpenRecordLimitVo> selectDoorLimit() {
        return doorOpenRecordMapper.selectDoorLimit();
    }

    /**
     * 查询每个小时的识别人数
     * @return
     */
    @Override
    public List<DoorOpenRecordPeopleTimeVo> selectDoorPeopleFor() {

        List<DoorOpenRecordPeopleTimeVo> doorOpenRecordVo = new ArrayList<DoorOpenRecordPeopleTimeVo>();

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(Calendar.HOUR_OF_DAY,0);
        calendar1.set(Calendar.MINUTE,59);
        calendar1.set(Calendar.SECOND,59);

        //String date = year + "-" + month + "-" + day + " 00:00:00";

        for(int i = 0;i <=22;i ++) {

            DoorOpenRecordPeopleTimeVo doorOpenRecordPeopleTimeVo = new DoorOpenRecordPeopleTimeVo();
            DoorOpenRecordBo doorOpenRecordBo = new DoorOpenRecordBo();

            calendar.add(Calendar.HOUR,1);
            calendar1.add(Calendar.HOUR,1);

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            String startTime = sdf.format(calendar.getTime());
            String endTime = sdf.format(calendar1.getTime());

            doorOpenRecordBo.setStartDate(startTime);
            doorOpenRecordBo.setEndDate(endTime);
            int count = doorOpenRecordMapper.selectDoorPeopleTime(doorOpenRecordBo);

            doorOpenRecordPeopleTimeVo.setStartDate(startTime);
            doorOpenRecordPeopleTimeVo.setNumber(count);
            doorOpenRecordPeopleTimeVo.setEndDate(endTime);
            doorOpenRecordVo.add(doorOpenRecordPeopleTimeVo);
        }

        return doorOpenRecordVo;
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
    public List<DoorOpenRecordVo> selectDoorOpenRecordList(DoorOpenRecordVo doorOpenRecord)
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
