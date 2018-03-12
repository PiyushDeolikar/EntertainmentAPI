package com.springboot.ordermgmt.model;

import java.util.ArrayList;
import java.util.List;

public class Title {
	
	String type;
	String name;
	String description;
	List<Bonus> bonuses = new ArrayList<>();
	
	
	
	public Title() {
		super();
	}
	public Title(String type, String name, String description, List<Bonus> bonuses) {
		super();
		this.type = type;
		this.name = name;
		this.description = description;
		this.bonuses = bonuses;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Bonus> getBonuses() {
		return bonuses;
	}
	public void setBonuses(List<Bonus> bonuses) {
		this.bonuses = bonuses;
	}
	
}
