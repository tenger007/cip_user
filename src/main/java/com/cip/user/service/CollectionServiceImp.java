package com.cip.user.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.cip.user.bean.Datas;
import com.cip.user.bean.User;
import com.cip.user.bean.User_collection;
import com.cip.user.bean.User_pay;
import com.cip.user.bean.User_subscription;
import com.cip.user.mapper.CollectionMapper;
import com.cip.user.mapper.RegistMapper;
import com.cip.user.mapper.SubscriptionMapper;
import com.cip.user.util.StringUtil;
import com.cip.user.util.SubscriptUtil;
import com.mysql.fabric.xmlrpc.base.Data;

public class CollectionServiceImp implements CollectionServiceInf {
  @Autowired
  CollectionMapper collectionMapper;

@Override
public void insert_into_collection(User_collection user_collection) {
	collectionMapper.insert_into_collection(user_collection);
}

@Override
public List<User_collection> get_all_collection_by_userUuid(String uuid,int start,int size) {
	return collectionMapper.get_all_collection_by_userUuid(uuid,start,size);
}

@Override
public void delete_collection_by_userUuid_articleUuid(String userUuid, String articleUuid) {
	collectionMapper.delete_collection_by_userUuid_articleUuid(userUuid,articleUuid);
}

@Override
public String query_uuid_by_userUuid_articleUuid(String userUuid, String articleUuid) {
	return collectionMapper.query_uuid_by_userUuid_articleUuid(userUuid,articleUuid);
}

@Override
public int get_count_coolection_by_userUuid(String uuid) {
	return collectionMapper.get_count_coolection_by_userUuid(uuid);
}
  
  
}
