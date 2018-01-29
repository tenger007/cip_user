package com.cip.user.mapper;

import java.util.List;
import java.util.Map;

import com.cip.user.bean.Datas;
import com.cip.user.bean.User;
import com.cip.user.bean.User_pay;
import com.cip.user.bean.User_subscription;

public interface SubscriptionMapper {

	List<String> get_labelName_by_userUuid(String uuid);

	List<String> get_columnName_by_labelName_userUuid(String labelName,String uuid);

	void insert_into_user_script(User_subscription user_subscription);

	String get_payInfo_by_userUuid_payTypeUuid(Map<String, Object> param);

	void insert_into_user_pays(List<User_pay> user_pays);
}
