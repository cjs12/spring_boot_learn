/**
 * FileName: RetResult
 * Author:   Administrator
 * Date:     2018/5/20 16:34
 */
package com.zero.developstudy.core.ret;

import com.zero.developstudy.enums.RetCodeEnum;

public class RetResult<T> {
    /**
     * 状态码
     */
    private int code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 返回数据
     */
    private T data;

    public RetResult() {
    }
/*

    public RetResult(int code) {
        this.code = code;
    }

    public RetResult(String msg) {
        this.msg = msg;
    }

    public RetResult(T data) {
        this.data = data;
    }
*/

    public int getCode() {
        return code;
    }

    public RetResult<T> setCode(RetCodeEnum retCodeEnum) {
        this.code = retCodeEnum.getCode();
        return this;
    }

    public RetResult<T> setCode(int retCode) {
        this.code = retCode;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public RetResult<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public RetResult<T> setData(T data) {
        this.data = data;
        return this;
    }
}
