package com.nadia.donacion.entity.services;

import java.util.List;

import com.nadia.colaboradores.entity.models.Colaboradores;

public interface DonacionService {
	public Colaboradores get(long id);
	public List<Colaboradores> getAll();
	public void post(Colaboradores users);
	public void put(Colaboradores user, long id);
	public void delete(long id);
}
