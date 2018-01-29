package com.cip.user.service;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.cip.user.bean.User_pay;


@WebService
public interface SubscriptionServiceInf {
	//获取用户uuid个人订阅的目录
	List<String> get_labelName_by_userUuid(String uuid);
		
	//根据目录来查找栏目
	List<String> get_columnName_by_labelName_userUuid(String labelName,String userUuid);

	//添加用户订阅
	void insert_into_user_script(String creatUUID, String select1, String select2);

	//查询用户的购买信息
	String get_payInfo_by_userUuid_payTypeUuid(Map<String, Object> param);
	
	//添加用户购买记录
	void insert_into_user_pays(List<User_pay> user_pays);
}
