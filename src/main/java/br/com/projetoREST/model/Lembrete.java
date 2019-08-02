package br.com.projetoREST.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lembrete {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	public String lembrete;
	
	public LocalDate dataLembrete;
	
	public Lembrete() {}

	public Lembrete(Long id, String lembrete, LocalDate dataLembrete) {
		super();
		this.id = id;
		this.lembrete = lembrete;
		this.dataLembrete = dataLembrete;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLembrete() {
		return lembrete;
	}

	public void setLembrete(String lembrete) {
		this.lembrete = lembrete;
	}

	public LocalDate getDataLembrete() {
		return dataLembrete;
	}

	public void setDataLembrete(LocalDate dataLembrete) {
		this.dataLembrete = dataLembrete;
	}
	
	

}
