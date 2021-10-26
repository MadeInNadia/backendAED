package com.nadia.animal.entity.services;

import java.util.List;

import com.nadia.animal.entity.models.Animal;

public interface AnimalService {
	public Animal get(long id);
	public List<Animal> getAll();
	public void post(Animal users);
	public void put(Animal user, long id);
	public void delete(long id);
}
