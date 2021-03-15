package br.com.aesculapios.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Anamnese implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
	@ManyToOne
    @JoinColumn(name="id_atendimento")
    private Atendimento atendimento;
	
	private Date dataPrimeiraConsulta;
	
	private String historicoDoencaAtual;
	
	private String biotipo;
	
	private String disturbiosMtc;
	
	private boolean isTabagismo;
	
	private int quantidadeCigarrosDia;
	
	private boolean isAlcolismo;
	
	private  int quantidadeBebidasDia;
	
	private TipoAlimentacaoEnum tipoAlimentacaoEnum;
	
	private boolean isPraticaAtividadeFisica;
	
	private String tipoAtividadeFisica;
	
	private boolean isAnticoncepcional;
	
	private String nomeAnticoncepcional;
	
	private boolean isGestacao;
	
	private int quantidadeGestacoes;
	
	private double quantidadeAnosUltimaGestacao;
	
	
	
	

}
