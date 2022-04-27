package com.generation.helloworld2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Hello World";
		
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Comunicação <br /> Persistência <br /> Atenção aos Detalhes <br /> Trabalho em Equipe";
		
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Definir os três elementos do desenvolvimento de uma marca pessoal <br /> Usar mídias sociais para construir uma presença digital e desenvolver minha marca pessoal <br /> Melhorar minha marca pessoal continuamente para aumentar minha rede de contatos";
				
	}
}
