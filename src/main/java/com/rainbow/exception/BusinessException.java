package com.rainbow.exception;

/**
 * Created by rainbow on 2016/9/14.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
public class BusinessException extends Exception {

    //异常代码
    private String errCode;

    //异常信息
    private String errMessage;

    //构造方法
    public BusinessException() {
        super();
    }

    public BusinessException(String errMessage) {
        super(errMessage);
    }

    public BusinessException(String errCode, Throwable cause) {
        super(errCode, cause);
    }

    public BusinessException(String errCode, String errMessage) {
        super(errMessage);
        this.errCode = errCode;
        this.errMessage = errMessage;
    }

    public static BusinessException paraseException(Exception e) {
        if (e instanceof BusinessException) {
            return (BusinessException) e;
        }
        Throwable throwable = e.getCause();
        if (throwable instanceof BusinessException) {
            return (BusinessException) throwable;
        }
        try {
            return new BusinessException(e.getMessage());
        } catch (Exception e1) {
            return new BusinessException("未知异常");
        }
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }

    public void printStackTrace() {
        super.printStackTrace();
        System.out.println(this.errMessage);
    }
}
