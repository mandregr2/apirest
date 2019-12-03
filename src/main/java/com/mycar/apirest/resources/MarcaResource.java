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

import com.mycar.apirest.models.Marca;
import com.mycar.apirest.repository.MarcaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value="API REST Marcas")
@CrossOrigin(origins="*")
public class MarcaResource {

	@Autowired
	MarcaRepository marcaRepository;

	// metodo para buscar todos os dados do banco
	@GetMapping("/marcas")
	@ApiOperation(value="Retorna uma lista de Marcas Cadastradas")
	public List<Marca> listaMarcas() {
		return marcaRepository.findAll();
	}

	 @GetMapping("/marca/{id}")
	 public Optional<Marca> listaMarcaUnica(@PathVariable(value="id") Long id){
	 return marcaRepository.findById(id);
	 }

	// metodo para salvar o item
	@PostMapping("/marca")
	@ApiOperation(value="Salva uma Marca Cadastrada")
	public Marca salvaMarca(@RequestBody Marca marca) {
		return marcaRepository.save(marca);
	}

	// metodo para deletar o item
	@DeleteMapping("/marca")
	@ApiOperation(value="Deleta uma Marca Cadastrada")
	public void deletaMarca(@RequestBody Marca marca) {
		marcaRepository.delete(marca);
	}

	// metodo para editar o item
	@PutMapping("/marca")
	@ApiOperation(value="Edita uma Marca Cadastrada")
	public Marca atualizaMarca(@RequestBody Marca marca) {
		return marcaRepository.save(marca);
	}
}