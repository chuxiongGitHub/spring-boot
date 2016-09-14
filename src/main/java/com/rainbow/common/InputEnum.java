package com.rainbow.common;

/**
 * Created by rainbow on 2016/9/14.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
public enum InputEnum {
    YES(1, "是"),
    NO(-1, "否");

    private int status;
    private String statusInfo;

    InputEnum(int status, String statusInfo) {
        this.status = status;
        this.statusInfo = statusInfo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusInfo() {
        return statusInfo;
    }

    public void setStatusInfo(String statusInfo) {
        this.statusInfo = statusInfo;
    }

    public static InputEnum statusOf(int index) {
        for (InputEnum status : values()) {
            if (status.getStatus() == index) {
                return status;
            }
        }
        return null;
    }
}
