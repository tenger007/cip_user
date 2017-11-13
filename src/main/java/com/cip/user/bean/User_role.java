package com.cip.user.bean;

import org.springframework.http.StreamingHttpOutputMessage;

public class User_role {
  private String uuid;
  private String user_uuid;
  private String role_uuid;
public String getUuid() {
	return uuid;
}
public void setUuid(String uuid) {
	this.uuid = uuid;
}
public String getUser_uuid() {
	return user_uuid;
}
public void setUser_uuid(String user_uuid) {
	this.user_uuid = user_uuid;
}
public String getRole_uuid() {
	return role_uuid;
}
public void setRole_uuid(String role_uuid) {
	this.role_uuid = role_uuid;
}
  
}
