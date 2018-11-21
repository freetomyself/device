package com.device.management.po;

import java.util.Date;

public class SzAttendanceYXT {
    private String clintId;

    private String schoolId;

    private String name;

    private String ip;

    private String phone;

    private String position;

    private String version;

    private Integer isconnection;

    private String config;

    private Date intime;

    private String password;

    private String minitorinfo;

    private Date lastloginTime;

    private Integer state;

    private String boxNum;

    private Integer appconnectstate;

    private Integer iskaoqin;

    public String getClintId() {
        return clintId;
    }

    public void setClintId(String clintId) {
        this.clintId = clintId == null ? null : clintId.trim();
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId == null ? null : schoolId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public Integer getIsconnection() {
        return isconnection;
    }

    public void setIsconnection(Integer isconnection) {
        this.isconnection = isconnection;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config == null ? null : config.trim();
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getMinitorinfo() {
        return minitorinfo;
    }

    public void setMinitorinfo(String minitorinfo) {
        this.minitorinfo = minitorinfo == null ? null : minitorinfo.trim();
    }

    public Date getLastloginTime() {
        return lastloginTime;
    }

    public void setLastloginTime(Date lastloginTime) {
        this.lastloginTime = lastloginTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getBoxNum() {
        return boxNum;
    }

    public void setBoxNum(String boxNum) {
        this.boxNum = boxNum == null ? null : boxNum.trim();
    }

    public Integer getAppconnectstate() {
        return appconnectstate;
    }

    public void setAppconnectstate(Integer appconnectstate) {
        this.appconnectstate = appconnectstate;
    }

    public Integer getIskaoqin() {
        return iskaoqin;
    }

    public void setIskaoqin(Integer iskaoqin) {
        this.iskaoqin = iskaoqin;
    }
}