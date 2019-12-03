package com.mycar.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycar.apirest.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
