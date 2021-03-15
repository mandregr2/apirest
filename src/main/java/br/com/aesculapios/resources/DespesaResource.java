package br.com.aesculapios.resources;

import java.sql.Date;
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

import br.com.aesculapios.models.Despesa;
import br.com.aesculapios.repository.DespesaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Despesas")
@CrossOrigin(origins = "*")
public class DespesaResource {

	@Autowired
	DespesaRepository despesaRepository;

	// metodo para buscar todos os dados do banco
	@GetMapping("/despesas")
	@ApiOperation(value = "Retorna uma lista de Despesas Cadastradas")
	public List<Despesa> listaDespesas() {
		return despesaRepository.findAll();
	}

	@GetMapping("/despesa/{id}")
	public Optional<Despesa> listadespesaUnica(@PathVariable(value = "id") Long id) {
		return despesaRepository.findById(id);
	}

	// metodo para salvar o item
	@PostMapping("/despesa")
	@ApiOperation(value = "Salva uma Despesa Cadastrada")
	public Despesa salvaDespesa(@RequestBody Despesa despesa) {
		return despesaRepository.save(despesa);
	}

	// metodo para deletar o item
	@DeleteMapping("/despesa")
	@ApiOperation(value = "Deleta uma Despesa Cadastrada")
	public void deletaDespesa(@RequestBody Despesa despesa) {
		despesaRepository.delete(despesa);
	}
	
	@CrossOrigin
	@GetMapping("/despesas/{idVeiculo}/{dataIni}/{dataFim}")
	@ApiOperation(value = "Busca Despesas entre datas e do veiculo selecionado")
	public List<Despesa> GetDespesa(@PathVariable(value = "idVeiculo") Long idVeiculo, @PathVariable(value = "dataIni") Date dataIni,
			@PathVariable(value = "dataFim") Date dataFim) {
		return (List<Despesa>) despesaRepository.findDespesaByIdCarroAndDataAndData(idVeiculo, dataIni, dataFim);
	}

	// metodo para editar o item
	@PutMapping("/despesa")
	@ApiOperation(value = "Edita uma Despesa Cadastrada")
	public Despesa atualizaDespesa(@RequestBody Despesa despesa) {
		return despesaRepository.save(despesa);
	}
}