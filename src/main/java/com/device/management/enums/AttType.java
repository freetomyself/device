package com.device.management.enums;

/**
 * author:WaHotDog
 * Created in Date:2018/11/25 0025下午 06:50
 */
public enum AttType {
    XST(1,"学士通"),
    HXY(2,"慧校园"),
    YXT(3,"翼校通");

    private int state;
    private String message;

    AttType(int state, String message) {
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
        for (AttType attType : AttType.values()) {
            if (attType.getState() == state)
                return attType.getMessage();
        }
        return "";
    }

}
