package com.cip.user.mapper;

import java.util.List;
import java.util.Map;

import com.cip.user.bean.Datas;
import com.cip.user.bean.User;
import com.cip.user.bean.User_collection;
import com.cip.user.bean.User_pay;
import com.cip.user.bean.User_search;
import com.cip.user.bean.User_subscription;

public interface SearchMapper {

	void insert_into_search(User_search user_search);

	List<User_search> query_user_search(Map<String, Object> params);

	int query_count_user_search(Map<String, Object> params);
}
