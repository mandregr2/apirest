package br.com.aesculapios.resources;

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

import br.com.aesculapios.models.CategoriaDespesa;
import br.com.aesculapios.models.Veiculo;
import br.com.aesculapios.repository.CategoriaDespesaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value="API REST Categoria de Despesas")
@CrossOrigin(origins="*")
public class CategoriaDespesaResource {

	@Autowired
	CategoriaDespesaRepository categoriaDespesaRepository;

	// metodo para buscar todos os dados do banco
	@GetMapping("/categoriaDespesas")
	@ApiOperation(value="Retorna uma lista de Categorias de Despesas Cadastradas")
	public List<CategoriaDespesa> listaCategoriaDespesas() {
		return categoriaDespesaRepository.findAll();
	}

	 @GetMapping("/categoriaDespesa/{id}")
	 @ApiOperation(value="Retorna um Categorias de Despesas Buscada")
	 public Optional<CategoriaDespesa> listaCategoriaDespesaUnica(@PathVariable(value="id") Long id){
	 return categoriaDespesaRepository.findById(id);
	 }

	// metodo para salvar o item
	@PostMapping("/categoriaDespesa")
	@ApiOperation(value="Salva uma Categoria de Despesa Cadastrada")
	public CategoriaDespesa salvaCategoriaDespesa(@RequestBody CategoriaDespesa categoriaDespesa) {
		return categoriaDespesaRepository.save(categoriaDespesa);
	}

	// metodo para deletar o item
	@DeleteMapping("/categoriaDespesa")
	@ApiOperation(value="Deleta uma Categoria de Despesa Cadastrada")
	public void deletaCategoriaDespesa(@RequestBody CategoriaDespesa categoriaDespesa) {
		categoriaDespesaRepository.delete(categoriaDespesa);
	}

	// metodo para editar o item
	@PutMapping("/categoriaDespesa")
	@ApiOperation(value="Edita uma Categoria de Despesa Cadastrada")
	public CategoriaDespesa atualizaCategoriaDespesa(@RequestBody CategoriaDespesa categoriaDespesa) {
		return categoriaDespesaRepository.save(categoriaDespesa);
	}
}