package com.springboot.ordermgmt.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.springboot.ordermgmt.model.Bonus;
import com.springboot.ordermgmt.model.Feature;
import com.springboot.ordermgmt.model.TVSeries;
import com.springboot.ordermgmt.model.Title;
import com.springboot.ordermgmt.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
		
	@GetMapping("/titles/titles")
	public List<Title> retriveAllTitle(){
		return orderService.retrieveAllTitles();
	}
	
	@GetMapping("/titles/{titleType}/titles")
	public List<Title> filterAllTitles(@PathVariable String titleType){
		if(titleType.equalsIgnoreCase("Tv Series")){
			return orderService.retrieveAllTvSeries();
		}else if(titleType.equalsIgnoreCase("Feature")){
			return orderService.retrieveAllFeatures();
		}else if(titleType.equalsIgnoreCase("Bonus")){
			return orderService.retrieveAllBonuses();
		}else if(titleType.equalsIgnoreCase("Seasons")){
			return orderService.retrieveAllSeasons();
		}else if(titleType.equalsIgnoreCase("Episodes")){
			return orderService.retrieveAllEpisodes();
		}
		return null;
	}
	
	@GetMapping("/titles/{titleType}/{name}/titles")
	public List<Title> retriveAlltitlesByName(@PathVariable String titleType,@PathVariable String name){
		if(titleType.equalsIgnoreCase("Tv Series")){
			return orderService.retrieveAllTvSeriesByName(name);
		}else if(titleType.equalsIgnoreCase("Feature")){
			return orderService.retrieveAllFeaturesByName(name);
		}else if(titleType.equalsIgnoreCase("Bonus")){
			return orderService.retrieveAllBonusesByName(name);
		}
		return null;
	}
	
	@PostMapping("/titles/Bonus/{name}")
	public ResponseEntity<Void> addBonus(@RequestBody Bonus title,@PathVariable String name) {
			 orderService.addBonus(title,name);
		
		if (title == null)
			return ResponseEntity.noContent().build();

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
				"/{name}").buildAndExpand(title.getName()).toUri();

		return ResponseEntity.created(location).build();
	}
	
	@PostMapping("/titles/TvSeries")
	public ResponseEntity<Void> addTvSeries(@RequestBody TVSeries title) {
		
			 orderService.addTVSeries(title);
		if (title == null)
			return ResponseEntity.noContent().build();

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
				"/{name}").buildAndExpand(title.getName()).toUri();

		return ResponseEntity.created(location).build();
	}
	
	@PostMapping("/titles/Feature")
	public ResponseEntity<Void> addFeature(@RequestBody Feature title) {
					 orderService.addFeature(title);
		
		if (title == null)
			return ResponseEntity.noContent().build();

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
				"/{name}").buildAndExpand(title.getName()).toUri();

		return ResponseEntity.created(location).build();
	}

	@PutMapping("/titles/TVSeries/{name}/title")
	public String UpdateTVSeries(@RequestBody TVSeries title, @PathVariable String name) {
			return orderService.updateAllTvSeriesByName(name, title);
	}
	
	@PutMapping("/titles/Feature/{name}/title")
	public String UpdateFeature(@RequestBody Feature title, @PathVariable String name) {
		return orderService.updateAllFeaturesByName(name, title);
	}
	
	@PutMapping("/titles/Bonus/{name}/title")
	public String UpdateBonus(@RequestBody Bonus title, @PathVariable String name) {
		
			return orderService.updateAllBonusesByName(name, title);
	}
	
	@DeleteMapping("/titles/{titleType}/{name}")
	public String deleteOrder(@PathVariable String titleType,@PathVariable String name) {
		if(titleType.equalsIgnoreCase("Tv Series")){
			return orderService.deleteTvSeriesByName(name);
		}else if(titleType.equalsIgnoreCase("Feature")){
			return orderService.deleteFeaturesByName(name);
		}else if(titleType.equalsIgnoreCase("Bonus")){
			return orderService.deleteBonusesByName(name);
		}
		return null;
	}
	

}
