package br.com.aesculapios.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class EvolucaoFisioterapeutica implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
	@ManyToOne
    @JoinColumn(name="id_paciente")
    private Paciente paciente;
	
	@ManyToOne
    @JoinColumn(name="id_atendimento")
    private Atendimento atendimento;
	
	private Date dataAvaliacao;
	
	private String descricaoEvolucao;
	

	
	
    
}
