/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserInfoPO
 * Author:   Administrator
 * Date:     2018/5/13 10:42
 */
package com.zero.developstudy.pojo.po;

public class UserInfoPO {

    private Integer id;
    private String userName;

    public UserInfoPO() {
    }

    @Override
    public String toString() {
        return "UserInfoPO{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
