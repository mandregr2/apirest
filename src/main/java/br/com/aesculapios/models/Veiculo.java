package br.com.aesculapios.models;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_veiculos")
public class Veiculo implements Serializable {
	
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long idUsuario;
    private String tipoVeiculo;
    private String marcaVeiculo;
    private double kilometragem;
    private String placa;

    protected Veiculo() {}

   
   

    @Override
    public String toString() {
        return String.format(
                "Veiculo[id=%d, tipoVeiculo='%s', marcaVeiculo='%s', kilometragem=%d]",
                id, tipoVeiculo, marcaVeiculo, kilometragem);
    }

    
	public Veiculo(Long id, String tipoVeiculo, String marcaVeiculo, double kilometragem, String placa) {
		super();
		this.id = id;
		this.tipoVeiculo = tipoVeiculo;
		this.marcaVeiculo = marcaVeiculo;
		this.kilometragem = kilometragem;
		this.placa = placa;
		
		
	}



	public Long getIdUsuario() {
		return idUsuario;
	}



	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}



	public String getPlaca() {
		return placa;
	}



	public void setPlaca(String placa) {
		this.placa = placa;
	}



	public Long getId() {
		return id;
	}

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}
	public double getKilometragem() {
		return kilometragem;
	}
}
