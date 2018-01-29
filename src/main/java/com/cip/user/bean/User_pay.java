package com.cip.user.bean;

import java.math.BigDecimal;

public class User_pay {
private String uuid;
private String user_id;
private String pay_time;
private BigDecimal pay_amount;// 售价
private String pay_type;
private String pay_type_uuid;


public String getPay_time() {
	return pay_time;
}
public void setPay_time(String pay_time) {
	this.pay_time = pay_time;
}
public String getUuid() {
	return uuid;
}
public void setUuid(String uuid) {
	this.uuid = uuid;
}
public String getUser_id() {
	return user_id;
}
public void setUser_id(String user_id) {
	this.user_id = user_id;
}
public BigDecimal getPay_amount() {
	return pay_amount;
}
public void setPay_amount(BigDecimal pay_amount) {
	this.pay_amount = pay_amount;
}
public String getPay_type() {
	return pay_type;
}
public void setPay_type(String pay_type) {
	this.pay_type = pay_type;
}
public String getPay_type_uuid() {
	return pay_type_uuid;
}
public void setPay_type_uuid(String pay_type_uuid) {
	this.pay_type_uuid = pay_type_uuid;
}


}
