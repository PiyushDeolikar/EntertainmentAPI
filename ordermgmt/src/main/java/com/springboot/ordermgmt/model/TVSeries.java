package com.springboot.ordermgmt.model;

import java.util.ArrayList;
import java.util.List;

public class TVSeries extends Title {
	
	String releaseDate;
	List<Season> seasons = new ArrayList<>();
	
	
	
	public TVSeries() {
		super();
	}
	public TVSeries(String releaseDate, List<Season> seasons) {
		super();
		this.releaseDate = releaseDate;
		this.seasons = seasons;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public List<Season> getSeasons() {
		return seasons;
	}
	public void setSeasons(List<Season> seasons) {
		this.seasons = seasons;
	}
	
	

}
