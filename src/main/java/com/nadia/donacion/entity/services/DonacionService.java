package com.nadia.donacion.entity.services;

import java.util.List;

import com.nadia.colaboradores.entity.models.Colaboradores;
import com.nadia.donacion.entity.models.Donacion;

public interface DonacionService {
	public Donacion get(long id);
	public List<Donacion> getAll();
	public void post(Donacion donacion);
	public void put(Donacion donacion, long id);
	public void delete(long id);
}
