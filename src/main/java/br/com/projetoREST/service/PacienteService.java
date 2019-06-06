package br.com.projetoREST.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoREST.model.Pessoa;
import br.com.projetoREST.repository.PessoaRepository;

@Service
public class PacienteService {
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	public Long salvar(Pessoa pessoa) {
		return pessoaRepository.save(pessoa).getId();
	}
	
	
}
