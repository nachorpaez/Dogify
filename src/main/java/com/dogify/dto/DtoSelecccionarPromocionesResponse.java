package com.dogify.dto;

import java.util.Arrays;
import java.util.List;

public class DtoSelecccionarPromocionesResponse {

	public static DtoSelecccionarPromocionesResponse mock() {
		DtoSelecccionarPromocionesResponse result = new DtoSelecccionarPromocionesResponse();
		result.promociones = Arrays.<DtoPromocion>asList(new DtoPromocion[]{new DtoPromocion("promo1",Math.random()), new DtoPromocion("promo2",Math.random())});
		return result;
	}

	public List<DtoPromocion> promociones;
}
