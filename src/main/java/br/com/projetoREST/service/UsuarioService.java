package br.com.projetoREST.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoREST.model.Usuario;
import br.com.projetoREST.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository repository;
	
	public Optional<Usuario> buscarUsuario(Long id) {
		return this.repository.findById(new Long(1));
	}
	

}
