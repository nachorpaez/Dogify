package com.dogify.dto;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class DtoConsultaPaseoRequest {

	public static DtoConsultaPaseoRequest mock() {
		DtoConsultaPaseoRequest result = new DtoConsultaPaseoRequest();
		result.tipoPaseo = "tipoPaseo" + Math.random();
		result.fecha = new Date();
		result.idDuenio = "idDuenio" + Math.random();
		result.idPaseador = "idPaseador" + Math.random();
		result.perros = Arrays.<String>asList(new String[] { "perro1", "perro2" });
		result.zona = "zona" + Math.random();
		return result;
	}
	
	public String tipoPaseo;
	public Date fecha;
	public String idDuenio;
	public String idPaseador;
	public List<String> perros = new LinkedList<>();
	public String barrio;
	public String zona;
	
}
