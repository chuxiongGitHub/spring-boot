package com.rainbow.dto;

/**
 * Created by rainbow on 2016/9/14.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
//封装返回的json结果

public class JsonResult<T> {

    //是否返回成功
    private boolean success;

    //返回的数据（泛型）
    private T data;

    //返回错误时的错误消息
    private String error;

    /**
     * 构造方法
     */
    //返回正确时
    public JsonResult(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    //返回错误时
    public JsonResult(boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
