package com.ruoyi.project.door.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 user_info
 * 
 * @author ruoyi
 * @date 2021-03-04
 */
public class UserInfo
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Integer id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 编号 */
    @Excel(name = "编号")
    private Integer number;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    /** 底片 */
    @Excel(name = "底片")
    private String originalPicture;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    public void setId(Integer id) 
    {
        this.id = id;
    }
    public Integer getId() 
    {
        return id;
    }

    public void setName(String name) 
    {
        this.name = name;
    }
    public String getName() 
    {
        return name;
    }

    public Integer getNumber() { return number; }
    public void setNumber(Integer number) { this.number = number; }

    public void setSex(String sex) 
    {
        this.sex = sex;
    }
    public String getSex() 
    {
        return sex;
    }

    public void setOriginalPicture(String originalPicture) 
    {
        this.originalPicture = originalPicture;
    }
    public String getOriginalPicture() 
    {
        return originalPicture;
    }

    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }
    public Date getStartTime() 
    {
        return startTime;
    }

    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }
    public Date getEndTime() 
    {
        return endTime;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
             .append("number", getNumber())
            .append("sex", getSex())
            .append("originalPicture", getOriginalPicture())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .toString();
    }
}
