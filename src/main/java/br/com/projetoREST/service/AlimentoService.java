package br.com.projetoREST.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoREST.model.Alimento;
import br.com.projetoREST.repository.AlimentoRepository;

@Service
public class AlimentoService {
	
	@Autowired
	private AlimentoRepository repository;
	
	public Alimento[] listarAlimentos(String pesquisa) {
		if(pesquisa==null)
			 pesquisa = "%%";
		else
			pesquisa = "%" + pesquisa + "%";
		return this.repository.listarPorNome(pesquisa.toUpperCase());
	}
}
