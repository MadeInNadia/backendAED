package com.nadia.animal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nadia.animal.entity.models.Animal;
import com.nadia.animal.entity.services.AnimalService;

@RestController
public class AnimalController {

	
	
	
	@Autowired
	AnimalService animalService;
	
	@GetMapping("/animal")
	public List<Animal> getAllUsers(){
		return animalService.getAll();
	}
	
	@GetMapping("/animal/{id}")
	public Animal getOne(@PathVariable(value = "id") long id) {
		return animalService.get(id);
	}
	
	@PostMapping("/animal")
	public void add(Animal animal) {
		animalService.post(animal);
	}
	
	@PutMapping("/animal/{id}")
	public void update(Animal animal, @PathVariable(value = "id") long id) {
		animalService.put(animal, id);
	}
	
	@DeleteMapping("/animal/{id}")
	public void update(@PathVariable(value = "id") long id) {
		animalService.delete(id);
	}
}
