package com.dogify.dto;

public class DtoTarifadorTarifarResponse {
	
	public Double tarifa;
	public Double tarifaConDescuento;
	public Boolean gratis;

	public static DtoTarifadorTarifarResponse mock() {
		DtoTarifadorTarifarResponse result = new DtoTarifadorTarifarResponse();
		result.tarifa = Math.random() * 100;
		result.tarifaConDescuento = result.tarifa * 0.9;
		result.gratis = false;
		return result;
	}
}
