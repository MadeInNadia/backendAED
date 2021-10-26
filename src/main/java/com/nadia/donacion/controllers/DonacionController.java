package com.nadia.donacion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nadia.donacion.entity.models.Donacion;
import com.nadia.donacion.entity.services.DonacionService;

@RestController
public class DonacionController {

	
	
	
	@Autowired
	DonacionService donacionService;
	
	@GetMapping("/donacion")
	public List<Donacion> getAllUsers(){
		return donacionService.getAll();
	}
	
	@GetMapping("/donacion/{id}")
	public Donacion getOne(@PathVariable(value = "id") long id) {
		return donacionService.get(id);
	}
	
	@PostMapping("/donacion")
	public void add(Donacion donacion) {
		donacionService.post(donacion);
	}
	
	@PutMapping("/donacion/{id}")
	public void update(Donacion donacion, @PathVariable(value = "id") long id) {
		donacionService.put(donacion, id);
	}
	
	@DeleteMapping("/donacion/{id}")
	public void update(@PathVariable(value = "id") long id) {
		donacionService.delete(id);
	}
}
