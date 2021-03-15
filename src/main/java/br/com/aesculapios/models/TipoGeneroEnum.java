package br.com.aesculapios.models;

public enum TipoGeneroEnum {
	
	MASCULINO("Masculino"),
	FEMININO("Feminino");

	private String descricao;
	
	TipoGeneroEnum(String descricao){
		this.descricao = descricao;
		
	}
	
	public String getDescricao() {
		return descricao;
	}
}
