package com.nadia.donacion.entity.dao;

import org.springframework.data.repository.CrudRepository;


import com.nadia.donacion.entity.models.Donacion;

public interface DonacionDao extends CrudRepository<Donacion, Long>{


}
