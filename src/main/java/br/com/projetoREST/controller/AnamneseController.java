package br.com.projetoREST.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoREST.model.Anamnese;
import br.com.projetoREST.service.AnamneseService;

@RestController
@RequestMapping(value = "/anamnese")
public class AnamneseController {
	
	@Autowired
	private AnamneseService anamneseService;

	@RequestMapping(value="/salvar", method = RequestMethod.POST)
	public Anamnese salvar(@RequestBody Anamnese anamnese) {
		return anamneseService.salvar(anamnese);
		
	}
	
	@RequestMapping(value="/{id}")
	public Optional<Anamnese> buscarPorPacienteId(@PathVariable("id") Long id){
		return this.anamneseService.buscarPorPacienteId(id);
	}
}
