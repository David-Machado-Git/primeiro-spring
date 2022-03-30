package br.com.projetosaulaprimeiroprojetospring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin()
@RestController()
@RequestMapping("/")
public class HomeController {

	public HomeController() {
		// TODO Auto-generated constructor stub
		System.out.println("Aeeee ! ! Funcionou!");
	}

}
