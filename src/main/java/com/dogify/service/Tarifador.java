package com.dogify.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
		
		// TODO : Agregar logica
		DtoTarifadorTarifarResponse response = DtoTarifadorTarifarResponse.mock();
		return response;
	}

}
