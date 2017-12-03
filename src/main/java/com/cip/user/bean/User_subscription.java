package com.cip.user.bean;

public class User_subscription {
 private String uuid;
 private String updatetime;
 private String keyword;
 private String section;
 private String label;
 private int order1_num;
 private int order2_num;
 private String user_uuid;
 
 
public String getUser_uuid() {
	return user_uuid;
}
public void setUser_uuid(String user_uuid) {
	this.user_uuid = user_uuid;
}
public int getOrder1_num() {
	return order1_num;
}
public void setOrder1_num(int order1_num) {
	this.order1_num = order1_num;
}
public int getOrder2_num() {
	return order2_num;
}
public void setOrder2_num(int order2_num) {
	this.order2_num = order2_num;
}
public String getUuid() {
	return uuid;
}
public void setUuid(String uuid) {
	this.uuid = uuid;
}

public String getSection() {
	return section;
}
public void setSection(String section) {
	this.section = section;
}
public String getLabel() {
	return label;
}
public void setLabel(String label) {
	this.label = label;
}
public String getUpdatetime() {
	return updatetime;
}
public void setUpdatetime(String updatetime) {
	this.updatetime = updatetime;
}
public String getKeyword() {
	return keyword;
}
public void setKeyword(String keyword) {
	this.keyword = keyword;
}
 
}
