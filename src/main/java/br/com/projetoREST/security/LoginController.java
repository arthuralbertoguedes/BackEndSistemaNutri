package br.com.projetoREST.security;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoREST.model.Usuario;
import br.com.projetoREST.service.UsuarioService;
import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping("/logar")
public class LoginController{
	
	private int duracaoToken = 60 * 1000 * 60;
	
	private String palavra_secreta = "abacaxi";
	
	@Autowired
	UsuarioService service;	
	
	
	@PostMapping("/autenticar")
	public Token autenticar(@RequestBody Login login, HttpServletRequest request, HttpServletResponse response) throws ServletException {
		//Buscar o usuário e ver se ele tem acesso
		
		Usuario usuarioPesquisado = null;
		
		// Buscar Nutricionista
		if(login.getTipo()==1) 
			usuarioPesquisado = this.service.verificarUsuarioSenha(login);
		
		// Buscar Paciente
		else
			usuarioPesquisado = this.service.verificarUsuarioSenhaPaciente(login);
		
		
		//Caso exista um usuario cadastrado com as informações enviadas pelo Login 
		if(usuarioPesquisado != null) {
			
			//Informações que serão colocadas no corpo do Token
			Map<String,Object> claims = new HashMap<>();
			claims.put("id_usuario", usuarioPesquisado.getId());
			claims.put("nome_usuario", usuarioPesquisado.getNome());
			
			//Gerar token com tempo de expiração e id e nome do usuário como parâmetros
			String token = Jwts.builder()
					.setSubject(usuarioPesquisado.getId().toString())
					.setClaims(claims)
					.setExpiration(new Date(System.currentTimeMillis() + duracaoToken))
					.signWith(SignatureAlgorithm.HS512, "NSI245@483SK38S9K4Slo29l")
					.compact();
			
			
			return new Token(token, usuarioPesquisado.getId(), null, usuarioPesquisado.getNome());
		}
		else {
			throw new ServletException("Login e/ou senha inválidos");
		}
	}

}
