package com.cip.user.service;

import java.util.List;

import javax.jws.WebService;

import com.cip.user.bean.User;

@WebService
public interface SubscriptionServiceInf {
	//获取用户uuid个人订阅的目录
	List<String> get_labelName_by_userUuid(String uuid);
		
	//根据目录来查找栏目
	List<String> get_columnName_by_labelName_userUuid(String labelName,String userUuid);
	
	//添加用户的订阅
	void insert_into_user_script(String creatUUID, String select1, String select2);
}
