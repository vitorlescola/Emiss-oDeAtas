package com.tcc.tcc_teste.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AtaController {
	
	
		@GetMapping("/")
		public String showForm() {
			return "form";
		}
}