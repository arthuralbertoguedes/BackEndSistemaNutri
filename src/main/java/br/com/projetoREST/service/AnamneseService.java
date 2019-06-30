package br.com.projetoREST.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoREST.model.Anamnese;
import br.com.projetoREST.repository.AnamneseRepository;

@Service
public class AnamneseService {
	
	@Autowired
	private AnamneseRepository repository;
	
	public Anamnese salvar(Anamnese anamnese) {
		return this.repository.save(anamnese);
	}
}
