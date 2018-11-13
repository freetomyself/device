package com.device.management.dto;

import com.device.management.po.SzAttendance;

import java.util.Date;

public class SzAttendanceDto {

    private String name;
    private Integer schoolId;
    private Integer state;
    private String clintId;
    private String ip;
    private Date createTime;

    public SzAttendanceDto(){

    }

    public SzAttendanceDto(SzAttendance szAttendance){
        this.name = szAttendance.getName();
       this.schoolId = szAttendance.getSchoolId();
       this.state =szAttendance.getState();
       this.clintId = szAttendance.getClintId();
       this.ip = szAttendance.getIp();
       /* if (!StrinhUtile.isEmpty(szAttendance.getLastloginTime()))
            this.createTime = szAttendance*/
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getClintId() {
        return clintId;
    }

    public void setClintId(String clintId) {
        this.clintId = clintId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
