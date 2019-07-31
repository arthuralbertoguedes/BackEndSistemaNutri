package br.com.projetoREST.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Antropometria {
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long Id;
		
		private int altura;
		
		private int peso;
		
		private int imc;
		
		private int idade;
		
		private String observacao;
		
		private int bracoRelaxadoDireito;
		
		private int bracoContraidoDireito;
		
		private int bracoRelaxadoEsquerdo;
		
		private int bracoContraidoEsquerdo;
		
		private int antebracoContraidoDireito;
		
		private int antebracoRelaxadoDireito;
		
		private int antebracoRelaxadoEsquerdo;
		
		private int antebracoContraidoEsquerdo;
	
		private int panturrilhaEsquerda;
		
		private int panturrilhaDireita;
		
		private int coxaEsquerda;
		
		private int coxaDireita;
		
		private int pescoco;
		
		private int ombro;
		
		private int peitoral;
		
		private int cintura;
		
		@OneToOne(cascade = CascadeType.MERGE)
		@JoinColumn(name="paciente_id", referencedColumnName="id")
		private Paciente paciente;
		
		
		public Antropometria() {}


		public Antropometria(Long id, int altura, int peso, int imc, int idade, String observacao,
				int bracoRelaxadoDireito, int bracoContraidoDireito, int bracoRelaxadoEsquerdo,
				int bracoContraidoEsquerdo, int antebracoContraidoDireito, int antebracoRelaxadoDireito,
				int antebracoRelaxadoEsquerdo, int antebracoContraidoEsquerdo, int panturrilhaEsquerda,
				int panturrilhaDireita, int coxaEsquerda, int coxaDireita, int pescoco, int ombro, int peitoral,
				int cintura, Paciente paciente) {
			super();
			Id = id;
			this.altura = altura;
			this.peso = peso;
			this.imc = imc;
			this.idade = idade;
			this.observacao = observacao;
			this.bracoRelaxadoDireito = bracoRelaxadoDireito;
			this.bracoContraidoDireito = bracoContraidoDireito;
			this.bracoRelaxadoEsquerdo = bracoRelaxadoEsquerdo;
			this.bracoContraidoEsquerdo = bracoContraidoEsquerdo;
			this.antebracoContraidoDireito = antebracoContraidoDireito;
			this.antebracoRelaxadoDireito = antebracoRelaxadoDireito;
			this.antebracoRelaxadoEsquerdo = antebracoRelaxadoEsquerdo;
			this.antebracoContraidoEsquerdo = antebracoContraidoEsquerdo;
			this.panturrilhaEsquerda = panturrilhaEsquerda;
			this.panturrilhaDireita = panturrilhaDireita;
			this.coxaEsquerda = coxaEsquerda;
			this.coxaDireita = coxaDireita;
			this.pescoco = pescoco;
			this.ombro = ombro;
			this.peitoral = peitoral;
			this.cintura = cintura;
			this.paciente = paciente;
		}


		public Long getId() {
			return Id;
		}


		public void setId(Long id) {
			Id = id;
		}


		public int getAltura() {
			return altura;
		}


		public void setAltura(int altura) {
			this.altura = altura;
		}


		public int getPeso() {
			return peso;
		}


		public void setPeso(int peso) {
			this.peso = peso;
		}


		public int getImc() {
			return imc;
		}


		public void setImc(int imc) {
			this.imc = imc;
		}


		public int getIdade() {
			return idade;
		}


		public void setIdade(int idade) {
			this.idade = idade;
		}


		public String getObservacao() {
			return observacao;
		}


		public void setObservacao(String observacao) {
			this.observacao = observacao;
		}


		public int getBracoRelaxadoDireito() {
			return bracoRelaxadoDireito;
		}


		public void setBracoRelaxadoDireito(int bracoRelaxadoDireito) {
			this.bracoRelaxadoDireito = bracoRelaxadoDireito;
		}


		public int getBracoContraidoDireito() {
			return bracoContraidoDireito;
		}


		public void setBracoContraidoDireito(int bracoContraidoDireito) {
			this.bracoContraidoDireito = bracoContraidoDireito;
		}


		public int getBracoRelaxadoEsquerdo() {
			return bracoRelaxadoEsquerdo;
		}


		public void setBracoRelaxadoEsquerdo(int bracoRelaxadoEsquerdo) {
			this.bracoRelaxadoEsquerdo = bracoRelaxadoEsquerdo;
		}


		public int getBracoContraidoEsquerdo() {
			return bracoContraidoEsquerdo;
		}


		public void setBracoContraidoEsquerdo(int bracoContraidoEsquerdo) {
			this.bracoContraidoEsquerdo = bracoContraidoEsquerdo;
		}


		public int getAntebracoContraidoDireito() {
			return antebracoContraidoDireito;
		}


		public void setAntebracoContraidoDireito(int antebracoContraidoDireito) {
			this.antebracoContraidoDireito = antebracoContraidoDireito;
		}


		public int getAntebracoRelaxadoDireito() {
			return antebracoRelaxadoDireito;
		}


		public void setAntebracoRelaxadoDireito(int antebracoRelaxadoDireito) {
			this.antebracoRelaxadoDireito = antebracoRelaxadoDireito;
		}


		public int getAntebracoRelaxadoEsquerdo() {
			return antebracoRelaxadoEsquerdo;
		}


		public void setAntebracoRelaxadoEsquerdo(int antebracoRelaxadoEsquerdo) {
			this.antebracoRelaxadoEsquerdo = antebracoRelaxadoEsquerdo;
		}


		public int getAntebracoContraidoEsquerdo() {
			return antebracoContraidoEsquerdo;
		}


		public void setAntebracoContraidoEsquerdo(int antebracoContraidoEsquerdo) {
			this.antebracoContraidoEsquerdo = antebracoContraidoEsquerdo;
		}


		public int getPanturrilhaEsquerda() {
			return panturrilhaEsquerda;
		}


		public void setPanturrilhaEsquerda(int panturrilhaEsquerda) {
			this.panturrilhaEsquerda = panturrilhaEsquerda;
		}


		public int getPanturrilhaDireita() {
			return panturrilhaDireita;
		}


		public void setPanturrilhaDireita(int panturrilhaDireita) {
			this.panturrilhaDireita = panturrilhaDireita;
		}


		public int getCoxaEsquerda() {
			return coxaEsquerda;
		}


		public void setCoxaEsquerda(int coxaEsquerda) {
			this.coxaEsquerda = coxaEsquerda;
		}


		public int getCoxaDireita() {
			return coxaDireita;
		}


		public void setCoxaDireita(int coxaDireita) {
			this.coxaDireita = coxaDireita;
		}


		public int getPescoco() {
			return pescoco;
		}


		public void setPescoco(int pescoco) {
			this.pescoco = pescoco;
		}


		public int getOmbro() {
			return ombro;
		}


		public void setOmbro(int ombro) {
			this.ombro = ombro;
		}


		public int getPeitoral() {
			return peitoral;
		}


		public void setPeitoral(int peitoral) {
			this.peitoral = peitoral;
		}


		public int getCintura() {
			return cintura;
		}


		public void setCintura(int cintura) {
			this.cintura = cintura;
		}


		public Paciente getPaciente() {
			return paciente;
		}


		public void setPaciente(Paciente paciente) {
			this.paciente = paciente;
		}
		
		

		
}
