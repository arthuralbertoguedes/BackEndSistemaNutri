package br.com.projetoREST.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoREST.model.Pessoa;
import br.com.projetoREST.repository.PacienteRepository;

@Service
public class PacienteService {
	
	@Autowired
	PacienteRepository pessoaRepository;
	
	public Long salvar(Pessoa pessoa) {
		return pessoaRepository.save(pessoa).getId();
	}
	
	public List<Pessoa> listarTodos(){
		return pessoaRepository.findAll();
	}
	
	public List<Pessoa> listarPorNome(String nomePaciente){
		nomePaciente = "%" + nomePaciente + "%";
		return pessoaRepository.findByNome(nomePaciente);
	}
	
}
