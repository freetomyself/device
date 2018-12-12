package com.device.management.dto;

import com.device.management.po.SzAttendanceHXY;
import com.device.management.po.SzAttendanceXST;

import java.util.Date;

public class SzAttendanceHXYDto {

    @Override
    public String toString() {
        return "SzAttendanceHXYDto{" +
                "ip='" + ip + '\'' +
                ", clintId='" + clintId + '\'' +
                ", position='" + position + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", state=" + state +
                ", version='" + version + '\'' +
                ", lastloginTime='" + lastloginTime + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    private String ip;
    private String clintId;
    private String position;
    private String schoolName;
    /*private String isConnection;*/
    private String version;
    private String lastloginTime;
    private String type;
    private String state;

   /* public String getIsConnection() {
        return isConnection;
    }

    public void setIsConnection(String isConnection) {
        this.isConnection = isConnection;
    }*/

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLastloginTime() {
        return lastloginTime;
    }

    public void setLastloginTime(String lastloginTime) {
        this.lastloginTime = lastloginTime;
    }

    SzAttendanceHXYDto(){}
    public SzAttendanceHXYDto(SzAttendanceHXY szAttendance) {
        this.version = szAttendance.getVersion();
        this.lastloginTime = String.valueOf(szAttendance.getLastloginTime());
        this.position = szAttendance.getName();
        /*this.isConnection = String.valueOf(szAttendance.getIsconnection());*/
        this.clintId = szAttendance.getClintId();
        this.ip = szAttendance.getIp();

        /* if (!StrinhUtile.isEmpty(szAttendance.getLastloginTime()))
            this.createTime = szAttendance*/
    }


}
