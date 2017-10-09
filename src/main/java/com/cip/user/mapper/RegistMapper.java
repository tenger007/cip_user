package com.cip.user.mapper;

import com.cip.user.bean.User;

public interface RegistMapper {

	void insert_user(User user);

	String checkName(String name);
	
	String checkEmail(String email);
	
	void activation(String uuid, String formatNow);

	User queryUserStatus(String uuid);

	void setActivationStatus(String uuid);

	String checkUser(String email, String name);

	void updatePassword(String uuid, String password);

	void updateOldPassword(String oldPassword, String newPassword, String uuid);
}
