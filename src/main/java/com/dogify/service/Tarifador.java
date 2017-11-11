package com.dogify.service;

import java.util.LinkedList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dogify.dto.DtoCliente;
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
			@RequestBody(required = false) Map<String, a> json) {
		DtoCliente cliente = json.get();
		DtoCliente paseo = json.get("DtoPaseo");

		double dinamico;
		boolean gratis;
		double tarifaDinamica;
		double tarifaInicial = 0;
		String tipoPaseo = paseo.getTipo();
		if (tipoPaseo == "clasic") {
			tarifaInicial = 350;
		} else if (tipoPaseo == "premium") {
			tarifaInicial = 450;
		} //Aqui puede haber una falla cuando testen ;)
		
		switch (cliente.getPerros().size()) {
		case 1:
			dinamico = -20 / 100;
			break;
		case 2:
			dinamico = -10 / 100;
			break;
		case 3:
			dinamico = -5 / 100;
			break;
		case 4:
			dinamico = 10 / 100;
			break;
		case 5:
			dinamico = 15 / 100;
			break;
		default:
			dinamico = 20 / 100;
			break;
		}

		tarifaDinamica = tarifaInicial + tarifaInicial * dinamico;
		boolean clienteLaNacion = cliente.getLaNacion();
		boolean clienteClarin = cliente.getClarin();

		double descuentoPromo = consultarPromoPersona(clienteLaNacion, clienteClarin);
		double tarifaConDescuento = tarifaDinamica - tarifaDinamica * descuentoPromo;
		gratis = (cliente.cantidadPaseos % 11 == 0);

		// TODO : Agregar logica
		DtoTarifadorTarifarResponse response = DtoTarifadorTarifarResponse.build(tarifaDinamica, tarifaConDescuento, gratis);
		return response;
	}

	public double consultarPromoPersona(boolean lanacion, boolean clarin) {
		if (lanacion && clarin) {
			return 0.25;
		} else if (lanacion) {
			return 0.15;
		} else if (clarin) {
			return 0.20;
		} else {
			return 0;
		}
	}
}
