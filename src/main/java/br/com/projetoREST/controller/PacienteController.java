package br.com.projetoREST.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoREST.model.Paciente;
import br.com.projetoREST.service.PacienteService;


@RestController
@RequestMapping(value = "/paciente")
public class PacienteController {

	@Autowired
	PacienteService pacienteService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public Paciente adicionarEtiqueta() {
		Paciente paciente = new Paciente();
		paciente.setNome("Arthur Guedes");
		return paciente;
	}

	
	@RequestMapping(value="/salvar", method = RequestMethod.POST)
	public Long salvarPaciente(@RequestBody Paciente paciente) {
		return pacienteService.salvar(paciente);
	}

	@RequestMapping(value="/listarTodos",method = RequestMethod.GET)
	public List<Paciente> listarTodos(){
		return pacienteService.listarTodos();
	
	}
	
	@RequestMapping(value="/listarPorNome/{nomePaciente}", method = RequestMethod.GET)
	public List<Paciente> listarPorNome(@PathVariable("nomePaciente") String nomePaciente){
		return pacienteService.listarPorNome(nomePaciente);
	}
	
	@RequestMapping(value="/listarUltimos", method = RequestMethod.GET)
	public List<Paciente> listarUltimosCadastrados(){
		return pacienteService.listarUltimosCadastrados();
	}
	
	@RequestMapping(value="/{id}")
	public Optional<Paciente> listarPorId(@PathVariable("id") Long id) {

		return this.pacienteService.listarPorId(id);
	}
	
	

}

