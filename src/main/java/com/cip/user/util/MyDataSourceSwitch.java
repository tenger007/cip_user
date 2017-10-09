package com.cip.user.util;

public class MyDataSourceSwitch {

	private static ThreadLocal<String> key = new ThreadLocal<String>();
	public static String getKey() {
		return key.get();
	}
	public static void setKey(String key_in) {
		key.set(key_in);
	}

}
