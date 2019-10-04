package br.com.projetoREST.security;

import org.springframework.stereotype.Component;

/* Login é apenas um objeto que vai carregar 
* da tela de Login do sistema até realizar a checagem para logar.
* O objeto Usuario que é responsável por salvar todas as informações
* de um usuário que serão transitadas e utilizadas para permissoes.
* */

public class Login {

	private Long id;
	
	private String usuario;
	
	private String senha;
	
	private int tipo;
	
	public Login() {}

	public Login(String usuario, String senha, Long id, int tipo) {
		super();
		this.usuario = usuario;
		this.senha = senha;
		this.id = id;
		this.tipo = tipo;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
}
