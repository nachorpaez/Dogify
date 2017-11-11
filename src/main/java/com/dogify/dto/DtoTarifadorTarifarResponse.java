package com.dogify.dto;

public class DtoTarifadorTarifarResponse {
	
	public double tarifa;
	public double tarifaConDescuento;
	public Boolean gratis;

	public static DtoTarifadorTarifarResponse build(double tarifa, double tarifaConDescuento, boolean gratis) {
		DtoTarifadorTarifarResponse result = new DtoTarifadorTarifarResponse();
		result.tarifa = tarifa;
		result.tarifaConDescuento = tarifaConDescuento;
		result.gratis = gratis;
		return result;
	}
}
