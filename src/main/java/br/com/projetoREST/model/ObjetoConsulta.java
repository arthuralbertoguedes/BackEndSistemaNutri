package br.com.projetoREST.model;

import java.time.LocalDate;

public class ObjetoConsulta {
	
	private LocalDate data;
	
	public ObjetoConsulta() {}
	
	public ObjetoConsulta(LocalDate data) {
		this.data = data;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	
}
