package br.com.projetoREST.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoREST.model.Antropometria;
import br.com.projetoREST.service.AntropometriaService;

@RestController
@RequestMapping(value="/antropometria")
public class AntropometriaController {
	
	@Autowired
	private AntropometriaService service;
	
	@RequestMapping(value="/salvar")
	public Antropometria salvar(@RequestBody Antropometria antropometria) {
		System.out.println(antropometria);
		return this.service.salvar(antropometria);
	}
	
}
