package br.com.projetoREST.repository;

import javax.persistence.Entity;

public enum DiasDaSemana {

	DOMINGO(1,"Domingo"),
	SEGUNDA(2, "Segunda"),
	TERCA(3, "Terça"),
	QUARTA(4, "Quarta"),
	QUINTA(5, "Quinta"),
	SEXTA(6, "Sexta"),
	SABADO(7, "Sábado");
	
	private int codigoDia;
	
	private String nomeDiaDaSemana;
	
	
	private DiasDaSemana(int codigoDia, String nomeDiaDaSemana) {
		this.codigoDia = codigoDia;
		this.nomeDiaDaSemana = nomeDiaDaSemana;
	}

	public int getCodigoDia() {
		return codigoDia;
	}

	public void setCodigoDia(int codigoDia) {
		this.codigoDia = codigoDia;
	}

	public String getNomeDiaDaSemana() {
		return nomeDiaDaSemana;
	}

	public void setNomeDiaDaSemana(String nomeDiaDaSemana) {
		this.nomeDiaDaSemana = nomeDiaDaSemana;
	}
	
	//Converter um código num objeto do tipo DiasDaSemana
	public static DiasDaSemana getDiasDaSemanaByCodigo(int codigo) {
		
		for(DiasDaSemana dia: DiasDaSemana.values()) {
			if(dia.getCodigoDia() == codigo)
				return dia;
		}
		
		return null;
	}
	
	
}

