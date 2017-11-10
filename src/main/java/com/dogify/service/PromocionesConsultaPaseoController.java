package com.dogify.service;

import java.util.LinkedList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dogify.dto.DtoConsultaPaseoRequest;
import com.dogify.dto.DtoConsultaPaseoResponse;
import com.dogify.dto.DtoPromocion;

@Controller
@RequestMapping("/promociones/consulta")
public class PromocionesConsultaPaseoController {
	
    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody DtoConsultaPaseoResponse seleccionarPromociones(@RequestParam(required=false)  DtoConsultaPaseoRequest seleccionarPromociones) {
    	
    	String duenio = seleccionarPromociones.idDuenio;
    	
    	// TODO: implementar logica de negocio
    	
    	// Mock value
    	DtoConsultaPaseoResponse response = new DtoConsultaPaseoResponse();
    	response.idConsulta = "consulta random " + Math.random();
    	response.precioBase = Math.random();
    	response.precioDinamico = Math.random();
    	response.promociones = new LinkedList();
    	response.promociones.add(new DtoPromocion("promocion random " + Math.random(), Math.random() * 50));
        
		return response;
    }
    
    

}
