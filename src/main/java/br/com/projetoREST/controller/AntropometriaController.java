package br.com.projetoREST.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
		return this.service.salvar(antropometria);
	}
	
	@RequestMapping(value="/{id}")
	public List<Antropometria> buscarPorIdPaciente(@PathVariable("id") Long id){
		return this.service.buscarPorIdPaciente(id);
	}
	
}
