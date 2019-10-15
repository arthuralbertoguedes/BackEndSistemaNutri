package br.com.projetoREST.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoREST.model.Usuario;
import br.com.projetoREST.service.UsuarioService;

@RestController
@RequestMapping(value="/usuario")
public class UsuarioController {

	@Autowired
	UsuarioService service;
	
	@RequestMapping(value="/buscarUsuario/{id}", method = RequestMethod.GET)
	public Optional<Usuario> buscarUsuario(@PathVariable("id") Long id) {
		return this.service.buscarUsuario(id);
	}
	
	@PostMapping("/salvar")
	public Usuario salvar(@RequestBody Usuario usuario) {
		return service.salvar(usuario);	
	}
	
}
