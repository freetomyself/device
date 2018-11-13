package com.device.management.po;

import java.util.Date;

public class SzAttendance {
    private String clintId;

    private Integer schoolId;

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

    private String boxNum;

    private Integer state;

    private Integer clintType;

    private Integer port;

    private Integer userType;

    private Integer appconnectstate;

    private Date appconnecttime;

    private Integer iskaoqin;

    private Integer onlinetime;

    private Integer offlinetime;

    public String getClintId() {
        return clintId;
    }

    public void setClintId(String clintId) {
        this.clintId = clintId == null ? null : clintId.trim();
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

    public String getBoxNum() {
        return boxNum;
    }

    public void setBoxNum(String boxNum) {
        this.boxNum = boxNum == null ? null : boxNum.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getClintType() {
        return clintType;
    }

    public void setClintType(Integer clintType) {
        this.clintType = clintType;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getAppconnectstate() {
        return appconnectstate;
    }

    public void setAppconnectstate(Integer appconnectstate) {
        this.appconnectstate = appconnectstate;
    }

    public Date getAppconnecttime() {
        return appconnecttime;
    }

    public void setAppconnecttime(Date appconnecttime) {
        this.appconnecttime = appconnecttime;
    }

    public Integer getIskaoqin() {
        return iskaoqin;
    }

    public void setIskaoqin(Integer iskaoqin) {
        this.iskaoqin = iskaoqin;
    }

    public Integer getOnlinetime() {
        return onlinetime;
    }

    public void setOnlinetime(Integer onlinetime) {
        this.onlinetime = onlinetime;
    }

    public Integer getOfflinetime() {
        return offlinetime;
    }

    public void setOfflinetime(Integer offlinetime) {
        this.offlinetime = offlinetime;
    }
}