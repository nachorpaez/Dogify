package com.dogify.dto;

public class DtoPromocion {

	public DtoPromocion() {
	}

	public DtoPromocion(String nombre, Double porcentaje) {
		super();
		this.nombre = nombre;
		this.porcentaje = porcentaje;
	}

	public static DtoPromocion mock() {
		DtoPromocion result = new DtoPromocion("nombre" + Math.random(), Math.random());
		return result;
	}

	public String nombre;
	public Double porcentaje;
}
