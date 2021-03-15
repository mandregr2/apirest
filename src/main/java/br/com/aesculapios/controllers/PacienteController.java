package br.com.aesculapios.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.aesculapios.models.Paciente;
import br.com.aesculapios.repository.PacienteRepository;

@Controller
public class PacienteController {

	@Autowired
	private PacienteRepository pr;

	@RequestMapping(value = "/cadastrarPaciente", method = RequestMethod.GET)
	public String form() {
		return "paciente/formPaciente";
	}

	@RequestMapping(value = "/cadastrarPaciente", method = RequestMethod.POST)
	public String form(@Valid Paciente paciente, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			attributes.addFlashAttribute("mensagem", "Verifique os campos!");
			return "redirect:/cadastrarPaciente";
		}
		pr.save(paciente);
		attributes.addFlashAttribute("mensagem", "Evento cadastrado com sucesso!");
		return "redirect:/cadastrarEvento";
	}

	@RequestMapping("/pacientes")
	public ModelAndView listaPacientes(){
		ModelAndView mv = new ModelAndView("listaPacientes");
		Iterable<Paciente> pacientes = pr.findAll();
		mv.addObject("pacientes", pacientes);
		return mv;
	}

	
	@RequestMapping("/deletarPaciente")
	public String deletarPaciente(long id) {
		Paciente paciente = pr.findById(id);
		pr.delete(paciente);
		return "redirect:/pacientes";
	}

	
}
