package com.ruoyi.project.door.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 equipment
 * 
 * @author ruoyi
 * @date 2021-03-18
 */
public class Equipment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 设备ID */
    private String id;

    /** 门禁机名称 */
    @Excel(name = "门禁机名称")
    private String name;

    /** ip地址 */
    @Excel(name = "ip地址")
    private String ipAddress;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date creatTime;

    /** 删除标志 */
    @Excel(name = "删除标志")
    private Long isDelete;

    /** 识别方式 */
    @Excel(name = "识别方式")
    private Long identifyWays;

    /** 人脸库 */
    @Excel(name = "人脸库")
    private String faceLibrary;

    /** 是否活体 */
    @Excel(name = "是否活体")
    private Long isLiving;

    /** 是否开启红外摄像头 */
    @Excel(name = "是否开启红外摄像头")
    private Long infraredCamera;

    /** 是否抓拍 */
    @Excel(name = "是否抓拍")
    private Long snap;

    /** 相似度 */
    @Excel(name = "相似度")
    private BigDecimal similarity;

    /** 特征同步时间 */
    @Excel(name = "特征同步时间")
    private BigDecimal synchronizationTime;

    /** 心跳时间 */
    @Excel(name = "心跳时间")
    private BigDecimal heartbeatTime;

    /** 弹窗显示时间 */
    @Excel(name = "弹窗显示时间")
    private BigDecimal popupWindowTime;

    /** 最小人脸占比 */
    @Excel(name = "最小人脸占比")
    private BigDecimal minFace;

    /** 最大人脸占比 */
    @Excel(name = "最大人脸占比")
    private BigDecimal maxFace;

    /** 控制器开门时间 */
    @Excel(name = "控制器开门时间")
    private BigDecimal controllerOpeningTime;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
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
    public void setIpAddress(String ipAddress) 
    {
        this.ipAddress = ipAddress;
    }

    public String getIpAddress() 
    {
        return ipAddress;
    }
    public void setCreatTime(Date creatTime) 
    {
        this.creatTime = creatTime;
    }

    public Date getCreatTime() 
    {
        return creatTime;
    }
    public void setIsDelete(Long isDelete) 
    {
        this.isDelete = isDelete;
    }

    public Long getIsDelete() 
    {
        return isDelete;
    }
    public void setIdentifyWays(Long identifyWays) 
    {
        this.identifyWays = identifyWays;
    }

    public Long getIdentifyWays() 
    {
        return identifyWays;
    }
    public void setFaceLibrary(String faceLibrary) 
    {
        this.faceLibrary = faceLibrary;
    }

    public String getFaceLibrary() 
    {
        return faceLibrary;
    }
    public void setIsLiving(Long isLiving) 
    {
        this.isLiving = isLiving;
    }

    public Long getIsLiving() 
    {
        return isLiving;
    }
    public void setInfraredCamera(Long infraredCamera) 
    {
        this.infraredCamera = infraredCamera;
    }

    public Long getInfraredCamera() 
    {
        return infraredCamera;
    }
    public void setSnap(Long snap) 
    {
        this.snap = snap;
    }

    public Long getSnap() 
    {
        return snap;
    }
    public void setSimilarity(BigDecimal similarity) 
    {
        this.similarity = similarity;
    }

    public BigDecimal getSimilarity() 
    {
        return similarity;
    }
    public void setSynchronizationTime(BigDecimal synchronizationTime) 
    {
        this.synchronizationTime = synchronizationTime;
    }

    public BigDecimal getSynchronizationTime() 
    {
        return synchronizationTime;
    }
    public void setHeartbeatTime(BigDecimal heartbeatTime) 
    {
        this.heartbeatTime = heartbeatTime;
    }

    public BigDecimal getHeartbeatTime() 
    {
        return heartbeatTime;
    }
    public void setPopupWindowTime(BigDecimal popupWindowTime) 
    {
        this.popupWindowTime = popupWindowTime;
    }

    public BigDecimal getPopupWindowTime() 
    {
        return popupWindowTime;
    }
    public void setMinFace(BigDecimal minFace) 
    {
        this.minFace = minFace;
    }

    public BigDecimal getMinFace() 
    {
        return minFace;
    }
    public void setMaxFace(BigDecimal maxFace) 
    {
        this.maxFace = maxFace;
    }

    public BigDecimal getMaxFace() 
    {
        return maxFace;
    }
    public void setControllerOpeningTime(BigDecimal controllerOpeningTime) 
    {
        this.controllerOpeningTime = controllerOpeningTime;
    }

    public BigDecimal getControllerOpeningTime() 
    {
        return controllerOpeningTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("ipAddress", getIpAddress())
            .append("creatTime", getCreatTime())
            .append("isDelete", getIsDelete())
            .append("identifyWays", getIdentifyWays())
            .append("faceLibrary", getFaceLibrary())
            .append("isLiving", getIsLiving())
            .append("infraredCamera", getInfraredCamera())
            .append("snap", getSnap())
            .append("similarity", getSimilarity())
            .append("synchronizationTime", getSynchronizationTime())
            .append("heartbeatTime", getHeartbeatTime())
            .append("popupWindowTime", getPopupWindowTime())
            .append("minFace", getMinFace())
            .append("maxFace", getMaxFace())
            .append("controllerOpeningTime", getControllerOpeningTime())
            .toString();
    }
}
