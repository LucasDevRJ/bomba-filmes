package com.github.lucasdevrj.bombafilmes.modelos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BancoDeDados {

	private static List<Filme> filmes = new ArrayList<>();
	private static Integer identificador = 1;
	
	static {
		Filme filme = new Filme("The Professional", 
		"Quando a família de Mathilda, de 12 anos, é morta, seu vizinho Leon, que é um assassino profissional, relutantemente a coloca sob sua proteção e lhe ensina os segredos de seu ofício.",
		"18", "Ação", "Jean Reno, Natalie Portman, Gary Oldman", 110, 
		"https://m.media-amazon.com/images/M/MV5BOTgyMWQ0ZWUtN2Q2MS00NmY0LWI3OWMtNjFkMzZlNDZjNTk0XkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_.jpg",
		1994);
		filme.setId(BancoDeDados.identificador++);
		filmes.add(filme);
		
		Filme filme2 = new Filme("Corações de Ferro", 
		"Don, junto com sua tripulação de cinco membros, embarca em uma missão que coloca muitas vidas em perigo enquanto se preparam para atacar o exército nazista."
		, "18", "Guerra", "Alicia von Rittberg, Jon Bernthal, Shia LaBeouf", 134, 
		"https://m.media-amazon.com/images/M/MV5BMjA4MDU0NTUyN15BMl5BanBnXkFtZTgwMzQxMzY4MjE@._V1_.jpg",
		2014);
		filme2.setId(BancoDeDados.identificador++);
		filmes.add(filme2);
	}
	
	public void adicionaFilme(Filme filme) {
		filme.setId(BancoDeDados.identificador++);
		BancoDeDados.filmes.add(filme);
		System.out.println("O filme " + filme.getNome() + " foi adicionado com sucesso!");
	}
	
	public void removeFilme(Integer id) {
		Iterator<Filme> it = filmes.iterator();
		
		while (it.hasNext()) {
			Filme filme = it.next();
			
			if (filme.getId() == id) {
				it.remove();
			}
		}
	}
	
	public List<Filme> getFilmes() {
		return filmes;
	}

	public Filme buscaFilme(Integer id) {
		for (Filme filme : filmes) {
			if (filme.getId() == id) {
				return filme;
			}
		}
		return null;
	}
}
