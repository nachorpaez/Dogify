package com.dogify.dto;

import java.util.Date;

public class DtoTarifadorTarifarRequest {

	public Date fecha;
	public DtoCliente cliente;
	public DtoPaseo paseo;
	
	public static DtoTarifadorTarifarRequest mock() {
		DtoTarifadorTarifarRequest result = new DtoTarifadorTarifarRequest();
		result.fecha = new Date();
		return result;
	}
}
