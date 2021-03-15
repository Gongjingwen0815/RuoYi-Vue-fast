package com.ruoyi.project.door.mapper;

import com.ruoyi.project.door.domain.DoorOpenRecord;
import com.ruoyi.project.door.domain.bo.DoorOpenRecordBo;
import com.ruoyi.project.door.domain.vo.DoorOpenRecordLimitVo;
import com.ruoyi.project.door.domain.vo.DoorOpenRecordVo;

import java.util.List;


/**
 * 进出记录Mapper接口
 *
 * @author ruoyi
 * @date 2021-03-04
 */
public interface DoorOpenRecordMapper {
    /**
     * 查询每个小时的识别人数
     * @param doorOpenRecordBo
     * @return
     */
    Integer selectDoorPeopleTime(DoorOpenRecordBo doorOpenRecordBo);

    /**
     * 获取今日识别次数
     * @return
     */
    Integer selectDoorPeople();

    /**
     * 获取前六条识别记录
     * @return
     */
    List<DoorOpenRecordLimitVo> selectDoorLimit();


    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    DoorOpenRecord selectDoorOpenRecordById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param doorOpenRecord 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    List<DoorOpenRecordVo> selectDoorOpenRecordList(DoorOpenRecordVo doorOpenRecord);

    /**
     * 新增【请填写功能名称】
     *
     * @param doorOpenRecord 【请填写功能名称】
     * @return 结果
     */
    int insertDoorOpenRecord(DoorOpenRecord doorOpenRecord);

    /**
     * 修改【请填写功能名称】
     *
     * @param doorOpenRecord 【请填写功能名称】
     * @return 结果
     */
    int updateDoorOpenRecord(DoorOpenRecord doorOpenRecord);

    /**
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    int deleteDoorOpenRecordById(Integer id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteDoorOpenRecordByIds(Integer[] ids);
}
