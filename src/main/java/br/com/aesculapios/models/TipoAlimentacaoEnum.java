package br.com.aesculapios.models;

public enum TipoAlimentacaoEnum {

	BOA("Boa"), REGULAR("Regular"), PESSIMA("Péssima");

	private String descricao;

	TipoAlimentacaoEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
