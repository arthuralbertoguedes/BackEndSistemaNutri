package br.com.projetoREST.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ComposicaoCorporal {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	
	private int massaGorda;

	private int massaMagra;
	
	private int aguaCorporal;
	
	private int pesoOsseo;
	
	private int pesoResidual;
	
	private int pesoMuscular;
	
	private int gorduraVisceral;
	
	private int idadeMetabolica;
	
	private int triceps;
	
	private int biceps;
	
	private int subescapular;
	
	private int axilarMedia;
	
	private int toracica;
	
	private int supraIliaca;
	
	private int abdominal;
	
	private int coxa;
	
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "paciente_id", referencedColumnName = "id")
	private Paciente paciente;
	
	
    public ComposicaoCorporal() {}


	public ComposicaoCorporal(Long id, int massaGorda, int massaMagra, int aguaCorporal, int pesoOsseo,
			int pesoResidual, int pesoMuscular, int gorduraVisceral, int idadeMetabolica, int triceps, int biceps,
			int subescapular, int axilarMedia, int toracica, int supraIliaca, int abdominal, int coxa,
			Paciente paciente) {
		super();
		Id = id;
		this.massaGorda = massaGorda;
		this.massaMagra = massaMagra;
		this.aguaCorporal = aguaCorporal;
		this.pesoOsseo = pesoOsseo;
		this.pesoResidual = pesoResidual;
		this.pesoMuscular = pesoMuscular;
		this.gorduraVisceral = gorduraVisceral;
		this.idadeMetabolica = idadeMetabolica;
		this.triceps = triceps;
		this.biceps = biceps;
		this.subescapular = subescapular;
		this.axilarMedia = axilarMedia;
		this.toracica = toracica;
		this.supraIliaca = supraIliaca;
		this.abdominal = abdominal;
		this.coxa = coxa;
		this.paciente = paciente;
	}


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public int getMassaGorda() {
		return massaGorda;
	}


	public void setMassaGorda(int massaGorda) {
		this.massaGorda = massaGorda;
	}


	public int getMassaMagra() {
		return massaMagra;
	}


	public void setMassaMagra(int massaMagra) {
		this.massaMagra = massaMagra;
	}


	public int getAguaCorporal() {
		return aguaCorporal;
	}


	public void setAguaCorporal(int aguaCorporal) {
		this.aguaCorporal = aguaCorporal;
	}


	public int getPesoOsseo() {
		return pesoOsseo;
	}


	public void setPesoOsseo(int pesoOsseo) {
		this.pesoOsseo = pesoOsseo;
	}


	public int getPesoResidual() {
		return pesoResidual;
	}


	public void setPesoResidual(int pesoResidual) {
		this.pesoResidual = pesoResidual;
	}


	public int getPesoMuscular() {
		return pesoMuscular;
	}


	public void setPesoMuscular(int pesoMuscular) {
		this.pesoMuscular = pesoMuscular;
	}


	public int getGorduraVisceral() {
		return gorduraVisceral;
	}


	public void setGorduraVisceral(int gorduraVisceral) {
		this.gorduraVisceral = gorduraVisceral;
	}


	public int getIdadeMetabolica() {
		return idadeMetabolica;
	}


	public void setIdadeMetabolica(int idadeMetabolica) {
		this.idadeMetabolica = idadeMetabolica;
	}


	public int getTriceps() {
		return triceps;
	}


	public void setTriceps(int triceps) {
		this.triceps = triceps;
	}


	public int getBiceps() {
		return biceps;
	}


	public void setBiceps(int biceps) {
		this.biceps = biceps;
	}


	public int getSubescapular() {
		return subescapular;
	}


	public void setSubescapular(int subescapular) {
		this.subescapular = subescapular;
	}


	public int getAxilarMedia() {
		return axilarMedia;
	}


	public void setAxilarMedia(int axilarMedia) {
		this.axilarMedia = axilarMedia;
	}


	public int getToracica() {
		return toracica;
	}


	public void setToracica(int toracica) {
		this.toracica = toracica;
	}


	public int getSupraIliaca() {
		return supraIliaca;
	}


	public void setSupraIliaca(int supraIliaca) {
		this.supraIliaca = supraIliaca;
	}


	public int getAbdominal() {
		return abdominal;
	}


	public void setAbdominal(int abdominal) {
		this.abdominal = abdominal;
	}


	public int getCoxa() {
		return coxa;
	}


	public void setCoxa(int coxa) {
		this.coxa = coxa;
	}


	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	
}
