package com.ruoyi.project.door.domain.bo;

import javax.xml.crypto.Data;

/**
 * 查询每个小时的识别人数
 */
public class DoorOpenRecordBo {

    private String startDate;

    private String endDate;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
