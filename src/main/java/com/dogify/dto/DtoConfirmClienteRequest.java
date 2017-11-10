package com.dogify.dto;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DtoConfirmClienteRequest {
	

	public static DtoConfirmClienteRequest mock() {
		DtoConfirmClienteRequest result = new DtoConfirmClienteRequest();
		result.idConsulta = "idConsulta" + Math.random();
		result.promociones = Arrays.<DtoPromocion>asList(new DtoPromocion[]{new DtoPromocion("promo1",Math.random()), new DtoPromocion("promo2",Math.random())});
		result.confirmar = false;
		return result;
	}
	
	public String idConsulta;
	public List<DtoPromocion>  promociones = new LinkedList<>();
	public Boolean confirmar = false;
}
