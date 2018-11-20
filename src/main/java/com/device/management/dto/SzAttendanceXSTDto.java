package com.device.management.dto;

import com.device.management.po.SzAttendanceXST;

import java.util.Date;

public class SzAttendanceXSTDto {


    private String ip;
    private String clintId;
    private String position;
    private  String schoolName;
    private Integer state;
    private String version;
    private Date lastloginTime;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
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


    public SzAttendanceXSTDto() {

    }

    public SzAttendanceXSTDto(SzAttendanceXST szAttendance) {
        this.version = szAttendance.getVersion();
        this.lastloginTime = szAttendance.getLastloginTime();
        this.position = szAttendance.getName();
        this.state = szAttendance.getState();
        this.clintId = szAttendance.getClintId();
        this.ip = szAttendance.getIp();

        /* if (!StrinhUtile.isEmpty(szAttendance.getLastloginTime()))
            this.createTime = szAttendance*/
    }


}
