package br.com.projetoREST.controller;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoREST.model.Mensagem;
import br.com.projetoREST.model.Usuario;
import br.com.projetoREST.service.MensagemService;
import br.com.projetoREST.service.UsuarioService;

@RestController
@RequestMapping(value="/mensagem")
public class MensagemController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@Autowired
	MensagemService service;
	
	@RequestMapping(value="/salvar", method = RequestMethod.POST)
	public Mensagem salvar(@RequestBody Mensagem mensagem) {
		Optional<Usuario> usuario = usuarioService.buscarUsuario(new Long(1));
		
		//Setando usuario do sistema que está enviando a mensagem
		if(usuario.isPresent())			
			mensagem.setUsuario(usuario.get());
		
		//Setando Data e hora da mensagem
		mensagem.setHorario(LocalDateTime.now());

		return this.service.salvar(mensagem);
	}
}
