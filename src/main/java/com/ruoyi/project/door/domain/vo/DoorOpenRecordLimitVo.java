package com.ruoyi.project.door.domain.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;

import java.math.BigDecimal;
import java.util.Date;

public class DoorOpenRecordLimitVo {

    /**
     * 姓名
     */
    private String name;

    /**
     * 记录时间
     */
    private Date recordTime;

    /**
     * 契合度
     */
    private BigDecimal compatibility;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public BigDecimal getCompatibility() {
        return compatibility;
    }

    public void setCompatibility(BigDecimal compatibility) {
        this.compatibility = compatibility;
    }
}
