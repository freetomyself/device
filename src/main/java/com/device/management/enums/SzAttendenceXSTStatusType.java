package com.device.management.enums;

public enum SzAttendenceXSTStatusType {
    UNLINE(0,"掉线"),
    ONLINE(1,"在线");

    private int state;
    private String message;
    SzAttendenceXSTStatusType(int state, String message) {
        this.state = state;
        this.message = message;
    }
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public static String getNameByType(int state) {
        for (SzAttendenceXSTStatusType szAttendenceStatusType : SzAttendenceXSTStatusType.values()) {
            if (szAttendenceStatusType.getState() == state)
                return szAttendenceStatusType.getMessage();
        }
        return "";
    }

}
