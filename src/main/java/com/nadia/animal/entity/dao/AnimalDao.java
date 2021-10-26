package com.nadia.animal.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.nadia.animal.entity.models.Animal;

public interface AnimalDao extends CrudRepository<Animal, Long>{

}
