package br.com.projetoREST.service;

import java.util.List;

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
	
	public List<PlanoAlimentar> buscarPorPaciente(Long idPaciente) {
		return repository.buscarPorPaciente(idPaciente);
	}
}
