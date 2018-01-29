package com.cip.user.service;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.cip.user.bean.User_collection;
import com.cip.user.bean.User_pay;


@WebService
public interface CollectionServiceInf {
	//添加收藏
	void insert_into_collection(User_collection user_collection);
	
	//查看用户收藏的各类文献按时间倒排序并分页
	List<User_collection> get_all_collection_by_userUuid(String uuid, int start, int size);
	int get_count_coolection_by_userUuid(String uuid);
	
	//取消收藏，将数据删除
	void delete_collection_by_userUuid_articleUuid(String userUuid,String articleUuid);
	
	//根据user_uuid和article_uuid判断文献是否被收藏
	String query_uuid_by_userUuid_articleUuid(String userUuid,String articleUuid);
}
