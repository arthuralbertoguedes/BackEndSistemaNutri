package br.com.projetoREST.service;

import java.util.Optional;

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
	
	public Optional<Anamnese> buscarPorPacienteId(Long id){
		return this.repository.buscarPorPacienteId(id);
	}
}
