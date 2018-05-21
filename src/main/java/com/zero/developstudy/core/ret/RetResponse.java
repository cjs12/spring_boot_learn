/**
 * FileName: RetResponse
 * Author:   Administrator
 * Date:     2018/5/20 17:05
 */
package com.zero.developstudy.core.ret;

import com.zero.developstudy.enums.RetCodeEnum;

public class RetResponse {

    private final static String SUCCESS ="success";

    public static <T> RetResult<T> makeOKRsp() {
        return new RetResult<T>().setCode(RetCodeEnum.SUCCESS).setMsg(SUCCESS);
    }

    public static <T> RetResult<T> makeOKRsp(T data) {
        return new RetResult<T>().setData(data).setCode(RetCodeEnum.SUCCESS).setMsg(SUCCESS);
    }

}
