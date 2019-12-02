package com.mycar.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycar.apirest.models.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{

}
