package com.cip.user.service;

import javax.jws.WebService;

import com.cip.user.bean.User;

@WebService
public interface RegistServiceInf {
   //注册
    String regist(User user);
    
   //注册检查用户名是否重复
	String checkName(String name);
	
   //注册检查邮箱是否重复
	String checkEmail(String email);
	
	//找回密码时根据用户名和邮箱验证用户,查询uuid
    String checkUser(String email,String name);
	
    //忘记密码更改用户名密码
   void updatePassword(String uuid,String password);
    
   //根据旧密码和userid更改密码
   void updateOldPassword(String oldPassword,String newPassword,String uuid);
   
	//添加用户激活时间
	void activation(String uuid, String formatNow);
	
	//根据用户uuid查询用户
	User queryUserStatus(String uuid);
	
	//激活用户状态
	void setActivationStatus(String uuid);
}
