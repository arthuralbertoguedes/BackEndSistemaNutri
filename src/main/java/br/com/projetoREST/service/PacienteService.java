package br.com.projetoREST.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import br.com.projetoREST.model.Paciente;
import br.com.projetoREST.repository.PacienteRepository;

@Service
public class PacienteService {
	
	@Autowired
	PacienteRepository pacienteRepository;
	
	public Long salvar(Paciente pessoa) {
		return pacienteRepository.save(pessoa).getId();
	}
	
	public List<Paciente> listarTodos(){
		return pacienteRepository.findAll();
	}
	
	public List<Paciente> listarPorNome(String nomePaciente){
		nomePaciente = "%" + nomePaciente + "%";
		return pacienteRepository.findByNome(nomePaciente);
	}
	
	
	public List<Paciente> listarUltimosCadastrados(){
		return pacienteRepository.listarUltimosCadastrados(PageRequest.of(0,3));
	}
	
	public Optional<Paciente> listarPorId(Long id){
		return pacienteRepository.findById(id);
	}

}	
