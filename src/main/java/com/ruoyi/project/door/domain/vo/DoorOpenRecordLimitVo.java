package com.ruoyi.project.door.domain.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;

import java.math.BigDecimal;
import java.util.Date;

public class DoorOpenRecordLimitVo {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 编号
     */
    @Excel(name = "编号")
    private Integer number;

    /**
     * 记录时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "记录时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date recordTime;

    /**
     * 抓拍的照片
     */
    @Excel(name = "抓拍的照片")
    private String contrastingPicture;

    /**
     * 底片
     */
    @Excel(name = "底片")
    private String originalPicture;

    /**
     * 契合度
     */
    @Excel(name = "契合度")
    private BigDecimal compatibility;

    /**
     * 截止日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "截止日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public String getContrastingPicture() {
        return contrastingPicture;
    }

    public void setContrastingPicture(String contrastingPicture) {
        this.contrastingPicture = contrastingPicture;
    }

    public String getOriginalPicture() {
        return originalPicture;
    }

    public void setOriginalPicture(String originalPicture) {
        this.originalPicture = originalPicture;
    }

    public BigDecimal getCompatibility() {
        return compatibility;
    }

    public void setCompatibility(BigDecimal compatibility) {
        this.compatibility = compatibility;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
