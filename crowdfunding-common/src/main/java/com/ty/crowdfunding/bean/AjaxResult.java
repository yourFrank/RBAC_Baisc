package com.ty.crowdfunding.bean;

/**
 * @Description TODO
 * @Author 71042
 * @Date 2019/9/20 11:38
 */
public class AjaxResult {
    private boolean success;
    private Object data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
