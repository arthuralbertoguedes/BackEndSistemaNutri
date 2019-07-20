package br.com.projetoREST.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Paciente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	
	@Column(name="nome",nullable=false)
	private String nome;
	
	@Column(name="genero",nullable=false)
	private char genero;

	@Column(name="dataNascimento",nullable=true)
	private LocalDate dataNascimento;
	
	@Column(name="telefone",nullable=true)
	private String telefone;
	
	@Column(name="email",nullable=false)
	private String email;
	
	@Column(name="dataCadastro", nullable=false)
	private LocalDateTime dataCadastro;

	@Column(name="ultima_consulta", nullable=true)
	private LocalDate ultimaConsulta;
	
	public Paciente() {}

	public Paciente(Long id, String nome, char genero, LocalDate dataNascimento, String telefone, String email,
			LocalDateTime dataCadastro, LocalDate ultimaConsulta) {
		super();
		Id = id;
		this.nome = nome;
		this.genero = genero;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.email = email;
		this.dataCadastro = dataCadastro;
		this.ultimaConsulta = ultimaConsulta;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public LocalDate getUltimaConsulta() {
		return ultimaConsulta;
	}

	public void setUltimaConsulta(LocalDate ultimaConsulta) {
		this.ultimaConsulta = ultimaConsulta;
	}

}
