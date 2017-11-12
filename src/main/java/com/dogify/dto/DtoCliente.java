package com.dogify.dto;

import java.util.List;

public class DtoCliente {
	
	public  String id;
	
	public  List<DtoPerro> perros;
	
	public  Boolean clarin;
	
	public  Boolean laNacion;
	
	public  int cantidadPaseos;

	public  String getId() {
		return id;
	}

	public  void setId(String id) {
		this.id = id;
	}

	public  List<DtoPerro> getPerros() {
		return perros;
	}

	public  void setPerros(List<DtoPerro> perros) {
		this.perros = perros;
	}

	public  Boolean getClarin() {
		return clarin;
	}

	public  void setClarin(Boolean clarin) {
		this.clarin = clarin;
	}

	public  Boolean getLaNacion() {
		return laNacion;
	}

	public  void setLaNacion(Boolean laNacion) {
		this.laNacion = laNacion;
	}

	public  int getCantidadPaseos() {
		return cantidadPaseos;
	}

	public  void setCantidadPaseos(int cantidadPaseos) {
		this.cantidadPaseos = cantidadPaseos;
	}
	
}
