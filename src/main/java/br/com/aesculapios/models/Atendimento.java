package br.com.aesculapios.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

@Entity
public class Atendimento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
	@NotEmpty
    private Date dataAtendimento;
    
	@ManyToOne
    @JoinColumn(name="id_paciente")
    private Paciente paciente;
	
	private TipoAtendimentoEnum tipoAtendimentoEnum;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataAtendimento() {
		return dataAtendimento;
	}

	public void setDataAtendimento(Date dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public TipoAtendimentoEnum getTipoAtendimentoEnum() {
		return tipoAtendimentoEnum;
	}

	public void setTipoAtendimentoEnum(TipoAtendimentoEnum tipoAtendimentoEnum) {
		this.tipoAtendimentoEnum = tipoAtendimentoEnum;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	

}
