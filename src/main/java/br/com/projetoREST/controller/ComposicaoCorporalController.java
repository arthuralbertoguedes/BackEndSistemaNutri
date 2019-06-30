package br.com.projetoREST.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoREST.model.ComposicaoCorporal;
import br.com.projetoREST.service.ComposicaoCorporalService;

@RestController
@RequestMapping(value="/composicao-corporal")
public class ComposicaoCorporalController {
	
	@Autowired
	private ComposicaoCorporalService service;
	
	@RequestMapping(value="/salvar")
	public ComposicaoCorporal salvar(@RequestBody ComposicaoCorporal composicaoCorporal) {
		System.out.println(composicaoCorporal);
		return this.service.salvar(composicaoCorporal);
	}
	
}