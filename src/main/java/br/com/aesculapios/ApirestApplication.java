package br.com.aesculapios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.aesculapios.models.Atendimento;
import br.com.aesculapios.models.TipoAtendimentoEnum;

@SpringBootApplication
public class ApirestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApirestApplication.class, args);
		System.out.println("|SUBIU!!|");
		
	
	}

}
