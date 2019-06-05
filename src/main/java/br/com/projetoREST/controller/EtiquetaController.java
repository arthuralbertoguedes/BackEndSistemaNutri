package br.com.projetoREST.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoREST.model.Paciente;

@RestController
@RequestMapping(value = "/paciente")
public class EtiquetaController {

	//Serviço aqui
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public Paciente adicionarEtiqueta() {
		Paciente paciente = new Paciente();
		paciente.setNome("Arthur Guedes");
		System.out.println("enviando resposta ... ");
		return paciente;
	}

	
	@RequestMapping(value="/salvar", method = RequestMethod.POST)
		public void salvarPaciente(@RequestBody Object paciente) {
		
			System.out.println(paciente);
		}
}

