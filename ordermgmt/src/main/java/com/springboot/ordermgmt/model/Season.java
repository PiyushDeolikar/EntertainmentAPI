package com.springboot.ordermgmt.model;

import java.util.ArrayList;
import java.util.List;

public class Season extends Title{

	String releaseDate;
	String parentTitle;
	List<Episode> episodes = new ArrayList<>();
	
	
	
	
	public Season() {
		super();
	}
	public Season(String releaseDate, String parentTitle, List<Episode> episodes) {
		super();
		this.releaseDate = releaseDate;
		this.parentTitle = parentTitle;
		this.episodes = episodes;
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
	public List<Episode> getEpisodes() {
		return episodes;
	}
	public void setEpisodes(List<Episode> episodes) {
		this.episodes = episodes;
	}
	
	
}
