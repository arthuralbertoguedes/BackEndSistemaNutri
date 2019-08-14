package br.com.projetoREST.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.projetoREST.enums.TipoUsuario;

/*
* Entidade que salva os usuários do sistema  
* 	- Nutricionistas e assistentes 
*/													
@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	
	private String login;
	
	private String senha;
	
	private String nome;
	
	/* Status A para ativo e I para inativo */ 
	private char status;
	
	@Column(name = "tipo_usuario")
	@Enumerated(EnumType.STRING)
	private TipoUsuario tipo_usuario;
	
	public Usuario() {}
	

	public Usuario(Long id, String login, String senha, String nome, char status, TipoUsuario tipoUsuario) {
		super();
		this.id = id;
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.status = status;
		this.tipo_usuario = tipoUsuario;
	}

	

	public TipoUsuario getTipo_usuario() {
		return tipo_usuario;
	}


	public void setTipo_usuario(TipoUsuario tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}
	
	
}
