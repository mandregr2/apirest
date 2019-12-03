package com.mycar.apirest.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycar.apirest.models.Usuario;
import com.mycar.apirest.repository.UsuarioRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value="API REST Usuarios")
@CrossOrigin(origins="*")
public class UsuarioResource {

	@Autowired
	UsuarioRepository usuarioRepository;

	// metodo para buscar todos os dados do banco
	@GetMapping("/usuarios")
	@ApiOperation(value="Retorna uma lista de Usuarios Cadastradas")
	public List<Usuario> listaUsuarios() {
		return usuarioRepository.findAll();
	}

	 //metodo para buscar um unico item
	 @GetMapping("/usuarios/{id}")
	 public Optional<Usuario> listaUsuarioUnica(@PathVariable(value="id") Long id){
	 return usuarioRepository.findById(id);
	 }

	// metodo para salvar o item
	@PostMapping("/usuario")
	@ApiOperation(value="Salva uma Usuario Cadastrada")
	public Usuario salvaUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	// metodo para deletar o item
	@DeleteMapping("/usuario")
	@ApiOperation(value="Deleta uma Usuario Cadastrada")
	public void deletaUsuario(@RequestBody Usuario usuario) {
		usuarioRepository.delete(usuario);
	}

	// metodo para editar o item
	@PutMapping("/usuario")
	@ApiOperation(value="Edita uma Usuario Cadastrada")
	public Usuario atualizaUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
}