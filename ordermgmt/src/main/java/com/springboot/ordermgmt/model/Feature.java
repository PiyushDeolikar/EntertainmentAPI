package com.springboot.ordermgmt.model;

public class Feature extends Title{
	
	String theatricalReleaseDate;
	String duration;
	
	
	
	public Feature() {
		super();
	}
	public Feature(String theatricalReleaseDate, String duration) {
		super();
		this.theatricalReleaseDate = theatricalReleaseDate;
		this.duration = duration;
	}
	public String getTheatricalReleaseDate() {
		return theatricalReleaseDate;
	}
	public void setTheatricalReleaseDate(String theatricalReleaseDate) {
		this.theatricalReleaseDate = theatricalReleaseDate;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}

	
}
