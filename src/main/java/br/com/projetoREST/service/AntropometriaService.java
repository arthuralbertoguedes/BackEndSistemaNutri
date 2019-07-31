package br.com.projetoREST.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoREST.model.Antropometria;
import br.com.projetoREST.repository.AntropometriaRepository;

@Service
public class AntropometriaService {
	
	@Autowired 
	private AntropometriaRepository repository;
	
	public Antropometria salvar(Antropometria antropometria) {
		return this.repository.save(antropometria);
	}
	
	public Optional<Antropometria> buscarPorIdPaciente(Long id){
		return this.repository.buscarPorIdPaciente(id);
	}

}
