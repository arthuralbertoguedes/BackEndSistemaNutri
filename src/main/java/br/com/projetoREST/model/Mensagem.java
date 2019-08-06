package br.com.projetoREST.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Mensagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	
	private String mensagem;
	
	private LocalDateTime horario;
	
	private boolean foiLida;
	
	@OneToOne
	@JoinColumn(name="usuario_id")
	private Usuario usuario;
	
	@OneToOne
	@JoinColumn(name="paciente_id")
	private Paciente paciente;
	
	public Mensagem() {}

	public Mensagem(Long id, String mensagem, LocalDateTime horario, boolean foiLida, Usuario usuario,
			Paciente paciente) {
		super();
		this.id = id;
		this.mensagem = mensagem;
		this.horario = horario;
		this.foiLida = foiLida;
		this.usuario = usuario;
		this.paciente = paciente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public LocalDateTime getHorario() {
		return horario;
	}

	public void setHorario(LocalDateTime horario) {
		this.horario = horario;
	}

	public boolean isFoiLida() {
		return foiLida;
	}

	public void setFoiLida(boolean foiLida) {
		this.foiLida = foiLida;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	
}
