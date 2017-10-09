package com.cip.user.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cip.user.bean.User;
import com.cip.user.mapper.LoginMapper;

public class LoginServiceImp implements LoginServiceInf {

	@Autowired
	LoginMapper loginMapper;

	@Override
	public User login(User user) {

		User select_user = loginMapper.select_user(user);

		return select_user;
	}

}
