package br.com.projetoREST.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoREST.model.Consulta;
import br.com.projetoREST.model.ParametrosPesquisa;
import br.com.projetoREST.service.ConsultaService;

@RestController
@RequestMapping(value = "/consulta")
public class ConsultaController {

	@Autowired
	private ConsultaService consultaService;
	
	
	@RequestMapping(value="/listar", method = RequestMethod.GET)
	public List<Consulta> listarConsulta() {
		return consultaService.listar();
	}
	
	@RequestMapping(value="/salvar", method = RequestMethod.POST)
	public Consulta salvarConsulta(@RequestBody Consulta consulta) {
		consulta.setHorarioDateTime(consulta.getHorarioDateTime().minusHours(3));
		return consultaService.salvarConsulta(consulta);
	}
	
	@RequestMapping(value="/listarPorNomePaciente", method = RequestMethod.POST)
	public List<Consulta> buscarPorNomePaciente(@RequestBody ParametrosPesquisa parametros) {
		return consultaService.buscarPorNomePaciente(parametros);
	}
	

	@RequestMapping(value="/cancelar/{id}", method = RequestMethod.GET)
	public void cancelar(@PathVariable("id") Long id) {
		consultaService.cancelar(id);
	}
	
}
