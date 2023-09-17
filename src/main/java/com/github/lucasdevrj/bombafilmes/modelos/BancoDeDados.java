package com.github.lucasdevrj.bombafilmes.modelos;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {

	private static List<Filme> filmes = new ArrayList<>();
	
	public void adicionaFilme(Filme filme) {
		BancoDeDados.filmes.add(filme);
		System.out.println("O filme " + filme.getNome() + " foi adicionado com sucesso!");
	}
	
	public static List<Filme> getFilmes() {
		return filmes;
	}
}
