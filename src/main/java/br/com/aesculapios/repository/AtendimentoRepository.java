package br.com.aesculapios.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.aesculapios.models.Atendimento;

public interface AtendimentoRepository extends CrudRepository<Atendimento, String> {

	Atendimento findById(long Id);

}
