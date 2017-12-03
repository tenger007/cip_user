package com.cip.user.bean;

import java.util.List;

public class Datas {
    private int start;
    private int end;
    private String[] keywords;	
    private String section;
    private String label;
    private int order1_num;
    private int order2_num;
    private String uuid;
    
    
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

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public String[] getKeywords() {
		return keywords;
	}

	public void setKeywords(String[] keywords) {
		this.keywords = keywords;
	}

	
   	
}
