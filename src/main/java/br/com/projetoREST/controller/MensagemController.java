package br.com.projetoREST.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoREST.model.Mensagem;
import br.com.projetoREST.service.MensagemService;

@RestController
@RequestMapping(value="/mensagem")
public class MensagemController {
	

	@Autowired
	MensagemService service;
	
	@RequestMapping(value="/salvar", method = RequestMethod.POST)
	public Mensagem salvar(@RequestBody Mensagem mensagem) {

//		
//		//Setando usuario do sistema que está enviando a mensagem
//		if(usuario.isPresent())			
//			mensagem.setUsuario(usuario.get());
//		
//		//Setando Data e hora da mensagem
//		mensagem.setHorario(LocalDateTime.now());
//
//		return this.service.salvar(mensagem);
		return service.salvar(mensagem);
	}
	
	@RequestMapping(value="buscarMensagens/{idPaciente}/{idNutricionista}", method = RequestMethod.GET)
	public List<Mensagem> buscarMensagens(@PathVariable("idPaciente") Long idPaciente,
										  @PathVariable("idNutricionista") Long idNutricionista){		
		return service.buscarMensagens(idPaciente, idNutricionista);
	}
	
}
