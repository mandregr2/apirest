package com.mycar.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycar.apirest.models.Despesa;

public interface DespesaRepository extends JpaRepository<Despesa, Long>{

}
