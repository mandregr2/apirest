package br.com.aesculapios.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.aesculapios.models.Atendimento;
import br.com.aesculapios.repository.AtendimentoRepository;

@Controller
public class AtendimentoController {

	@Autowired
	private AtendimentoRepository ar;

	@RequestMapping(value = "/cadastrarAtendimento", method = RequestMethod.GET)
	public String form() {
		return "atendimento/formAtendimento";
	}

	@RequestMapping(value = "/cadastrarAtendimento", method = RequestMethod.POST)
	public String form(@Valid Atendimento atendimento, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			attributes.addFlashAttribute("mensagem", "Verifique os campos!");
			return "redirect:/cadastrarAtendimento";
		}
		
		ar.save(atendimento);
		attributes.addFlashAttribute("mensagem", "Atendimento cadastrado com sucesso!");
		return "redirect:/cadastrarAtendimento";
	}
	

}
