package com.cip.user.service;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.cip.user.bean.User_collection;
import com.cip.user.bean.User_pay;
import com.cip.user.bean.User_search;


@WebService
public interface SearchServiceInf {
	//用户登录搜索后添加搜索结果
	void insert_into_search(User_search user_search);
	
	//查询用户的历史搜索结果分页
	List<User_search>  query_user_search(Map<String, Object> params);
	
	//查询用户的历史搜索结果总个数
	int query_count_user_search(Map<String, Object> params);
	
}
