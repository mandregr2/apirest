package com.mycar.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mycar.apirest.models.Abastecimento;
import com.mycar.apirest.models.Despesa;

public interface AbastecimentoRepository extends JpaRepository<Abastecimento, Long> {
	@Query("SELECT d FROM Abastecimento d WHERE d.idVeiculo = ?1 and d.dataAbastecimento >= ?2 and d.dataAbastecimento <= ?3 ")
	List<Abastecimento> findAbastecimentoByIdCarroAndDataAndData(Long idVeiculo, java.util.Date dataIni, java.util.Date dataFim);

}
