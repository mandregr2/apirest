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

import com.mycar.apirest.models.Abastecimento;
import com.mycar.apirest.repository.AbastecimentoRepository;

@RestController
@RequestMapping(value = "/api")
public class AbastecimentoResource {

	@Autowired
	AbastecimentoRepository abastecimentoRepository;

	// metodo para buscar todos os dados do banco
	@GetMapping("/abastecimentos")
	public List<Abastecimento> listaAbastecimentos() {
		return abastecimentoRepository.findAll();
	}

	// metodo para buscar um unico item
	// @GetMapping("/abastecimentos/{id}")
	// public Abastecimento listaAbastecimentoUnica(@PathVariable(value="id") Long id){
	// return abastecimentoRepository.findById(id);
	// }

	// metodo para salvar o item
	@PostMapping("/abastecimento")
	public Abastecimento salvaAbastecimento(@RequestBody Abastecimento abastecimento) {
		return abastecimentoRepository.save(abastecimento);
	}

	// metodo para deletar o item
	@DeleteMapping("/abastecimento")
	public void deletaAbastecimento(@RequestBody Abastecimento abastecimento) {
		abastecimentoRepository.delete(abastecimento);
	}

	// metodo para editar o item
	@PutMapping("/abastecimento")
	public Abastecimento atualizaAbastecimento(@RequestBody Abastecimento abastecimento) {
		return abastecimentoRepository.save(abastecimento);
	}
}