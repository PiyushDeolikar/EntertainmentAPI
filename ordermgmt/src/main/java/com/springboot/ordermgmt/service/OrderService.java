package com.springboot.ordermgmt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springboot.ordermgmt.model.Bonus;
import com.springboot.ordermgmt.model.Episode;
import com.springboot.ordermgmt.model.Feature;
import com.springboot.ordermgmt.model.Season;
import com.springboot.ordermgmt.model.TVSeries;
import com.springboot.ordermgmt.model.Title;

@Component
public class OrderService {

	private static List<Title> titles = new ArrayList<>();
	static {
		Bonus bonus1 = new Bonus();
		bonus1.setType("bonus");
		bonus1.setName("Breaking the Ice");
		bonus1.setDescription("Get to know frozen from the snowy ground up as the filmmakers and songwriters discuss the story's roots and inspiration; the joys of animating olaf, the little snowman with the sunny personality; and the creation of those amazing songs.");
		bonus1.setDuration("15 min");

		Bonus bonus2 = new Bonus();
		bonus2.setType("bonus");
		bonus2.setName("Deleted Scene: Meet Kristoff 2 - Introduction By Directors");
		bonus2.setDescription("Kristoff goes mountain climbing with a friend. With an introduction by directors chris buck and jennifer lee.");
		bonus2.setDuration("13 min");		
		
		Feature feat1 = new Feature();
		feat1.setType("Feature");
		feat1.setName("Frozen");
		feat1.setDescription("Animated feature. Fearless optimist, the Princess Anna, sets off on an epic journey—teaming up with rugged mountain man, Kristoff, and his loyal reindeer Sven—to find her sister Elsa, whose icy powers have trapped the kingdom of Arendelle in eternal winter.");
		feat1.setTheatricalReleaseDate("11/27/2013");
		feat1.setDuration("102 min");
		feat1.getBonuses().add(bonus1);
		feat1.getBonuses().add(bonus2);
		
		titles.add(feat1);

		Bonus bonus3 = new Bonus();
		bonus3.setType("bonus");
		bonus3.setName("Animation and Acting");
		bonus3.setDescription("The pixar animators discuss the basic nuts and bolts of transforming hunks of metal and paint into expressive, emotional characters with their own unique personalities.");
		bonus3.setDuration("12 min");

		Bonus bonus4 = new Bonus();
		bonus4.setType("bonus");
		bonus4.setName("Character Design");
		bonus4.setDescription("Lightning mcqueen, doc and the gang may be characters, but they're cars too. The filmmakers explain how getting the design right brings a character to life, and discuss the challenges of chrome, rust, and tire treads.");
		bonus4.setDuration("12 min");		
		
		Feature feat2 = new Feature();
		feat2.setType("Feature");
		feat2.setName("Cars");
		feat2.setDescription("Lightning McQueen, a hotshot rookie race car driven to succeed, discovers that life is about the journey, not the finish line, when he finds himself unexpectedly detoured in the sleepy Route 66 town of Radiator Springs.");
		feat2.setTheatricalReleaseDate("06/09/2006");
		feat2.setDuration("117 min");
		feat2.getBonuses().add(bonus3);
		feat2.getBonuses().add(bonus4);
		
		titles.add(feat2);
		
		Episode ep1 = new Episode();
		ep1.setType("Episode");
		ep1.setName("In Translation");
		ep1.setDuration("42 min");
		ep1.setReleaseDate("09/22/2004");

		Episode ep2 = new Episode();
		ep2.setType("Episode");
		ep2.setName("All the Best Cowboys Have Daddy Issues");
		ep2.setDuration("42 min");
		ep2.setReleaseDate("09/29/2004");

		Episode ep3 = new Episode();
		ep3.setType("Episode");
		ep3.setName("Born to Run");
		ep3.setDuration("41 min");
		ep3.setReleaseDate("10/06/2004");

		Season season1 = new Season();
		season1.setType("Season");
		season1.setName("Season 1");
		season1.getEpisodes().add(ep1);
		season1.getEpisodes().add(ep2);
		season1.getEpisodes().add(ep3);
		
		
		Episode ep4 = new Episode();
		ep4.setType("Episode");
		ep4.setName("And Found");
		ep4.setDuration("42 min");
		ep4.setReleaseDate("09/22/2005");

		Episode ep5 = new Episode();
		ep5.setType("Episode");
		ep5.setName("23rd Psalm, The");
		ep5.setDuration("42 min");
		ep5.setReleaseDate("09/29/2005");

		Episode ep6 = new Episode();
		ep6.setType("Episode");
		ep6.setName("What");
		ep6.setDuration("41 min");
		ep6.setReleaseDate("10/06/2005");

		Season season2 = new Season();
		season2.setType("Season");
		season2.setName("Season 2");
		season2.getEpisodes().add(ep4);
		season2.getEpisodes().add(ep5);
		season2.getEpisodes().add(ep6);

		TVSeries tv1 = new TVSeries();
		tv1.setType("TV Series");
		tv1.setName("Lost");
		tv1.setDescription("A plane crashes on a Pacific island, and the 48 survivors, stripped of everything, scavenge what they can from the plane for their survival. Some panic; some pin their hopes on rescue. The band of friends, family, enemies, and strangers must work together against the cruel weather and harsh terrain.");
		tv1.setReleaseDate("09/22/2004");
		tv1.getSeasons().add(season1);
		tv1.getSeasons().add(season2);
		
		titles.add(tv1);

		
		}
	
		
	public List<Title> retrieveAllTitles(){
		
		return titles;
	}
	
