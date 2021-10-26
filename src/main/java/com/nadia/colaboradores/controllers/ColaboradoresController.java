package com.nadia.colaboradores.controllers;

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
import com.nadia.colaboradores.entity.models.Colaboradores;
import com.nadia.colaboradores.entity.services.ColaboradoresService;

@RestController
public class ColaboradoresController {

	
	
	
	@Autowired
	ColaboradoresService colaboradoresService;
	
	@GetMapping("/colaboradores")
	public List<Colaboradores> getAllUsers(){
		return colaboradoresService.getAll();
	}
	
	@GetMapping("/colaboradores/{id}")
	public Colaboradores getOne(@PathVariable(value = "id") long id) {
		return colaboradoresService.get(id);
	}
	
	@PostMapping("/colaboradores")
	public void add(Colaboradores colaboradores) {
		colaboradoresService.post(colaboradores);
	}
	
	@PutMapping("/colaboradores/{id}")
	public void update(Colaboradores colaboradores, @PathVariable(value = "id") long id) {
		colaboradoresService.put(colaboradores, id);
	}
	
	@DeleteMapping("/colaboradores/{id}")
	public void update(@PathVariable(value = "id") long id) {
		colaboradoresService.delete(id);
	}
}
