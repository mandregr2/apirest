package com.mycar.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycar.apirest.models.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long>{

	
}
