/**
 * FileName: UserInfoController
 * Author:   Administrator
 * Date:     2018/5/13 11:44
 */
package com.zero.developstudy.controller;

import com.zero.developstudy.core.ret.RetResponse;
import com.zero.developstudy.core.ret.RetResult;
import com.zero.developstudy.pojo.po.UserInfoPO;
import com.zero.developstudy.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("start")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/hello")
    public String Hello() {
        return "Heloo SpringBoot";
    }

    @GetMapping("/test")
    public UserInfoPO selectById(@RequestParam("id") Integer id) {
    /*    UserInfoPO userInfoPO = new UserInfoPO();
        userInfoPO.setId(1);
        userInfoPO.setUserName("cjs");
        return userInfoPO;*/
        return userInfoService.selectById(id);
    }

    @GetMapping("/selectById")
    public RetResult<UserInfoPO> userInfoPO(Integer id) {
        UserInfoPO userInfoPO = new UserInfoPO();
        userInfoPO.setUserName("name");
        userInfoPO.setId(id);
        return RetResponse.makeOKRsp(userInfoPO);
    }

}
