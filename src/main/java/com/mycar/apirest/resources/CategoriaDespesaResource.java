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

import com.mycar.apirest.models.CategoriaDespesa;
import com.mycar.apirest.repository.CategoriaDespesaRepository;

@RestController
@RequestMapping(value = "/api")
public class CategoriaDespesaResource {

	@Autowired
	CategoriaDespesaRepository categoriaDespesaRepository;

	// metodo para buscar todos os dados do banco
	@GetMapping("/categoriaDespesas")
	public List<CategoriaDespesa> listaCategoriaDespesas() {
		return categoriaDespesaRepository.findAll();
	}

	// metodo para buscar um unico item
	// @GetMapping("/categoriaDespesas/{id}")
	// public CategoriaDespesa listaCategoriaDespesaUnica(@PathVariable(value="id") Long id){
	// return categoriaDespesaRepository.findById(id);
	// }

	// metodo para salvar o item
	@PostMapping("/categoriaDespesa")
	public CategoriaDespesa salvaCategoriaDespesa(@RequestBody CategoriaDespesa categoriaDespesa) {
		return categoriaDespesaRepository.save(categoriaDespesa);
	}

	// metodo para deletar o item
	@DeleteMapping("/categoriaDespesa")
	public void deletaCategoriaDespesa(@RequestBody CategoriaDespesa categoriaDespesa) {
		categoriaDespesaRepository.delete(categoriaDespesa);
	}

	// metodo para editar o item
	@PutMapping("/categoriaDespesa")
	public CategoriaDespesa atualizaCategoriaDespesa(@RequestBody CategoriaDespesa categoriaDespesa) {
		return categoriaDespesaRepository.save(categoriaDespesa);
	}
}