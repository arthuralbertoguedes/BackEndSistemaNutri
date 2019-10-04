package br.com.projetoREST.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoREST.model.Usuario;
import br.com.projetoREST.repository.UsuarioRepository;
import br.com.projetoREST.security.Criptografia;
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
		Usuario usuarioRetornado = this.repository.verificarUsuarioSenha(Criptografia.criptografar(login.getUsuario()), Criptografia.criptografar(login.getSenha()));
		
		//Caso tenha encontrado algum usuário com as informações correspondentes
		if(usuarioRetornado!=null)
			return usuarioRetornado;
		
		else
			return null;	
	}
	
	public Usuario verificarUsuarioSenhaPaciente(Login login) {
		
		//Verifica se as informações de login estão corretas
		Usuario usuarioRetornado = this.repository.verificarUsuarioSenhaPaciente(Criptografia.criptografar(login.getUsuario()), Criptografia.criptografar(login.getSenha()));
		
		//Caso tenha encontrado algum usuário com as informações correspondentes
		if(usuarioRetornado!=null)
			return usuarioRetornado;
		
		else
			return null;	
	}
	
	
	
	public Usuario salvar(Usuario usuario) {
		usuario.setLogin(Criptografia.criptografar(usuario.getLogin()));
		usuario.setSenha(Criptografia.criptografar(usuario.getSenha()));
		
		System.out.println(usuario);
		return repository.save(usuario);
	}
}
