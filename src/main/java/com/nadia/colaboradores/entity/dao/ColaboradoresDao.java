package com.nadia.colaboradores.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.nadia.animal.entity.models.Animal;
import com.nadia.colaboradores.entity.models.Colaboradores;

public interface ColaboradoresDao extends CrudRepository<Colaboradores, Long>{

}
