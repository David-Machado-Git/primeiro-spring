package br.com.projetosaulaprimeiroprojetospring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetosaulaprimeiroprojetospring.entity.Filme;
import br.com.projetosaulaprimeiroprojetospring.repository.FilmeRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/filmes")


public class FilmeController {
	
	@Autowired
	FilmeRepository filmeRepository;

	public FilmeController() {}
	
	@GetMapping
	public List<Filme> getList() {
		return filmeRepository.findAll();
		
	}
	
	@GetMapping("/{id}")
	public Filme getFilmeById(@PathVariable("id") Long id) throws Exception {
		Filme filme = filmeRepository.findById(id)
				.orElseThrow(() -> new Exception(" Filme não encontrado = " + id) );
		return filme;
		
	}
	
	
	@PostMapping
	public boolean saveFilm(@RequestBody Filme filme) throws Exception {
		if (filme == null) {
			return false;
		}
		Filme filmeResponse =  filmeRepository.save(filme);
		return true;
		
	}
	
	

}
