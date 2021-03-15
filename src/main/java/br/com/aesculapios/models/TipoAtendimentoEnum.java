package br.com.aesculapios.models;

public enum TipoAtendimentoEnum {
	
	ACUPUNTURA("Acupuntura"),
	FISIOTERAPIA("Fisioterapia"),
	NEOPILATES("NeoPilates"),
	REIKI("Reiki"),
	SHIATSU("Shiatsu");
	
	private String descricao;
	
	TipoAtendimentoEnum(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
