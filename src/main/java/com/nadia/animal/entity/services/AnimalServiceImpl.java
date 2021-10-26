package com.nadia.animal.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nadia.animal.entity.dao.AnimalDao;
import com.nadia.animal.entity.models.Animal;

@Service
public class AnimalServiceImpl implements AnimalService{

	@Autowired
	private AnimalDao animalDao;
	
	@Override
	public Animal get(long id) {
		return animalDao.findById(id).get();
	}

	@Override
	public List<Animal> getAll() {
		return (List<Animal>) animalDao.findAll();
	}

	@Override
	public void post(Animal animal) {
		animalDao.save(animal);
	}

	@Override
	public void put(Animal animal, long id) {
		animalDao.findById(id).ifPresent((x)->{
			animal.setId(id);
			animalDao.save(animal);
		});
	}

	@Override
	public void delete(long id) {
		animalDao.deleteById(id);
		
	}

}
