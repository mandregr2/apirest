	package br.com.aesculapios.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Paciente implements Serializable{
	

   	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @NotEmpty
    private String nome;
    @NotEmpty
    private String cpf;
    @NotEmpty
    private TipoGeneroEnum tipoGeneroEnum;
    
    private String profissao;
    
    private String identidade;
    
    private String logradouro;
    
    private String numeroEndereco;
    
    private String complementoEndereco;
    
    private String cidade;
    
    private String bairro;
    
    private String pontoReferencia;
    
    private String email;
    
    private String telefoneCelular1;
    
    private String telefoneResidencial1;
    
    private String telefoneComercial1;
    
    private String observacoes;
    
      
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

	public TipoGeneroEnum getTipoGeneroEnum() {
		return tipoGeneroEnum;
	}

	public void setTipoGeneroEnum(TipoGeneroEnum tipoGeneroEnum) {
		this.tipoGeneroEnum = tipoGeneroEnum;
	}
	
	

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumeroEndereco() {
		return numeroEndereco;
	}

	public void setNumeroEndereco(String numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}

	public String getComplementoEndereco() {
		return complementoEndereco;
	}

	public void setComplementoEndereco(String complementoEndereco) {
		this.complementoEndereco = complementoEndereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getPontoReferencia() {
		return pontoReferencia;
	}

	public void setPontoReferencia(String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefoneCelular1() {
		return telefoneCelular1;
	}

	public void setTelefoneCelular1(String telefoneCelular1) {
		this.telefoneCelular1 = telefoneCelular1;
	}

	public String getTelefoneResidencial1() {
		return telefoneResidencial1;
	}

	public void setTelefoneResidencial1(String telefoneResidencial1) {
		this.telefoneResidencial1 = telefoneResidencial1;
	}

	public String getTelefoneComercial1() {
		return telefoneComercial1;
	}

	public void setTelefoneComercial1(String telefoneComercial1) {
		this.telefoneComercial1 = telefoneComercial1;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
    
    
    
  }
