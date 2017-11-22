package com.cip.user.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cip.user.bean.User;
import com.cip.user.mapper.RegistMapper;

public class RegistServiceImp implements RegistServiceInf {

	@Autowired
	RegistMapper userMapper;

	@Override
	public String regist(User user) {
		if(null==userMapper.checkName(user.getName())){
		userMapper.insert_user(user);
		return "success";
		}
		return "fail";
	}

	
	@Override
	public String checkName(String name) {
	  return  userMapper.checkName(name);	
	}
	@Override
	public void activation(String uuid, String formatNow) {
		userMapper.activation(uuid,formatNow);
	}
	@Override
	public User queryUserStatus(String uuid) {
		return  userMapper.queryUserStatus(uuid);
	}

	@Override
	public void setActivationStatus(String uuid) {
		userMapper.setActivationStatus(uuid);	
	}


	@Override
	public String checkEmail(String email) {
		return userMapper.checkEmail(email);
	}


	@Override
	public String checkUser(String email, String name) {
		return userMapper.checkUser(email,name);
	}


	@Override
	public void updatePassword(String uuid, String password) {
          userMapper.updatePassword(uuid,password);		
	}


	@Override
	public void updateOldPassword(String oldPassword, String newPassword, String uuid) {
		 userMapper.updateOldPassword(oldPassword,newPassword,uuid);
	}
}
