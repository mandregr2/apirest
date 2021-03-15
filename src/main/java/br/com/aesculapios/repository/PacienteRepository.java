package br.com.aesculapios.repository;

import br.com.aesculapios.models.Paciente;
import org.springframework.data.repository.CrudRepository;

public interface PacienteRepository extends CrudRepository<Paciente, String> {
	
	Paciente findById(long Id);

}

