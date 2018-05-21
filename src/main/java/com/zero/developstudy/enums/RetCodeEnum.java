/**
 * FileName: RetCodeEnum
 * Author:   Administrator
 * Date:     2018/5/18 22:58
 */
package com.zero.developstudy.enums;

/**
 * 响应吗枚举
 */
public enum  RetCodeEnum {

    SUCCESS(200),
    FAIL(400),
    UNAUTHORIZED(401),
    NOT_FOUND(404),
    // 服务器错误
    INTERNAL_SEVER_ERROR(500);

    private int code;

    RetCodeEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
