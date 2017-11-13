package com.cip.user.bean;

import java.util.ArrayList;
import java.util.List;

import com.cip.user.bean.Permission;

public class Permission {
  private int  id;
  private String name;
  private String url;
  private String icon;
  private int pid;
  private List<Permission> children = new ArrayList<Permission>();
  private boolean open = true;
  private boolean checked = false;
	
  
  
public List<Permission> getChildren() {
	return children;
}
public void setChildren(List<Permission> children) {
	this.children = children;
}
public boolean isOpen() {
	return open;
}
public void setOpen(boolean open) {
	this.open = open;
}
public boolean isChecked() {
	return checked;
}
public void setChecked(boolean checked) {
	this.checked = checked;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getIcon() {
	return icon;
}
public void setIcon(String icon) {
	this.icon = icon;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}

  
}
