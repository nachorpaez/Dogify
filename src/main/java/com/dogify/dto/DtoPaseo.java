package com.dogify.dto;

import java.util.Date;
import java.util.List;

public class DtoPaseo {
	
	public static List<DtoPerro> perros;
	public String zone;
	public Date fecha;
	public DtoPaseador paseador;
	public static String Tipo;
	public List<DtoPerro> getPerros() {
		return perros;
	}
	public void setPerros(List<DtoPerro> perros) {
		this.perros = perros;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public DtoPaseador getPaseador() {
		return paseador;
	}
	public void setPaseador(DtoPaseador paseador) {
		this.paseador = paseador;
	}
	public static String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	
	
}