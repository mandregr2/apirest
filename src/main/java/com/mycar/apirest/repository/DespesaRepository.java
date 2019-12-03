package com.mycar.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mycar.apirest.models.Despesa;

public interface DespesaRepository extends JpaRepository<Despesa, Long>{
	
	@Query("SELECT d FROM Despesa d WHERE d.idVeiculo = ?1 and d.dataDespesa >= ?2 and d.dataDespesa <= ?3 ")
	List<Despesa> findDespesaByIdCarroAndDataAndData(Long idCarro, java.util.Date dataIni, java.util.Date dataFim);	

}
