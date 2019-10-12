package br.com.projetoREST.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoREST.model.PlanoAlimentar;
import br.com.projetoREST.repository.PlanoAlimentarRepository;

@Service
public class PlanoAlimentarService {

	@Autowired
	PlanoAlimentarRepository repository;
	
	public PlanoAlimentar salvar(PlanoAlimentar planoAlimentar) {
		return repository.save(planoAlimentar);
	}
}
