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

import com.mycar.apirest.models.Veiculo;
import com.mycar.apirest.repository.VeiculoRepository;

@RestController
@RequestMapping(value = "/api")
public class VeiculoResource {

	@Autowired
	VeiculoRepository veiculoRepository;

	// metodo para buscar todos os dados do banco
	@GetMapping("/veiculos")
	public List<Veiculo> listaVeiculos() {
		return veiculoRepository.findAll();
	}

	// metodo para buscar um unico item
	// @GetMapping("/veiculos/{id}")
	// public veiculo listaveiculoUnica(@PathVariable(value="id") Long id){
	// return veiculoRepository.findById(id);
	// }

	// metodo para salvar o item
	@PostMapping("/veiculo")
	public Veiculo salvaVeiculo(@RequestBody Veiculo veiculo) {
		return veiculoRepository.save(veiculo);
	}

	// metodo para deletar o item
	@DeleteMapping("/veiculo")
	public void deletaVeiculo(@RequestBody Veiculo veiculo) {
		veiculoRepository.delete(veiculo);
	}

	// metodo para editar o item
	@PutMapping("/veiculo")
	public Veiculo atualizaveiculo(@RequestBody Veiculo veiculo) {
		return veiculoRepository.save(veiculo);
	}
}