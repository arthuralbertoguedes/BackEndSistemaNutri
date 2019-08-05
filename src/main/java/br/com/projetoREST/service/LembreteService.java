package br.com.projetoREST.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoREST.model.Lembrete;
import br.com.projetoREST.repository.LembreteRepository;

@Service
public class LembreteService {

	@Autowired
	private LembreteRepository repository;
	
	public Lembrete salvar(Lembrete lembrete) {
		return this.repository.save(lembrete);
	}
	
	public List<Lembrete> buscarLembretesHoje(LocalDate dataDeHoje){
		return this.repository.buscarLembretesHoje(dataDeHoje);
	}
}
