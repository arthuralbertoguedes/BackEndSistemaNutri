package br.com.projetoREST.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoREST.model.Usuario;
import br.com.projetoREST.repository.UsuarioRepository;
import br.com.projetoREST.security.Login;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository repository;
	
	public Optional<Usuario> buscarUsuario(Long id) {
		return this.repository.findById(new Long(1));
	}
	
	public Usuario verificarUsuarioSenha(Login login) {
		
		//Verifica se as informações de login estão corretas
		Usuario usuarioRetornado = this.repository.verificarUsuarioSenha(login.getUsuario(), login.getSenha());
		
		//Caso tenha encontrado algum usuário com as informações correspondentes
		if(usuarioRetornado!=null)
			return usuarioRetornado;
		
		else
			return null;	
	}
}
