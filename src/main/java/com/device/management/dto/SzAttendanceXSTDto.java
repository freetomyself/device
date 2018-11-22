package com.device.management.dto;

import com.device.management.po.SzAttendanceXST;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SzAttendanceXSTDto {

    @Override
    public String toString() {
        return "SzAttendanceXSTDto{" +
                "ip='" + ip + '\'' +
                ", clintId='" + clintId + '\'' +
                ", position='" + position + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", state=" + state +
                ", version='" + version + '\'' +
                ", type='" + type + '\'' +
                ", lastlogintime='" + lastloginTime + '\'' +
                '}';
    }

    private String ip;
    private String clintId;
    private String position;
    private  String schoolName;
    private Integer state;
    private String version;

    public String getLastlogintime() {
        return lastloginTime;
    }

    public void setLastlogintime(String lastlogintime) {
        this.lastloginTime = lastlogintime;
    }

    //private Date lastloginTime;
    private String type;
    private String lastloginTime;

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

/*
    public Date getLastloginTime() {
        return lastloginTime;
    }

    public void setLastloginTime(Date lastloginTime) {
        this.lastloginTime = lastloginTime;
    }

*/

    public SzAttendanceXSTDto() {

    }

    public SzAttendanceXSTDto(SzAttendanceXST szAttendance) {
        this.version = szAttendance.getVersion();
        this.lastloginTime = String.valueOf(szAttendance.getLastloginTime());
        this.position = szAttendance.getName();
        this.state = szAttendance.getState();
        this.clintId = szAttendance.getClintId();
        this.ip = szAttendance.getIp();

    }

    public static Date stampToDate(Date s) throws ParseException {
        Date res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        res = simpleDateFormat.parse(String.valueOf(s));
        return res;
    }

}
