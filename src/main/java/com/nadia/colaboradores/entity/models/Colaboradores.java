package com.nadia.colaboradores.entity.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.sun.istack.NotNull;

@Entity
@Table(name = "animal")

public class Colaboradores implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String nombre;
	@NotNull
	private String tipo;
	@NotNull
	private String donacion;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDonacion() {
		return donacion;
	}
	public void setDonacion(String donacion) {
		this.donacion = donacion;
	}
	public Colaboradores(long id, String nombre, String tipo, String donacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.donacion = donacion;
	}
	public Colaboradores() {
	}
	
	
}
