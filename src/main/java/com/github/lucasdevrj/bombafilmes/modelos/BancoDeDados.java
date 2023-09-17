package com.github.lucasdevrj.bombafilmes.modelos;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {

	private List<Filme> filmes = new ArrayList<>();
	
	public void adicionaFilme(Filme filme) {
		this.filmes.add(filme);
		System.out.println("O filme " + filme.getNome() + " foi adicionado com sucesso!");
	}
}