	public List<Title> retrieveAllTvSeries(){
		List<Title> tvSeries = new ArrayList<Title>();
		try {
			
			
			for(Title title: titles){
				
				if(title.getType().equalsIgnoreCase("TV Series")){
					tvSeries.add(title);
				}
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return tvSeries; 
	}
	
	public List<Title> retrieveAllFeatures(){
		List<Title> features = new ArrayList<Title>();
		
		try {
			for(Title title: titles){
				
				if(title.getType().equalsIgnoreCase("Feature")){
					features.add(title);
				}
			}
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		return features; 
	}
	
	public List<Title> retrieveAllBonuses(){
		List<Title> bonuses = new ArrayList<Title>();
		
		try {
			for(Title title: titles){
				
				if(null!=title.getBonuses()){
					List<Bonus> bonusesTitle = new ArrayList<Bonus>();
					bonusesTitle = title.getBonuses();
					bonuses.addAll(bonusesTitle);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bonuses; 
	}
	
	public List<Title> retrieveAllSeasons(){
		List<Title> seasons = new ArrayList<Title>();
		
		try {
			for(Title title: titles){
				
				if(title.getType().equalsIgnoreCase("TV Series")){
					TVSeries tv = (TVSeries)title;
					if(null != tv.getSeasons()){
						seasons.addAll(tv.getSeasons());
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return seasons; 
	}
	
	
	public List<Title> retrieveAllEpisodes(){
		List<Title> episodes = new ArrayList<Title>();
		
		try {
			for(Title title: titles){
				
				if(title.getType().equalsIgnoreCase("TV Series")){
					TVSeries tv = (TVSeries)title;
					if(null != tv.getSeasons()){
						List<Season> seasons = tv.getSeasons();
						for(Season season :seasons){
							if(null != season.getEpisodes()){
								episodes.addAll(season.getEpisodes());
							}
						}
						
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return episodes; 
	}
	
	
	public List<Title> retrieveAllTitlesByName(String name){
		List<Title> allTitles = new ArrayList<Title>();
		try {
			for(Title title: titles){
				if(title.getName().equalsIgnoreCase(name)){
					allTitles.add(title);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return allTitles;
	}
	
	public List<Title> retrieveAllTvSeriesByName(String name){
		List<Title> tvSeries = new ArrayList<Title>();
		
		try {
			for(Title title: titles){
				
				if(title.getType().equalsIgnoreCase("TV Series")){
					if(title.getName().equalsIgnoreCase(name)){
						tvSeries.add(title);
					}
				
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tvSeries; 
	}
	
	public List<Title> retrieveAllFeaturesByName(String name){
		List<Title> features = new ArrayList<Title>();
		
		try {
			for(Title title: titles){
				
				if(title.getType().equalsIgnoreCase("Feature")){
					if(title.getName().equalsIgnoreCase(name)){
						features.add(title);
					}
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return features; 
	}
	
	public List<Title> retrieveAllBonusesByName(String name){
		List<Title> bonuses = new ArrayList<Title>();
		
		try {
			for(Title title: titles){
				
				if(null!=title.getBonuses()){
					List<Bonus> bonusesTitle = new ArrayList<Bonus>();
					bonusesTitle = title.getBonuses();
					for(Bonus ObjBonus : bonusesTitle){
						if(ObjBonus.getName().equalsIgnoreCase(name)){
							bonuses.add(ObjBonus);
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bonuses; 
	}
	
	public Feature addFeature(Feature feat){
		try {
			titles.add(feat);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return feat;
	}
	
	public TVSeries addTVSeries(TVSeries series){
		try {
			titles.add(series);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return series;
	}
	
	public Bonus addBonus(Bonus bonus,String name){
		try {
			titles.add(bonus);
			
			int index =0;
			for(Title title: titles){
				
				if(title.getType().equalsIgnoreCase("Feature")){
					if(title.getName().equalsIgnoreCase(name)){
						break;
					}
					
				}
				index++;
			}
			titles.get(index).getBonuses().add(bonus);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bonus;
	}
	
	public String updateAllTvSeriesByName(String name, TVSeries series){
				
		try {
			for(Title title: titles){
				
				if(title.getType().equalsIgnoreCase("TV Series")){
					if(title.getName().equalsIgnoreCase(name)){
						titles.remove(title);
						titles.add(series);
						return "Update Successful";
					}
				
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "No TV Found by this name"; 
	}
	
	public String updateAllFeaturesByName(String name, Feature feature){
				
		try {
			for(Title title: titles){
				
				if(title.getType().equalsIgnoreCase("Feature")){
					if(title.getName().equalsIgnoreCase(name)){
						titles.remove(title);
						titles.add(feature);
						return "Update Successful";
					}
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "No Feature found by this name"; 
	}
	
	public String updateAllBonusesByName(String name,Bonus bonus){
		
		try {
			for(Title title: titles){
				
				if(null!=title.getBonuses()){
					List<Bonus> bonusesTitle = new ArrayList<Bonus>();
					bonusesTitle = title.getBonuses();
					for(Bonus ObjBonus : bonusesTitle){
						if(ObjBonus.getName().equalsIgnoreCase(name)){
							title.getBonuses().remove(ObjBonus);
							title.getBonuses().add(bonus);
							return "Update Successful";
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "No Bonus found with this name"; 
	}
	
	public String deleteTvSeriesByName(String name){
		
		try {
			for(Title title: titles){
				
				if(title.getType().equalsIgnoreCase("TV Series")){
					if(title.getName().equalsIgnoreCase(name)){
						titles.remove(title);
						return "Delete Successful";
					}
				
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "No TV Found by this name"; 
	}
	
	public String deleteFeaturesByName(String name){
				
		try {
			for(Title title: titles){
				
				if(title.getType().equalsIgnoreCase("Feature")){
					if(title.getName().equalsIgnoreCase(name)){
						titles.remove(title);
						return "Delete Successful";
					}
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "No Feature found by this name"; 
	}
	
	public String deleteBonusesByName(String name){
		
		try {
			for(Title title: titles){
				
				if(null!=title.getBonuses()){
					List<Bonus> bonusesTitle = new ArrayList<Bonus>();
					bonusesTitle = title.getBonuses();
					for(Bonus ObjBonus : bonusesTitle){
						if(ObjBonus.getName().equalsIgnoreCase(name)){
							title.getBonuses().remove(ObjBonus);
							return "Delete Successful";
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "No Bonus found with this name"; 
	}

}
