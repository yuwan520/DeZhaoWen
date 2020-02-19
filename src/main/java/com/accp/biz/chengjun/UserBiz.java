package com.accp.biz.chengjun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.chengjun.IUserDao;
import com.accp.pojo.chengjun.User;

@Service("userBiz")
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class UserBiz {

	@Autowired
	private IUserDao userDao;

	public User findUser(String userName, String userPwd) {
		return userDao.queryUserWithRole(userName, userPwd);
	}

}
