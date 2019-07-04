package br.com.projetoREST.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoREST.model.Alimento;
import br.com.projetoREST.service.AlimentoService;

@RestController
@RequestMapping("/alimento")
public class AlimentoController {

	@Autowired
	private AlimentoService service;
	
	@RequestMapping(value="/listarTodos/{pesquisa}", method=RequestMethod.GET)
	public Alimento[] listarPorNome(@PathVariable("pesquisa") String pesquisa) {
		return this.service.listarAlimentos(pesquisa);
	}
	
}
