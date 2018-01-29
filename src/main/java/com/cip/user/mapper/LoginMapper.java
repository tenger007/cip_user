package com.cip.user.mapper;

import java.util.List;
import java.util.Map;

import com.cip.user.bean.Administrator;
import com.cip.user.bean.Permission;
import com.cip.user.bean.User;

public interface LoginMapper {

	User select_user(User user);

	Administrator select_administrator(Administrator administrator);

	List<Permission> queryAdPermissions(String ad_uuid);

	List<Permission> queryAll();

	User getUser(Map<String, Object> paramMap);

}
