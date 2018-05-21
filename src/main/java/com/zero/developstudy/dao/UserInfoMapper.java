/**
 * FileName: UserInfoMapper
 * Author:   Administrator
 * Date:     2018/5/13 11:44
 */
package com.zero.developstudy.dao;

import com.zero.developstudy.pojo.po.UserInfoPO;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {
    UserInfoPO selectById(@Param("id") Integer id);
}
