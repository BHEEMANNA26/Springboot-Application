package com.mk.karnal.MKbrandAutoMobiles.controlloer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.mk.karnal.MKbrandAutoMobiles.Entity.Emplyoee;
import com.mk.karnal.MKbrandAutoMobiles.Service.EmplyoeeService;

@Controller
public class EmplyoeeControlloer {
	
	private EmplyoeeService emplyoeeService;

	public EmplyoeeControlloer(EmplyoeeService emplyoeeService) {
		super();
		this.emplyoeeService = emplyoeeService;
	}
	@GetMapping("/emplyoee")
	
	public String listEmplyoees(Model model) {
		model.addAttribute("emplyoee",emplyoeeService.getAllEmplyoess());
		return "emplyoee";
		
	}
	
	@GetMapping("/emplyoee/new")
	public String createEmplyooeForm(Model model) {
		Emplyoee emplyoee=new Emplyoee();
		model.addAttribute("emplyoee", emplyoee);
		return "create_emplyoee";
		
	}
	@PostMapping("/emplyoee")
	public String SaveEmplyoee(@ModelAttribute("emplyoee")Emplyoee emplyoee) {
		emplyoeeService.saveEmplyoee(emplyoee);
		return "redirect:/emplyoee";
		
	}
	@GetMapping("/emplyoee/edit/{id}")
	public String editEmplyoeeForm(@PathVariable Long id,Model model) {
		model.addAttribute("emplyoee",emplyoeeService.getEmplyoeeByid(id));
		return "edit_emplyoee";
	}

	@PostMapping("emplyoee/{id}")
	public String UpdateEmplyoee(@PathVariable Long id ,@ModelAttribute("emplyoee")Emplyoee emplyoee,Model model)
	{
//		get Emplyoee from databse by id
		Emplyoee exisEmplyoee=emplyoeeService.getEmplyoeeByid(id);
		exisEmplyoee.setFirstName(emplyoee.getFirstName());
		exisEmplyoee.setLastName(emplyoee.getLastName());
		exisEmplyoee.setEmail(emplyoee.getEmail());
		
//		save updated Emplyoee object
		emplyoeeService.UpdateEmplyoee(exisEmplyoee);
		return"redirect:/emplyoee";
		
	}
}
