package br.com.projetoREST.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa {
	
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
	
	@Column(name="isPaciente",nullable=false)
	private boolean isPaciente;
	
	@Column(name="dataCadastro", nullable=false)
	private LocalDate dataCadastro;

	
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

	public void setTelefone(String celular) {
		this.telefone = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isPaciente() {
		return isPaciente;
	}

	public void setIsPaciente(boolean isPaciente) {
		this.isPaciente = isPaciente;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	
	
}
