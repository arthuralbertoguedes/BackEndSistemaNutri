package br.com.projetoREST.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class PlanoAlimentar {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private Long paciente_id;
	
	private LocalDateTime data_horario_cadastro;
	
	//Id do usuário do tipo nutricionista que cadastrou o plano alimentar
	private Long nutricionista_id;
	
	@OneToMany(mappedBy="planoAlimentar", cascade = CascadeType.ALL)
	private List<Refeicao> refeicoes = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPaciente_id() {
		return paciente_id;
	}

	public void setPaciente_id(Long paciente_id) {
		this.paciente_id = paciente_id;
	}

	public LocalDateTime getData_horario_cadastro() {
		return data_horario_cadastro;
	}

	public void setData_horario_cadastro(LocalDateTime data_horario_cadastro) {
		this.data_horario_cadastro = data_horario_cadastro;
	}

	public Long getNutricionista_id() {
		return nutricionista_id;
	}

	public void setNutricionista_id(Long nutricionista_id) {
		this.nutricionista_id = nutricionista_id;
	}

	public List<Refeicao> getRefeicoes() {
		return refeicoes;
	}

	public void setRefeicoes(List<Refeicao> refeicoes) {
		this.refeicoes = refeicoes;
	}
	
	
	
}
