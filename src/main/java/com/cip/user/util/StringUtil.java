package com.cip.user.util;

import java.util.StringTokenizer;
import java.util.UUID;

public class StringUtil {
	
	public static void main(String[] args) {
	String s1 = "AND NOT 大气 AND NOT 水 AND NOT 固废 AND NOT 垃圾 AND NOT 土壤";
		String[] s2 = s1.split("AND NOT");
	String s3 = "水";
	int i = 0;
		/*String a=" ";
		System.out.println(a.trim()+1);*/
		/*char arr[] ={73,32,76,79,86,69,32,85};    
		System.out.println(arr);*/
		/*int you = 1;
		int i = 2;
		int love = Integer.parseInt(Integer.toBinaryString(you),2)+Integer.parseInt(Integer.toBinaryString(i),2);
		System.out.println(love);*/
		/*for (int i = 0; i < 3; i++) {
			System.out.println(creatUUID());
		}*/
		
		}

	public static String creatUUID(){
		UUID uuid = java.util.UUID.randomUUID();
		String temp = uuid.toString();
		//System.out.println(temp);
		StringTokenizer token = new StringTokenizer(temp,"-");
		StringBuilder rst = new StringBuilder("");
		while(token.hasMoreTokens()){
			rst.append(token.nextToken());
		}
		//System.out.println(rst.toString());
		return rst.toString();
	}

	public static boolean isEmpty( String s ) {
		// java中trim方法不能去掉全角空格
		return s == null || s.trim().equals("");
	}
	
	public static boolean isNotEmpty( String s ) {
//		return s != null && !s.trim().equals("");
		return !isEmpty(s);
	}
	
}
