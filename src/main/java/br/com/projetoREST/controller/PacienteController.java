package br.com.projetoREST.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoREST.model.Pessoa;
import br.com.projetoREST.service.PacienteService;


@RestController
@RequestMapping(value = "/paciente")
public class PacienteController {

	@Autowired
	PacienteService pacienteService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public Pessoa adicionarEtiqueta() {
		Pessoa paciente = new Pessoa();
		paciente.setNome("Arthur Guedes");
		System.out.println("enviando resposta ... ");
		return paciente;
	}

	
	@RequestMapping(value="/salvar", method = RequestMethod.POST)
		public Long salvarPaciente(@RequestBody Pessoa paciente) {
			paciente.setIsPaciente(true);
			return pacienteService.salvar(paciente);
		}
}

