package br.com.projetoREST.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoREST.model.Consulta;
import br.com.projetoREST.repository.ConsultaRepository;

@Service
public class ConsultaService {

	@Autowired
	private ConsultaRepository consultaRepository;
	
	public Consulta salvarConsulta(Consulta consulta) {
		return consultaRepository.save(consulta);
	}
	
	public List<Consulta> listar(){
		return consultaRepository.findAll();
	}
}
