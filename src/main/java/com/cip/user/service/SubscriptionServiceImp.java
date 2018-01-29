package com.cip.user.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.cip.user.bean.Datas;
import com.cip.user.bean.User;
import com.cip.user.bean.User_pay;
import com.cip.user.bean.User_subscription;
import com.cip.user.mapper.RegistMapper;
import com.cip.user.mapper.SubscriptionMapper;
import com.cip.user.util.StringUtil;
import com.cip.user.util.SubscriptUtil;
import com.mysql.fabric.xmlrpc.base.Data;

public class SubscriptionServiceImp implements SubscriptionServiceInf {
  @Autowired
  SubscriptionMapper subscriptionMapper;
	
	@Override
	public List<String> get_labelName_by_userUuid(String uuid) {
		
		return subscriptionMapper.get_labelName_by_userUuid(uuid);
	}

	@Override
	public List<String> get_columnName_by_labelName_userUuid(String labelName, String userUuid) {
		return subscriptionMapper.get_columnName_by_labelName_userUuid(labelName,userUuid);
	}

	@Override
	public void insert_into_user_script(String creatUUID, String select1, String select2) {
		String[] s1 = select1.split(";");
		//List<Datas> datas =new ArrayList<Datas>();
		String[] s2 = select2.split(";");
		for (String s3 : s2) {
			
			if(StringUtil.isNotEmpty(s3)){
				int j = SubscriptUtil.get_orderNum_by_labelName(s3);
				for (String s4 : s1) {
					User_subscription user_subscription = new User_subscription();
					if(StringUtil.isNotEmpty(s4)){
						user_subscription.setUuid(StringUtil.creatUUID());
						user_subscription.setUser_uuid(creatUUID);
						user_subscription.setLabel(s3);
						user_subscription.setOrder1_num(j);
						user_subscription.setSection(s4);
						int i = SubscriptUtil.get_orderNum_by_sectionName(s4);
						user_subscription.setOrder2_num(i);
						subscriptionMapper.insert_into_user_script(user_subscription);
					}
				}
			}
			}
		}

	@Override
	public String get_payInfo_by_userUuid_payTypeUuid(Map<String, Object> param) {
		return subscriptionMapper.get_payInfo_by_userUuid_payTypeUuid(param);
	}

	@Override
	public void insert_into_user_pays(List<User_pay> user_pays) {
		subscriptionMapper.insert_into_user_pays(user_pays);
	}

	}

