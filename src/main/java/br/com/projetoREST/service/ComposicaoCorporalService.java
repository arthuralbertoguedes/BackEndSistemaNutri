package br.com.projetoREST.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoREST.model.ComposicaoCorporal;
import br.com.projetoREST.repository.ComposicaoCorporalRepository;

@Service
public class ComposicaoCorporalService {
	
	@Autowired 
	private ComposicaoCorporalRepository repository;
	
	public ComposicaoCorporal salvar(ComposicaoCorporal composicaoCorporal) {
		return this.repository.save(composicaoCorporal);
	}
	
	public Optional<ComposicaoCorporal> buscarComposicaoCorporalPorIdPaciente(Long id){
		return this.repository.buscarComposicaoCorporalPorIdPaciente(id);
	}

}
