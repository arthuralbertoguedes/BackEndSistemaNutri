package br.com.projetoREST.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoREST.model.Lembrete;
import br.com.projetoREST.service.LembreteService;

@RestController
@RequestMapping(value="/lembrete")
public class LembreteController {
	
	@Autowired
	private LembreteService service;
	
	@RequestMapping(value="/salvar")
	public Lembrete salvar(@RequestBody Lembrete lembrete) {
		return this.service.salvar(lembrete);
	}
	
	
}
