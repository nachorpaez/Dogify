package com.dogify.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dogify.dto.DtoSelecccionarPromocionesRequest;
import com.dogify.dto.DtoSelecccionarPromocionesResponse;

@Controller
@RequestMapping("/promociones/seleccionar")
public class PromocionesSeleccionarController {
	
    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody DtoSelecccionarPromocionesResponse seleccionarPromociones(@RequestParam(required=false) DtoSelecccionarPromocionesRequest seleccionarPromociones) {
    	
    	String duenio = seleccionarPromociones.idDuenio;
    	
    	// TODO: implementar logica de negocio
    	
    	// Mocked value
    	DtoSelecccionarPromocionesResponse result = DtoSelecccionarPromocionesResponse.mock();
		return result;
    }
    
    

}
