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

import com.mycar.apirest.models.Despesa;
import com.mycar.apirest.repository.DespesaRepository;

@RestController
@RequestMapping(value = "/api")
public class DespesaResource {

	@Autowired
	DespesaRepository despesaRepository;

	// metodo para buscar todos os dados do banco
	@GetMapping("/despesas")
	public List<Despesa> listaDespesas() {
		return despesaRepository.findAll();
	}

	// metodo para buscar um unico item
	// @GetMapping("/despesas/{id}")
	// public Despesa listaDespesaUnica(@PathVariable(value="id") Long id){
	// return despesaRepository.findById(id);
	// }

	// metodo para salvar o item
	@PostMapping("/despesa")
	public Despesa salvaDespesa(@RequestBody Despesa despesa) {
		return despesaRepository.save(despesa);
	}

	// metodo para deletar o item
	@DeleteMapping("/despesa")
	public void deletaDespesa(@RequestBody Despesa despesa) {
		despesaRepository.delete(despesa);
	}

	// metodo para editar o item
	@PutMapping("/despesa")
	public Despesa atualizaDespesa(@RequestBody Despesa despesa) {
		return despesaRepository.save(despesa);
	}
}