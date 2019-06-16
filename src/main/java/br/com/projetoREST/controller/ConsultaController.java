package br.com.projetoREST.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoREST.model.Consulta;
import br.com.projetoREST.service.ConsultaService;

@RestController
@RequestMapping(value = "/consulta")
public class ConsultaController {

	@Autowired
	private ConsultaService consultaService;
	
	
	@RequestMapping(value="/listar", method = RequestMethod.GET)
	public Consulta listarConsulta() {
		return null;
	}
	
	@RequestMapping(value="/salvar", method = RequestMethod.POST)
	public Consulta salvarConsulta(@RequestBody Consulta consulta) {
		System.out.println(consulta.toString());
		return consultaService.salvarConsulta(consulta);
	}
	
}