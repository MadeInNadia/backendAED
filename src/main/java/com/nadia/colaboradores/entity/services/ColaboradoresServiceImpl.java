package com.nadia.colaboradores.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nadia.colaboradores.entity.dao.ColaboradoresDao;
import com.nadia.colaboradores.entity.models.Colaboradores;

@Service
public class ColaboradoresServiceImpl implements ColaboradoresService{

	@Autowired
	private ColaboradoresDao colaboradoresDao;
	
	@Override
	public Colaboradores get(long id) {
		return colaboradoresDao.findById(id).get();
	}

	@Override
	public List<Colaboradores> getAll() {
		return (List<Colaboradores>) colaboradoresDao.findAll();
	}

	@Override
	public void post(Colaboradores colaboradores) {
		colaboradoresDao.save(colaboradores);
	}

	@Override
	public void put(Colaboradores colaboradores, long id) {
		colaboradoresDao.findById(id).ifPresent((x)->{
			colaboradores.setId(id);
			colaboradoresDao.save(colaboradores);
		});
	}

	@Override
	public void delete(long id) {
		colaboradoresDao.deleteById(id);
		
	}

}
