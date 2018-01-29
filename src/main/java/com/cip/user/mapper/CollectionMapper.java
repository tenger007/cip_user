package com.cip.user.mapper;

import java.util.List;
import java.util.Map;

import com.cip.user.bean.Datas;
import com.cip.user.bean.User;
import com.cip.user.bean.User_collection;
import com.cip.user.bean.User_pay;
import com.cip.user.bean.User_subscription;

public interface CollectionMapper {

	void insert_into_collection(User_collection user_collection);

	List<User_collection> get_all_collection_by_userUuid(String uuid, int start, int size);

	void delete_collection_by_userUuid_articleUuid(String userUuid, String articleUuid);

	String query_uuid_by_userUuid_articleUuid(String userUuid, String articleUuid);

	int get_count_coolection_by_userUuid(String uuid);
}
