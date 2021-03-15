package br.com.aesculapios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aesculapios.models.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long>{

	
}
