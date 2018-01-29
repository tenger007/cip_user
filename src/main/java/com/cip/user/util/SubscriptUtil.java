package com.cip.user.util;

public class SubscriptUtil {
   public static int get_orderNum_by_sectionName(String sectionName){
	   int i = 0;
	   switch (sectionName) {
	case "图书":
		i=1;
		break;
	case "课件":
		i=2;
		break;
	case "案例":
		i=3;
		break;
	case "图片":
		i=4;
		break;
	case "新闻资讯":
		i=5;
		break;
	case "科普专题":
		i=6;
		break;
	case "培训材料":
		i=7;
		break;
	case "设备":
		i=8;
		break;
	case "期刊":
		i=9;
		break;
	case "论文":
		i=10;
		break;
	case "标准":
		i=11;
		break;
	case "法规":
		i=12;
		break;
	case "中文专利":
		i=13;
		break;
	case "全球专利":
		i=14;
		break;
	case "专家":
		i=15;
		break;
	case "企业":
		i=16;
		break;
	case "视频":
		i=17;
		break;
	default:
		i=0;
		break;
	}
	   return i;
   }
   public static int get_orderNum_by_labelName(String labelName){
	   int i = 0;
	   switch (labelName) {
	   case "水环境":
		   i=1;
		   break;
	   case "大气环境":
		   i=2;
		   break;
	   case "固体废物与环境":
		   i=4;
		   break;
	   case "土壤环境":
		   i=3;
		   break;
	   case "生态环境":
		   i=5;
		   break;
	   case "环境管理":
		   i=6;
		   break;
	   case "环境影响评价":
		   i=7;
		   break;
	   case "环境规划":
		   i=8;
		   break;
	   case "环境检测":
		   i=9;
		   break;
	   case "其他":
		   i=10;
		   break;
	   default:
		   i=0;
		   break;
	   }
	   return i;
   }
}
