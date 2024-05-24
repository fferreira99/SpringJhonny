package com.senac.livraria.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.senac.livraria.entity.Livro;
import com.senac.livraria.service.LivroService;

@RestController
@RequestMapping(name = "api/livro")
public class LivroController {

	private LivroService livroService;

	public LivroController(LivroService livroService) {
		this.livroService = livroService;
	} 
	
	@GetMapping(value = "listarLivros")
	public ResponseEntity<List<Livro>> listarLivros() {
		return ResponseEntity.ok(livroService.buscarLivro());
	}
}
