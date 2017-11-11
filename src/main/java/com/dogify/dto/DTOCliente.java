package com.dogify.dto;

import java.util.List;

public class DTOCliente {
	
	public static String id;
	
	public static List<DtoPerro> perros;
	
	public static Boolean clarin;
	
	public static Boolean laNacion;
	
	public static String getId() {
		return id;
	}

	public static void setId(String id) {
		DTOCliente.id = id;
	}

	public static List<DtoPerro> getPerros() {
		return perros;
	}

	public static void setPerros(List<DtoPerro> perros) {
		DTOCliente.perros = perros;
	}

	public static Boolean getClarin() {
		return clarin;
	}

	public static void setClarin(Boolean clarin) {
		DTOCliente.clarin = clarin;
	}

	public static Boolean getLaNacion() {
		return laNacion;
	}

	public static void setLaNacion(Boolean laNacion) {
		DTOCliente.laNacion = laNacion;
	}

	public static int getCantidadPaseos() {
		return cantidadPaseos;
	}

	public static void setCantidadPaseos(int cantidadPaseos) {
		DTOCliente.cantidadPaseos = cantidadPaseos;
	}

	public static int cantidadPaseos;
	
}
