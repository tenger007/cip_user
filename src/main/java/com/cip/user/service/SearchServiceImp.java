package com.cip.user.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.cip.user.bean.Datas;
import com.cip.user.bean.User;
import com.cip.user.bean.User_collection;
import com.cip.user.bean.User_pay;
import com.cip.user.bean.User_search;
import com.cip.user.bean.User_subscription;
import com.cip.user.mapper.CollectionMapper;
import com.cip.user.mapper.RegistMapper;
import com.cip.user.mapper.SearchMapper;
import com.cip.user.mapper.SubscriptionMapper;
import com.cip.user.util.StringUtil;
import com.cip.user.util.SubscriptUtil;
import com.mysql.fabric.xmlrpc.base.Data;

public class SearchServiceImp implements SearchServiceInf {
  @Autowired
  SearchMapper searchMapper;

@Override
public void insert_into_search(User_search user_search) {
	 searchMapper.insert_into_search(user_search);
}

@Override
public List<User_search> query_user_search(Map<String, Object> params) {
	return searchMapper.query_user_search(params);
}

@Override
public int query_count_user_search(Map<String, Object> params) {
	return searchMapper.query_count_user_search(params);
}
  
  
}
