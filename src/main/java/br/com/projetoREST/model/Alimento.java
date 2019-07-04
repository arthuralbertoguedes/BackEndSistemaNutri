package br.com.projetoREST.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alimento {	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long Id;
	
	private String codigo;
	
	private String descricao;
	
	private String codigo_preparacao;
	
	private String descricao_preparacao;
	
	private String referencia;
	
	private String descricao_referencia;

	private String energia;
	
	private String proteina;
	
	private String lipideos;
	
	private String carboidrato;
	
	private String fibra;
	
	private String calcio;

	private String magnesio;
	
	private String manganes;
	
	private String fosforo;
	
	private String ferro;
	
	private String sodio;
	
	private String sodio_adicao;
	
	private String potassio;
	
	private String cobre;
	
	private String zinco;
	
	private String selenio;
	
	private String retinol;
	
	private String vitamina;
	
	private String tiamina;
	
	private String vitamina_b2;
	
	private String vitamina_b3;
	
	private String equivalente_vitamina_b3;
	
	private String vitamina_b6;
	
	private String vitamina_b12;
	
	private String folato;
	
	private String vitamina_d;
	
	private String vitamina_e;
	
	private String vitamina_c;
	
	private String colesterol;
	
	private String acidos_graxos_saturados;
	
	private String acidos_graxos_insaturados;
	
	private String acucar;

	private String adicao_acucar;
	
	
	public Alimento() {}

	public Alimento(Long id, String codigo, String descricao, String codigo_preparacao, String descricao_preparacao,
			String referencia, String descricao_referencia, String energia, String proteina, String lipideos,
			String carboidrato, String fibra, String calcio, String magnesio, String manganes, String fosforo,
			String ferro, String sodio, String sodio_adicao, String potassio, String cobre, String zinco,
			String selenio, String retinol, String vitamina, String tiamina, String vitamina_b2, String vitamina_b3,
			String equivalente_vitamina_b3, String vitamina_b6, String vitamina_b12, String folato, String vitamina_d,
			String vitamina_3, String vitamina_c, String colesterol, String acidos_graxos_saturados,
			String acidos_graxos_insaturados, String acucar, String adicao_acucar) {
		Id = id;
		this.codigo = codigo;
		this.descricao = descricao;
		this.codigo_preparacao = codigo_preparacao;
		this.descricao_preparacao = descricao_preparacao;
		this.referencia = referencia;
		this.descricao_referencia = descricao_referencia;
		this.energia = energia;
		this.proteina = proteina;
		this.lipideos = lipideos;
		this.carboidrato = carboidrato;
		this.fibra = fibra;
		this.calcio = calcio;
		this.magnesio = magnesio;
		this.manganes = manganes;
		this.fosforo = fosforo;
		this.ferro = ferro;
		this.sodio = sodio;
		this.sodio_adicao = sodio_adicao;
		this.potassio = potassio;
		this.cobre = cobre;
		this.zinco = zinco;
		this.selenio = selenio;
		this.retinol = retinol;
		this.vitamina = vitamina;
		this.tiamina = tiamina;
		this.vitamina_b2 = vitamina_b2;
		this.vitamina_b3 = vitamina_b3;
		this.equivalente_vitamina_b3 = equivalente_vitamina_b3;
		this.vitamina_b6 = vitamina_b6;
		this.vitamina_b12 = vitamina_b12;
		this.folato = folato;
		this.vitamina_d = vitamina_d;
		this.vitamina_e = vitamina_3;
		this.vitamina_c = vitamina_c;
		this.colesterol = colesterol;
		this.acidos_graxos_saturados = acidos_graxos_saturados;
		this.acidos_graxos_insaturados = acidos_graxos_insaturados;
		this.acucar = acucar;
		this.adicao_acucar = adicao_acucar;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo_preparacao() {
		return codigo_preparacao;
	}

	public void setCodigo_preparacao(String codigo_preparacao) {
		this.codigo_preparacao = codigo_preparacao;
	}

	public String getDescricao_preparacao() {
		return descricao_preparacao;
	}

	public void setDescricao_preparacao(String descricao_preparacao) {
		this.descricao_preparacao = descricao_preparacao;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getDescricao_referencia() {
		return descricao_referencia;
	}

	public void setDescricao_referencia(String descricao_referencia) {
		this.descricao_referencia = descricao_referencia;
	}

	public String getEnergia() {
		return energia;
	}

	public void setEnergia(String energia) {
		this.energia = energia;
	}

	public String getProteina() {
		return proteina;
	}

	public void setProteina(String proteina) {
		this.proteina = proteina;
	}

	public String getLipideos() {
		return lipideos;
	}

	public void setLipideos(String lipideos) {
		this.lipideos = lipideos;
	}

	public String getCarboidrato() {
		return carboidrato;
	}

	public void setCarboidrato(String carboidrato) {
		this.carboidrato = carboidrato;
	}

	public String getFibra() {
		return fibra;
	}

	public void setFibra(String fibra) {
		this.fibra = fibra;
	}

	public String getCalcio() {
		return calcio;
	}

	public void setCalcio(String calcio) {
		this.calcio = calcio;
	}

	public String getMagnesio() {
		return magnesio;
	}

	public void setMagnesio(String magnesio) {
		this.magnesio = magnesio;
	}

	public String getManganes() {
		return manganes;
	}

	public void setManganes(String manganes) {
		this.manganes = manganes;
	}

	public String getFosforo() {
		return fosforo;
	}

	public void setFosforo(String fosforo) {
		this.fosforo = fosforo;
	}

	public String getFerro() {
		return ferro;
	}

	public void setFerro(String ferro) {
		this.ferro = ferro;
	}

	public String getSodio() {
		return sodio;
	}

	public void setSodio(String sodio) {
		this.sodio = sodio;
	}

	public String getSodio_adicao() {
		return sodio_adicao;
	}

	public void setSodio_adicao(String sodio_adicao) {
		this.sodio_adicao = sodio_adicao;
	}

	public String getPotassio() {
		return potassio;
	}

	public void setPotassio(String potassio) {
		this.potassio = potassio;
	}

	public String getCobre() {
		return cobre;
	}

	public void setCobre(String cobre) {
		this.cobre = cobre;
	}

	public String getZinco() {
		return zinco;
	}

	public void setZinco(String zinco) {
		this.zinco = zinco;
	}

	public String getSelenio() {
		return selenio;
	}

	public void setSelenio(String selenio) {
		this.selenio = selenio;
	}

	public String getRetinol() {
		return retinol;
	}

	public void setRetinol(String retinol) {
		this.retinol = retinol;
	}

	public String getVitamina() {
		return vitamina;
	}

	public void setVitamina(String vitamina) {
		this.vitamina = vitamina;
	}

	public String getTiamina() {
		return tiamina;
	}

	public void setTiamina(String tiamina) {
		this.tiamina = tiamina;
	}

	public String getVitamina_b2() {
		return vitamina_b2;
	}

	public void setVitamina_b2(String vitamina_b2) {
		this.vitamina_b2 = vitamina_b2;
	}

	public String getVitamina_b3() {
		return vitamina_b3;
	}

	public void setVitamina_b3(String vitamina_b3) {
		this.vitamina_b3 = vitamina_b3;
	}

	public String getEquivalente_vitamina_b3() {
		return equivalente_vitamina_b3;
	}

	public void setEquivalente_vitamina_b3(String equivalente_vitamina_b3) {
		this.equivalente_vitamina_b3 = equivalente_vitamina_b3;
	}

	public String getVitamina_b6() {
		return vitamina_b6;
	}

	public void setVitamina_b6(String vitamina_b6) {
		this.vitamina_b6 = vitamina_b6;
	}

	public String getVitamina_b12() {
		return vitamina_b12;
	}

	public void setVitamina_b12(String vitamina_b12) {
		this.vitamina_b12 = vitamina_b12;
	}

	public String getFolato() {
		return folato;
	}

	public void setFolato(String folato) {
		this.folato = folato;
	}

	public String getVitamina_d() {
		return vitamina_d;
	}

	public void setVitamina_d(String vitamina_d) {
		this.vitamina_d = vitamina_d;
	}

	public String getVitamina_3() {
		return vitamina_e;
	}

	public void setVitamina_3(String vitamina_3) {
		this.vitamina_e = vitamina_3;
	}

	public String getVitamina_c() {
		return vitamina_c;
	}

	public void setVitamina_c(String vitamina_c) {
		this.vitamina_c = vitamina_c;
	}

	public String getColesterol() {
		return colesterol;
	}

	public void setColesterol(String colesterol) {
		this.colesterol = colesterol;
	}

	public String getAcidos_graxos_saturados() {
		return acidos_graxos_saturados;
	}

	public void setAcidos_graxos_saturados(String acidos_graxos_saturados) {
		this.acidos_graxos_saturados = acidos_graxos_saturados;
	}

	public String getAcidos_graxos_insaturados() {
		return acidos_graxos_insaturados;
	}

	public void setAcidos_graxos_insaturados(String acidos_graxos_insaturados) {
		this.acidos_graxos_insaturados = acidos_graxos_insaturados;
	}

	public String getAcucar() {
		return acucar;
	}

	public void setAcucar(String acucar) {
		this.acucar = acucar;
	}

	public String getAdicao_acucar() {
		return adicao_acucar;
	}

	public void setAdicao_acucar(String adicao_acucar) {
		this.adicao_acucar = adicao_acucar;
	}
	
	
	

}
