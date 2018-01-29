package com.cip.user.service;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.cip.user.bean.Administrator;
import com.cip.user.bean.Permission;
import com.cip.user.bean.User;

@WebService
public interface LoginServiceInf {

   //用户登录
	User login(User user);

	//管理员登录
	Administrator doLogin(Administrator administrator);
	
	//查询当前管理员的权限
	List<Permission> queryAdPermissions(String ad_uuid);
	
	//查询所有的权限
	List<Permission> queryAll();
	
	//查找用户
	User getUser(Map<String, Object> paramMap);
}
