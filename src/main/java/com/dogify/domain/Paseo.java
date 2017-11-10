package com.dogify.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Paseo {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
    
    @ManyToOne(targetEntity=Usuario.class)
    private Usuario paseador;
    
    @OneToMany(targetEntity=Perro.class)
    private List<Perro> perros;
    
    private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuario getPaseador() {
		return paseador;
	}

	public void setPaseador(Usuario paseador) {
		this.paseador = paseador;
	}

	public List<Perro> getPerros() {
		return perros;
	}

	public void setPerros(List<Perro> perros) {
		this.perros = perros;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
}
