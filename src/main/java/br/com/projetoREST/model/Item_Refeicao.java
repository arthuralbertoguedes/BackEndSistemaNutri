package br.com.projetoREST.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item_Refeicao {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
//	
//	@ManyToOne
//	@JoinColumn(name="alimento_id")
//	private Alimento alimento;
//	
//	@ManyToOne
//	@JoinColumn(name="refeicao_id")
//	private Refeicao refeicao;
	
	private Long alimento_id;
	
	private Long refeicao_id;

	private String quantidade;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
//
//	public Alimento getAlimento() {
//		return alimento;
//	}
//
//	public void setAlimento(Alimento alimento) {
//		this.alimento = alimento;
//	}
//
//	public Refeicao getRefeicao() {
//		return refeicao;
//	}
//
//	public void setRefeicao(Refeicao refeicao) {
//		this.refeicao = refeicao;
//	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public Long getAlimento_id() {
		return alimento_id;
	}

	public void setAlimento_id(Long alimento_id) {
		this.alimento_id = alimento_id;
	}

	public Long getRefeicao_id() {
		return refeicao_id;
	}

	public void setRefeicao_id(Long refeicao_id) {
		this.refeicao_id = refeicao_id;
	}
	
	
	
}
