package com.mycar.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycar.apirest.models.Marca;
import com.mycar.apirest.repository.MarcaRepository;

@RestController
@RequestMapping(value = "/api")
public class MarcaResource {

	@Autowired
	MarcaRepository marcaRepository;

	// metodo para buscar todos os dados do banco
	@GetMapping("/marcas")
	public List<Marca> listaMarcas() {
		return marcaRepository.findAll();
	}

	// metodo para buscar um unico item
	// @GetMapping("/marcas/{id}")
	// public Marca listaMarcaUnica(@PathVariable(value="id") Long id){
	// return marcaRepository.findById(id);
	// }

	// metodo para salvar o item
	@PostMapping("/marca")
	public Marca salvaMarca(@RequestBody Marca marca) {
		return marcaRepository.save(marca);
	}

	// metodo para deletar o item
	@DeleteMapping("/marca")
	public void deletaMarca(@RequestBody Marca marca) {
		marcaRepository.delete(marca);
	}

	// metodo para editar o item
	@PutMapping("/marca")
	public Marca atualizaMarca(@RequestBody Marca marca) {
		return marcaRepository.save(marca);
	}
}