package br.com.aesculapios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.aesculapios.models.Abastecimento;
import br.com.aesculapios.models.Despesa;

public interface AbastecimentoRepository extends JpaRepository<Abastecimento, Long> {
	@Query("SELECT d FROM Abastecimento d WHERE d.idVeiculo = ?1 and d.dataAbastecimento >= ?2 and d.dataAbastecimento <= ?3 ")
	List<Abastecimento> findAbastecimentoByIdCarroAndDataAndData(Long idVeiculo, java.util.Date dataIni, java.util.Date dataFim);

}
