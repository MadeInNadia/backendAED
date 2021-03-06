package com.nadia.colaboradores.entity.services;

import java.util.List;

import com.nadia.colaboradores.entity.models.Colaboradores;

public interface ColaboradoresService {
	public Colaboradores get(long id);
	public List<Colaboradores> getAll();
	public void post(Colaboradores colaboradores);
	public void put(Colaboradores colaboradores, long id);
	public void delete(long id);
}
