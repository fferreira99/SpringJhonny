package com.senac.livraria.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "livro")
public class Livro {

	@Id
	@Column(name = "idlivro") //é muito importante que tudo esteja de acordo com o que está no banco
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "livro_nome")
	private String nome; 
	
	@ManyToOne()
	@JoinColumn(name = "categoria_id", nullable = false) //essa linha diz que a lista não aceitará livros sem categoria
	Categoria categoria; //um livro pertence a uma categoria
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
