package br.com.projetoREST.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Consulta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	
	@Column(name="data_consulta", nullable = false)
	private LocalDate dataConsulta;

	@Column(name="horario_inicio", nullable = false)
	private String horarioInicio;
	
	@Column(name="horario_fim", nullable = false)
	private String horarioFim;
	
	@Column(name="informacoes_adicionais", nullable = true)
	private String informacoesAdicionais;
	
	@Column(name="id_paciente", nullable = false)
	private Long idPaciente;
	
	//Campo que será carregado no component FullCalendar
	//que corresponde ao dia/horario que começa a consulta do paciente
	@Column(name="horario_date_time")
	private LocalDateTime horarioDateTime;
	
	public Consulta() {}
	
	public Consulta(Long id, 
					LocalDate dataConsulta, 
					String horarioInicio, 
					String horarioFim,
					String informacoesAdicionais,
					Long idPaciente,
					LocalDateTime horarioSemFormatacao) {
		super();
		this.id = id;
		this.dataConsulta = dataConsulta;
		this.horarioInicio = horarioInicio;
		this.horarioFim = horarioFim;
		this.informacoesAdicionais = informacoesAdicionais;
		this.idPaciente = idPaciente;
		this.horarioDateTime = horarioSemFormatacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(LocalDate dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public String getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(String horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public String getHorarioFim() {
		return horarioFim;
	}

	public void setHorarioFim(String horarioFim) {
		this.horarioFim = horarioFim;
	}

	public String getInformacoesAdicionais() {
		return informacoesAdicionais;
	}

	public void setInformacoesAdicionais(String informacoesAdicionais) {
		this.informacoesAdicionais = informacoesAdicionais;
	}

	public Long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}

	
	public LocalDateTime getHorarioDateTime() {
		return horarioDateTime;
	}

	public void setHorarioDateTime(LocalDateTime horarioDateTime) {
		this.horarioDateTime = horarioDateTime;
	}

	@Override
	public String toString() {
		return "Consulta [id=" + id + ", dataConsulta=" + dataConsulta + ", horarioInicio=" + horarioInicio
				+ ", horarioFim=" + horarioFim + ", informacoesAdicionais=" + informacoesAdicionais + "]";
	}

	
}
