package com.dogify.dto;

public class DtoSelecccionarPromocionesRequest {

	public static DtoSelecccionarPromocionesRequest mock() {
		DtoSelecccionarPromocionesRequest result = new DtoSelecccionarPromocionesRequest();
		result.idDuenio = "idDuenio" + Math.random();
		return result;
	}

	public String idDuenio;
}
