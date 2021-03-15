package br.com.aesculapios.resources;

import java.sql.Date;
import java.util.List;

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

import br.com.aesculapios.models.Abastecimento;
import br.com.aesculapios.repository.AbastecimentoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Abastecimentos")
@CrossOrigin(origins = "*")
public class AbastecimentoResource {

	@Autowired
	AbastecimentoRepository abastecimentoRepository;

	// metodo para buscar todos os dados do banco
	@GetMapping("/abastecimentos")
	@ApiOperation(value = "Retorna uma lista de Abastecimentos Cadastrados")
	public List<Abastecimento> listaAbastecimentos() {
		return abastecimentoRepository.findAll();
	}

	// metodo para buscar um unico item
	// @GetMapping("/abastecimentos/{id}")
	// public Abastecimento listaAbastecimentoUnica(@PathVariable(value="id") Long
	// id){
	// return abastecimentoRepository.findById(id);
	// }

	// metodo para salvar o item
	@PostMapping("/abastecimento")
	@ApiOperation(value = "Salva um Abastecimento")
	public Abastecimento salvaAbastecimento(@RequestBody Abastecimento abastecimento) {
		return abastecimentoRepository.save(abastecimento);
	}

	// metodo para deletar o item
	@DeleteMapping("/abastecimento")
	@ApiOperation(value = "Deleta um Abastecimento Cadastrado")
	public void deletaAbastecimento(@RequestBody Abastecimento abastecimento) {
		abastecimentoRepository.delete(abastecimento);
	}

	// metodo para editar o item
	@PutMapping("/abastecimento")
	@ApiOperation(value = "Edita um Abastecimento Cadastrado")
	public Abastecimento atualizaAbastecimento(@RequestBody Abastecimento abastecimento) {
		return abastecimentoRepository.save(abastecimento);
	}
	
	@CrossOrigin
	@GetMapping("/abastecimentos/{idVeiculo}/{dataIni}/{dataFim}")
	@ApiOperation(value = "Busca Abastecimento entre datas e do veiculo selecionado")
	public List<Abastecimento> GetAbastecimento(@PathVariable(value = "idVeiculo") Long idVeiculo, @PathVariable(value = "dataIni") 
	Date dataIni, @PathVariable(value = "dataFim") Date dataFim) {
		
		return (List<Abastecimento>) abastecimentoRepository.findAbastecimentoByIdCarroAndDataAndData(idVeiculo, dataIni, dataFim);
	}
}