package com.device.management.dto;

import com.device.management.po.SzAttendance;

import java.util.Date;

public class SzAttendanceDto {

    private String ip;
    private String clintId;
    private Integer schoolId;
    private String name;
    private Integer state;
    private String version;
    private Date lastloginTime;

    public SzAttendanceDto() {

    }

    public SzAttendanceDto(SzAttendance szAttendance) {
        this.name = szAttendance.getName();
        this.schoolId = szAttendance.getSchoolId();
        this.state = szAttendance.getState();
        this.clintId = szAttendance.getClintId();
        this.ip = szAttendance.getIp();

        /* if (!StrinhUtile.isEmpty(szAttendance.getLastloginTime()))
            this.createTime = szAttendance*/
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getClintId() {
        return clintId;
    }

    public void setClintId(String clintId) {
        this.clintId = clintId;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getLastloginTime() {
        return lastloginTime;
    }

    public void setLastloginTime(Date lastloginTime) {
        this.lastloginTime = lastloginTime;
    }
}
