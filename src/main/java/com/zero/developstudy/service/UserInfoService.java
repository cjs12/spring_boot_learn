/**
 * FileName: UserInfoService
 * Author:   Administrator
 * Date:     2018/5/13 11:46
 */
package com.zero.developstudy.service;

import com.zero.developstudy.dao.UserInfoMapper;
import com.zero.developstudy.pojo.po.UserInfoPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public UserInfoPO selectById(Integer id) {
        return userInfoMapper.selectById(id);
    }
}
