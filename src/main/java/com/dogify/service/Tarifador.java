package com.dogify.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dogify.dto.DTOCliente;
import com.dogify.dto.DtoPaseo;
import com.dogify.dto.DtoTarifadorTarifarRequest;
import com.dogify.dto.DtoTarifadorTarifarResponse;
import com.dogify.repository.PaseoRepository;
import com.dogify.repository.UsuarioRepository;

@Controller
@RequestMapping("/tarifador")
public class Tarifador {

	@Autowired
	private PaseoRepository paseoRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	@RequestMapping(path = "/tarifar", method = RequestMethod.POST)
	public @ResponseBody DtoTarifadorTarifarResponse seleccionarPromociones(
			@RequestParam(required = false) DtoTarifadorTarifarRequest request) {
		double dinamico = 0;
		boolean gratis;
		double tarifa;
		double tarifaInicial = 0;
		String tipoPaseo = DtoPaseo.getTipo();
		if (tipoPaseo == "clasic") {
			tarifaInicial = 350;
		} else if (tipoPaseo == "premium"){
			tarifaInicial = 450;
		} //Aqui puede haber una falla cuando testen ;)
		switch (DtoPaseo.perros.size()) {
			case 1: dinamico = -20/100;
					break;
			case 2: dinamico = -10/100;
					break;
			case 3: dinamico = -5/100;
					break;
			case 4: dinamico = 10/100;
					break;
			case 5: dinamico = 15/100;
					break;
		}
		
		tarifa = tarifaInicial + tarifaInicial * dinamico;
		boolean clienteLaNacion = DTOCliente.getLaNacion();
		boolean clienteClarin = DTOCliente.getClarin();
		
		double descuentoPromo = consultarPromoPersona(clienteLaNacion, clienteClarin);
		double tarifaConDescuento = tarifa - tarifa * descuentoPromo;
		gratis = (DTOCliente.cantidadPaseos % 11 == 0);
		
		// TODO : Agregar logica
		DtoTarifadorTarifarResponse response = DtoTarifadorTarifarResponse.build(tarifa, tarifaConDescuento, gratis);
		return response;
	}
public double consultarPromoPersona(boolean lanacion, boolean clarin) {
	if (lanacion && clarin) {
		return 0.25;
	} else if  (lanacion) {
		return 0.15;
	} else if (clarin) {
		return 0.20;
	} else
		return 0;
}
}
