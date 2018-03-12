package com.springboot.ordermgmt.model;

public class Episode extends Title{

	String releaseDate;
	String parentTitle;
	String duration;
	
	
	
	public Episode() {
		super();
	}
	public Episode(String releaseDate, String parentTitle, String duration) {
		super();
		this.releaseDate = releaseDate;
		this.parentTitle = parentTitle;
		this.duration = duration;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
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
