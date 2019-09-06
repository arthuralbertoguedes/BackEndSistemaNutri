package br.com.projetoREST.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoREST.model.Usuario;
import br.com.projetoREST.service.UsuarioService;

@RestController
@RequestMapping(value="/usuario")
public class UsuarioController {

	@Autowired
	UsuarioService service;
	
	@RequestMapping(value="/buscarUsuario", method = RequestMethod.GET)
	public Optional<Usuario> buscarUsuario() {
		return this.service.buscarUsuario(new Long(1));
	}
	
	@PostMapping("/salvar")
	public Usuario salvar(@RequestBody Usuario usuario) {
		return service.salvar(usuario);	
	}
	
}
