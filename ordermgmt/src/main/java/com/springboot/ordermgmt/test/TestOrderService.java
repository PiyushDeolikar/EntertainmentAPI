package com.springboot.ordermgmt.test;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import com.springboot.ordermgmt.model.Bonus;
import com.springboot.ordermgmt.model.Episode;
import com.springboot.ordermgmt.model.Feature;
import com.springboot.ordermgmt.model.Order;
import com.springboot.ordermgmt.model.OrderItem;
import com.springboot.ordermgmt.model.Season;
import com.springboot.ordermgmt.model.TVSeries;
import com.springboot.ordermgmt.service.OrderService;

public class TestOrderService {

	OrderService service = new OrderService();
	
	@Test
	public void testAddMethods(){

		Bonus bonus1 = new Bonus();
		bonus1.setType("bonus");
		bonus1.setName("Breaking Knight");
		bonus1.setDescription("Get to know frozen from the snowy ground up as the filmmakers and songwriters discuss the story's roots and inspiration; the joys of animating olaf, the little snowman with the sunny personality; and the creation of those amazing songs.");
		bonus1.setDuration("15 min");
		
		service.addBonus(bonus1, "Frozen");
		
		Feature feat1 = new Feature();
		feat1.setType("Feature");
		feat1.setName("Deep Water");
		feat1.setDescription("Animated feature. Fearless optimist, the Princess Anna, sets off on an epic journey—teaming up with rugged mountain man, Kristoff, and his loyal reindeer Sven—to find her sister Elsa, whose icy powers have trapped the kingdom of Arendelle in eternal winter.");
		feat1.setTheatricalReleaseDate("11/27/2013");
		feat1.setDuration("102 min");
		feat1.getBonuses().add(bonus1);
		
		service.addFeature(feat1);
		
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
		
		Season season1 = new Season();
		season1.setType("Season");
		season1.setName("Season 1");
		season1.getEpisodes().add(ep1);
		season1.getEpisodes().add(ep2);
		
		TVSeries tv1 = new TVSeries();
		tv1.setType("TV Series");
		tv1.setName("Winner");
		tv1.setDescription("A plane crashes on a Pacific island, and the 48 survivors, stripped of everything, scavenge what they can from the plane for their survival. Some panic; some pin their hopes on rescue. The band of friends, family, enemies, and strangers must work together against the cruel weather and harsh terrain.");
		tv1.setReleaseDate("09/22/2004");
		tv1.getSeasons().add(season1);
	}
	
	@Test
	public void testRetrieveMethods(){
		service.retrieveAllBonuses();
		service.retrieveAllEpisodes();
		service.retrieveAllFeatures();
		service.retrieveAllSeasons();
		service.retrieveAllTvSeries();
		
		service.retrieveAllBonusesByName("Breaking the ice");
		service.retrieveAllFeaturesByName("Frozen");
		service.retrieveAllTvSeriesByName("Lost");
		service.retrieveAllBonusesByName(null);
		service.retrieveAllFeaturesByName(null);
		service.retrieveAllTvSeriesByName(null);
	}
	
	@Test
	public void testDeleteMethods(){
		
		service.deleteBonusesByName("Breaking the Ice");
		service.deleteFeaturesByName("Frozen");
		service.deleteTvSeriesByName("Lost");
		
		service.deleteBonusesByName(null);
		service.deleteFeaturesByName(null);
		service.deleteTvSeriesByName(null);
		
	}
	
	@Test
	public void testUpdateMethods(){
		Bonus bonus1 = new Bonus();
		bonus1.setType("bonus");
		bonus1.setName("Breaking Knight");
		bonus1.setDescription("Get to know frozen from the snowy ground up as the filmmakers and songwriters discuss the story's roots and inspiration; the joys of animating olaf, the little snowman with the sunny personality; and the creation of those amazing songs.");
		bonus1.setDuration("20 min");
		service.updateAllBonusesByName("Breaking Knight", bonus1);
		
		Feature feat1 = new Feature();
		feat1.setType("Feature");
		feat1.setName("Deep Water");
		feat1.setDescription("Animated feature. Fearless optimist, the Princess Anna, sets off on an epic journey—teaming up with rugged mountain man, Kristoff, and his loyal reindeer Sven—to find her sister Elsa, whose icy powers have trapped the kingdom of Arendelle in eternal winter.");
		feat1.setTheatricalReleaseDate("11/27/2013");
		feat1.setDuration("102 min");
		feat1.getBonuses().add(bonus1);
		
		service.updateAllFeaturesByName("Deep Water", feat1);
		
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
		
		Season season1 = new Season();
		season1.setType("Season");
		season1.setName("Season 1");
		season1.getEpisodes().add(ep1);
		season1.getEpisodes().add(ep2);
		
		TVSeries tv1 = new TVSeries();
		tv1.setType("TV Series");
		tv1.setName("Winner");
		tv1.setDescription("A plane crashes on a Pacific island, and the 48 survivors, stripped of everything, scavenge what they can from the plane for their survival. Some panic; some pin their hopes on rescue. The band of friends, family, enemies, and strangers must work together against the cruel weather and harsh terrain.");
		tv1.setReleaseDate("09/22/2004");
		tv1.getSeasons().add(season1);
		
		service.updateAllTvSeriesByName("Winner", tv1);
		
	}	
	
}
