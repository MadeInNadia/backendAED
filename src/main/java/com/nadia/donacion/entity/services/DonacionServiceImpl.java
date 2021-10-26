package com.nadia.donacion.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nadia.colaboradores.entity.dao.ColaboradoresDao;
import com.nadia.colaboradores.entity.models.Colaboradores;
import com.nadia.donacion.entity.dao.DonacionDao;
import com.nadia.donacion.entity.models.Donacion;

@Service
public class DonacionServiceImpl implements DonacionService{

	@Autowired
	private DonacionDao donacionDao;
	
	@Override
	public Donacion get(long id) {
		return donacionDao.findById(id).get();
	}

	@Override
	public List<Donacion> getAll() {
		return (List<Donacion>) donacionDao.findAll();
	}

	@Override
	public void post(Donacion donacion) {
		donacionDao.save(donacion);
	}

	@Override
	public void put(Donacion donacion, long id) {
		donacionDao.findById(id).ifPresent((x)->{
			donacion.setId(id);
			donacionDao.save(donacion);
		});
	}

	@Override
	public void delete(long id) {
		donacionDao.deleteById(id);
		
	}

}
