package com.cip.user.bean;

import java.util.Date;

public class User {
  private String uuid;
  private String name;
  private String password;
  private String email;
  private String activation_code;
  private int status;
  private String regist_time;
  private Date activation_time;
  
public String getActivation_code() {
	return activation_code;
}
public void setActivation_code(String activation_code) {
	this.activation_code = activation_code;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public String getRegist_time() {
	return regist_time;
}
public void setRegist_time(String regist_time) {
	this.regist_time = regist_time;
}
public Date getActivation_time() {
	return activation_time;
}
public void setActivation_time(Date activation_time) {
	this.activation_time = activation_time;
}
public String getUuid() {
	return uuid;
}
public void setUuid(String uuid) {
	this.uuid = uuid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
  
  
}
