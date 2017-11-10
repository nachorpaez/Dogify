package com.dogify.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Perro {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
    
    @ManyToOne
    private Usuario duenio;
    
    private String nombre;
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuario getDuenio() {
		return duenio;
	}

	public void setDuenio(Usuario duenio) {
		this.duenio = duenio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
}
