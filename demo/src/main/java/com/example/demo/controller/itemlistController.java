package com.example.demo.controller;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.itemlist;
import com.example.demo.repository.itemlistRepository;
@RestController
@RequestMapping("/itemlist")
public class itemlistController {
	@Autowired
	private itemlistRepository repository;
	@RequestMapping(value= "/all", method= RequestMethod.GET)
	public List<itemlist> getAllList(){
	   
		return repository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public itemlist getPetById(@PathVariable("id") ObjectId id) {
	  return repository.findById(id).get();
	}
	
	@RequestMapping(value = "/create", method = {RequestMethod.POST})
	public itemlist createItem(@Validated @RequestBody itemlist item) {
	  repository.insert(item);
	  return item;
	}

	@RequestMapping(value="/delete/{id}",method = {RequestMethod.GET}) 
	public void deleteitemlist(@PathVariable("id") ObjectId id)
	{ repository.deleteById(id); }
	
	@RequestMapping(value = "/update/{id}", method = {RequestMethod.POST})
	public void modifyItemById(@Validated @RequestBody itemlist item) {
	  repository.save(item);
	}
}