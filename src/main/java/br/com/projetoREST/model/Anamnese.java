package br.com.projetoREST.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Anamnese {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long Id;

	@Column(nullable = true)
	private String objetivo;
	
	@Column(nullable = true)
	private String casoClinico;

	@Column(nullable = true)
	private String refeicoesFora;
	
	@Column(nullable = true)
	private String apetite;
	
	@Column(nullable = true)
	private boolean fumante;
	
	@Column
	private boolean bebidas;
	
	@Column
	private boolean academia;
	
	@Column(nullable = true)
	private String atividadesFisica;
	
	@Column(nullable = true)
	private int tempoDeSono;
	
	@Column(name="qualidade_de_sono",nullable = true)
	private String qualidadeDeSono;
	
	@Column
	private boolean gestante;
	
	@Column
	private boolean diabetes;
	
	@Column(nullable = true)
	private String alergias;
	
	@Column(nullable = true)
	private String sintomas;
	
	@Column(nullable = true)
	private String doencas;
	
	@Column(nullable = true)
	private String observacoes;
	
	@Column(nullable = true)
	private int quantidadeRefeicoes;
	
	@Column(nullable = true)
	private String suplementos;
	
	@Column(nullable = true)
	private String alimentosConsumidos;

	/*Para chave estrageira paciente_id*/
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "paciente_id", referencedColumnName="id")
	private Paciente paciente;
	
	
	public Anamnese() {}
	

	public Anamnese(Long id, String objetivo, String casoClinico, String refeicoesFora, String apetite, boolean fumante,
			boolean bebidas, boolean academia, String atividadesFisica, int tempoDeSono, String qualidadeDeSono,
			boolean gestante, boolean diabetes, String alergias, String sintomas, String doencas, String observacoes,
			int quantidadeRefeicoes, String suplementos, String alimentosConsumidos, Paciente paciente) {
		super();
		Id = id;
		this.objetivo = objetivo;
		this.casoClinico = casoClinico;
		this.refeicoesFora = refeicoesFora;
		this.apetite = apetite;
		this.fumante = fumante;
		this.bebidas = bebidas;
		this.academia = academia;
		this.atividadesFisica = atividadesFisica;
		this.tempoDeSono = tempoDeSono;
		this.qualidadeDeSono = qualidadeDeSono;
		this.gestante = gestante;
		this.diabetes = diabetes;
		this.alergias = alergias;
		this.sintomas = sintomas;
		this.doencas = doencas;
		this.observacoes = observacoes;
		this.quantidadeRefeicoes = quantidadeRefeicoes;
		this.suplementos = suplementos;
		this.alimentosConsumidos = alimentosConsumidos;
		this.paciente = paciente;
	}






	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public String getCasoClinico() {
		return casoClinico;
	}

	public void setCasoClinico(String casoClinico) {
		this.casoClinico = casoClinico;
	}

	public String getRefeicoesFora() {
		return refeicoesFora;
	}

	public void setRefeicoesFora(String refeicoesFora) {
		this.refeicoesFora = refeicoesFora;
	}

	public String getApetite() {
		return apetite;
	}

	public void setApetite(String apetite) {
		this.apetite = apetite;
	}

	public boolean isFumante() {
		return fumante;
	}

	public void setFumante(boolean fumante) {
		this.fumante = fumante;
	}

	public boolean isBebidas() {
		return bebidas;
	}

	public void setBebidas(boolean bebidas) {
		this.bebidas = bebidas;
	}


	public boolean isAcademia() {
		return academia;
	}


	public void setAcademia(boolean academia) {
		this.academia = academia;
	}


	public String getAtividadesFisica() {
		return atividadesFisica;
	}


	public void setAtividadesFisica(String atividadesFisica) {
		this.atividadesFisica = atividadesFisica;
	}


	public int getTempoDeSono() {
		return tempoDeSono;
	}



	public void setTempoDeSono(int tempoDeSono) {
		this.tempoDeSono = tempoDeSono;
	}


	public String getQualidadeDeSono() {
		return qualidadeDeSono;
	}


	public void setQualidadeDeSono(String qualidadeDeSono) {
		this.qualidadeDeSono = qualidadeDeSono;
	}

	public boolean isGestante() {
		return gestante;
	}

	public void setGestante(boolean gestante) {
		this.gestante = gestante;
	}

	public boolean isDiabetes() {
		return diabetes;
	}

	public void setDiabetes(boolean diabetes) {
		this.diabetes = diabetes;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}


	public String getSintomas() {
		return sintomas;
	}


	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}


	public String getDoencas() {
		return doencas;
	}


	public void setDoencas(String doencas) {
		this.doencas = doencas;
	}


	public String getObservacoes() {
		return observacoes;
	}


	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}


	public int getQuantidadeRefeicoes() {
		return quantidadeRefeicoes;
	}

	public void setQuantidadeRefeicoes(int quantidadeRefeicoes) {
		this.quantidadeRefeicoes = quantidadeRefeicoes;
	}


	public String getSuplementos() {
		return suplementos;
	}


	public void setSuplementos(String suplementos) {
		this.suplementos = suplementos;
	}


	public String getAlimentosConsumidos() {
		return alimentosConsumidos;
	}


	public void setAlimentosConsumidos(String alimentosConsumidos) {
		this.alimentosConsumidos = alimentosConsumidos;
	}

}
