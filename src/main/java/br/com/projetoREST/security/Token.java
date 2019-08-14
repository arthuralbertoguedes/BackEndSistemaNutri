package br.com.projetoREST.security;

/* Classe que retorna o token e informações necessárias para permissões e validações do sistema */
public class Token {
	
	private String token;

	private Long usuario_id;
	
	private Long permissao_id;
	
	private String usuario_nome;
	
	
	public Token(String token, Long usuario_id, Long permissao_id, String usuario_nome) {
		this.token = token;
		this.usuario_id = usuario_id;
		this.permissao_id = permissao_id;
		this.usuario_nome = usuario_nome;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Long getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(Long usuario_id) {
		this.usuario_id = usuario_id;
	}

	public Long getPermissao_id() {
		return permissao_id;
	}

	public void setPermissao_id(Long permissao_id) {
		this.permissao_id = permissao_id;
	}

	public String getUsuario_nome() {
		return usuario_nome;
	}

	public void setUsuario_nome(String usuario_nome) {
		this.usuario_nome = usuario_nome;
	}
	
	
	
}
