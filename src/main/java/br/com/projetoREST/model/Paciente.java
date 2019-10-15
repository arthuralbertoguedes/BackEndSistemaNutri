package br.com.projetoREST.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Paciente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="nome",nullable=false)
	private String nome;
	
	@Column(name="genero",nullable=false)
	private char genero;

	@Column(name="dataNascimento",nullable=true)
	private LocalDate dataNascimento;
	
	@Column(name="telefone",nullable=true)
	private String telefone;
	
	@Column(name="email",nullable=true)
	private String email;
	
	@Column(name="dataCadastro", nullable=false)
	private LocalDateTime dataCadastro;

	@Column(name="ultima_consulta", nullable=true)
	private LocalDate ultimaConsulta;
	
	private String localImagem;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
	@OneToMany(mappedBy = "paciente")
	@JsonIgnore
	private List<Consulta> consulta = new ArrayList<>();
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco_id", referencedColumnName = "id")
	private Endereco endereco;
	
	@JsonIgnore
	@OneToOne(mappedBy="paciente", fetch = FetchType.LAZY)
	private Anamnese anamnese;
	
	/* Id do usuário do tipo nutricionista que cadastrou o paciente */ 
	@Column(name = "nutricionista_id", nullable = false)
	private Long nutricionista_id;
	


	@JsonIgnore
	@OneToOne(mappedBy="paciente", fetch = FetchType.LAZY)
	private Antropometria antropometria;
	
	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
	public Paciente() {}


	public Paciente(Long id, String nome, char genero, LocalDate dataNascimento, String telefone, String email,
			LocalDateTime dataCadastro, LocalDate ultimaConsulta, List<Consulta> consulta, Endereco endereco,
			Anamnese anamnese, Antropometria antropometria, String localImagem) {
		super();
		this.id = id;
		this.nome = nome;
		this.genero = genero;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.email = email;
		this.dataCadastro = dataCadastro;
		this.ultimaConsulta = ultimaConsulta;
		this.consulta = consulta;
		this.endereco = endereco;
		this.anamnese = anamnese;
		this.antropometria = antropometria;
		this.localImagem = localImagem;
	}




	public Anamnese getAnamnese() {
		return anamnese;
	}

	public void setAnamnese(Anamnese anamnese) {
		this.anamnese = anamnese;
	}

	public Antropometria getAntropometria() {
		return antropometria;
	}

	public void setAntropometria(Antropometria antropometria) {
		this.antropometria = antropometria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public List<Consulta> getConsulta() {
		return consulta;
	}

	public void setConsulta(List<Consulta> consulta) {
		this.consulta = consulta;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public String getLocalImagem() {
		return localImagem;
	}


	public void setLocalImagem(String localImagem) {
		this.localImagem = localImagem;
	}


	public Long getNutricionista_id() {
		return nutricionista_id;
	}


	public void setNutricionista_id(Long nutricionista_id) {
		this.nutricionista_id = nutricionista_id;
	}

	
	
}

/*spring.datasource.url=jdbc:postgresql://localhost:5432/SistemaNutri
spring.datasource.username=admin_sistema_nutri
spring.datasource.password=12345
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
hibernate.jdbc.lob.non_contextual_creation=true
spring.jpa.properties.hibernate.temp.use_jdbc_metadata_defaults = false*/
