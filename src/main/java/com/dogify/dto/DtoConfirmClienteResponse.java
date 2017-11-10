package com.dogify.dto;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DtoConfirmClienteResponse {

	public DtoConfirmClienteResponse() {

	}

	public static DtoConfirmClienteResponse mock() {
		DtoConfirmClienteResponse result = new DtoConfirmClienteResponse();
		result.idConsulta = "idConsulta" + Math.random();
		result.idDuenio = "idDuenio" + Math.random();
		result.idPaseador = "idPaseador" + Math.random();
		result.perros = Arrays.<String>asList(new String[] { "perro1", "perro2" });
		result.precioBase = Math.random();
		result.precioDinamico = Math.random();
		return result;
	}

	public String idConsulta;
	public String idDuenio;;
	public String idPaseador = "idPaseador" + Math.random();
	public List<String> perros = new LinkedList<>();
	public Double precioBase;
	public Double precioDinamico;
}
