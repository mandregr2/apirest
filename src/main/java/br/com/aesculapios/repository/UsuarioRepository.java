package br.com.aesculapios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aesculapios.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
