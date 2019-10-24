package br.com.projetoREST.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoREST.model.Mensagem;
import br.com.projetoREST.model.Usuario;
import br.com.projetoREST.repository.MensagemRepository;

@Service
public class MensagemService {

	@Autowired
	MensagemRepository repository;
	
	@Autowired
	UsuarioService usuarioService;
	
	
	public Mensagem salvar(Mensagem mensagem) {
		LocalDateTime horario = LocalDateTime.now();
		
		Long idUsuario = mensagem.getUsuario().getId();
		
		Optional<Usuario> usuario = usuarioService.buscarUsuario(idUsuario);
		
		if(usuario != null)
			mensagem.setUsuario(usuario.get());
		
		mensagem.setHorario(horario);
		
		return this.repository.save(mensagem);
	}
	
	public List<Mensagem> buscarMensagens(Long idPaciente, Long idNutricionista){
		return repository.buscarMensagens(idPaciente, idNutricionista);
	}
}
