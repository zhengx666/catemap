package org.seckill.dto;

import org.seckill.entity.Seckill;

/**
 * Created by zheng on 2016/6/20.
 */
public class CatemapResult<T> {
    private boolean success;

    private T data;

    private String error;

    public CatemapResult(boolean success, T data){
        this.success = success;
        this.data = data;
    }

    public CatemapResult(boolean success, String error){
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
