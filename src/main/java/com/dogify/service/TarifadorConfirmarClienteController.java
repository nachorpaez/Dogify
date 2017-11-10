package com.dogify.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dogify.dto.DtoConfirmClienteResponse;
import com.dogify.dto.DtoPromocion;
import com.dogify.dto.DtoSelecccionarPromocionesRequest;

@Controller
@RequestMapping("/tarifador/confirmar/cliente")
public class TarifadorConfirmarClienteController {
	
	@RequestMapping(method = RequestMethod.POST, path="/test")
	public @ResponseBody DtoPromocion test(){
		return DtoPromocion.mock();
	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody DtoConfirmClienteResponse sayHello(
			@RequestParam(required = false) DtoSelecccionarPromocionesRequest seleccionarPromociones) {
		DtoConfirmClienteResponse response = DtoConfirmClienteResponse.mock();
		return response;
	}

}
