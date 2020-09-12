package com.healthtrack.demo.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.healthtrack.demo.domain.Plano;

@RestController
@RequestMapping(value="/planos")
public class PlanoResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Plano> listar() {
		
		Plano p1= new Plano(1, "nutricao", null, null, null);
		Plano p2= new Plano(2,"exercicio", null, null, null);
		
		List<Plano> lista = new ArrayList<>();
		lista.add(p1);
		lista.add(p2);
		
		return lista;
	}
	
}
