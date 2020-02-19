package com.accp.dao.chengjun;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.chengjun.User;

public interface IUserDao {
	
	public User queryUserWithRole(@Param("userName")String userName,@Param("userPwd")String userPwd);
	
}
