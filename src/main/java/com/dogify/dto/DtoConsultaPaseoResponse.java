package com.dogify.dto;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DtoConsultaPaseoResponse {

	public static DtoConsultaPaseoResponse mock() {
		DtoConsultaPaseoResponse result = new DtoConsultaPaseoResponse();
		result.idConsulta = "idConsulta" + Math.random();
		result.promociones = Arrays.<DtoPromocion>asList(new DtoPromocion[]{new DtoPromocion("promo1",Math.random()), new DtoPromocion("promo2",Math.random())});
		result.precioBase = Math.random();
		result.precioDinamico = Math.random();
		return result;
	}
	
	public String idConsulta;
	public List<DtoPromocion> promociones = new LinkedList<>();
	public Double precioBase;
	public Double precioDinamico;

}
