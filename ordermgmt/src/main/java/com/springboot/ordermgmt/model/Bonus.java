package com.springboot.ordermgmt.model;

public class Bonus extends Title {
	
	String parentTitle;
	String duration;
	
	
	
	public Bonus() {
		super();
	}
	public Bonus(String parentTitle, String duration) {
		super();
		this.parentTitle = parentTitle;
		this.duration = duration;
	}
	public String getParentTitle() {
		return parentTitle;
	}
	public void setParentTitle(String parentTitle) {
		this.parentTitle = parentTitle;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
}
