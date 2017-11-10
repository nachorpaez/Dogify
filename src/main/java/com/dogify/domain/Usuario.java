package com.dogify.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
    
    private String nombre;
    
    @OneToMany(targetEntity=Perro.class)
    private List<Perro> perros;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Perro> getPerros() {
		return perros;
	}

	public void setPerros(List<Perro> perros) {
		this.perros = perros;
	}
    
}
