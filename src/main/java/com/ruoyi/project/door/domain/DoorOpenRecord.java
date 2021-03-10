package com.ruoyi.project.door.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【进出记录】对象 door_open_record
 *
 * @author ruoyi
 * @date 2021-03-04
 */
public class DoorOpenRecord {
    private static final long serialVersionUID = 1L;

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

    public void setId(Integer id) { this.id = id; }

    public Integer getId() {
        return id;
    }

    public Integer getNumber() { return number; }

    public void setNumber(Integer number) { this.number = number; }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }


    public Date getRecordTime() {
        return recordTime;
    }

    public void setContrastingPicture(String contrastingPicture) {
        this.contrastingPicture = contrastingPicture;
    }

    public String getContrastingPicture() {
        return contrastingPicture;
    }

    public void setOriginalPicture(String originalPicture) {
        this.originalPicture = originalPicture;
    }

    public String getOriginalPicture() {
        return originalPicture;
    }

    public void setCompatibility(BigDecimal compatibility) {
        this.compatibility = compatibility;
    }

    public BigDecimal getCompatibility() {
        return compatibility;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("number", getNumber())
                .append("recordTime", getRecordTime())
                .append("contrastingPicture", getContrastingPicture())
                .append("originalPicture", getOriginalPicture())
                .append("compatibility", getCompatibility())
                .toString();
    }
}
