package br.com.projetoREST.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoREST.model.Mensagem;
import br.com.projetoREST.repository.MensagemRepository;

@Service
public class MensagemService {

	@Autowired
	MensagemRepository repository;
	
	public Mensagem salvar(Mensagem mensagem) {
		return this.repository.save(mensagem);
	}
}
