package com.cip.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cip.user.bean.Administrator;
import com.cip.user.bean.Permission;
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

	@Override
	public Administrator doLogin(Administrator administrator) {
		Administrator select_administrator = loginMapper.select_administrator(administrator);
		return select_administrator;
	}

	@Override
	public List<Permission> queryAdPermissions(String ad_uuid) {
		return loginMapper.queryAdPermissions(ad_uuid);
	}

	@Override
	public List<Permission> queryAll() {
		return loginMapper.queryAll();
	}

}
