package com.cip.user.util;

import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MD5Util {

	public static void main(String[] args) {
		String a = "baiducxf";

		String substring = a.substring(a.length() - 3, a.length());

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");

		String d = sdf.format(new Date());

		String s = substring + d + "wss4j";

		String md5 = md5(s);

		System.out.println(md5);
	}

	public static String md5(String string) {
		if (string == null || string.trim().length() < 1) {
			return null;
		}
		try {
			byte[] bytes = string.getBytes("iso-8859-1");
			String string2 = new String(bytes, "utf-8");
			return getMD5(string2.getBytes());
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public static String getMD5(byte[] source) {
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			StringBuffer result = new StringBuffer();
			for (byte b : md5.digest(source)) {
				result.append(Integer.toHexString((b & 0xf0) >>> 4));
				result.append(Integer.toHexString(b & 0x0f));
			}
			return result.toString();
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}
}
