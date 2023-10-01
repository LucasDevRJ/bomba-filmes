package com.github.lucasdevrj.bombafilmes.modelos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BancoDeDados {

	private static List<Filme> filmes = new ArrayList<>();
	private static Integer identificador = 1;
	
	static {
		String duracaoString = "01:50";
		String duracaoString2 = "02:14";
		String duracaoString3 = "01:39";
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		Date duracao = null;
		Date duracao2 = null;
		Date duracao3 = null;
		try {
			duracao = sdf.parse(duracaoString);
			duracao2 = sdf.parse(duracaoString2);
			duracao3 = sdf.parse(duracaoString3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Filme filme = new Filme("The Professional", 
		"Quando a família de Mathilda, de 12 anos, é morta, seu vizinho Leon, que é um assassino profissional, relutantemente a coloca sob sua proteção e lhe ensina os segredos de seu ofício.",
		"18", "Ação", "Jean Reno, Natalie Portman, Gary Oldman", duracao, 
		"https://m.media-amazon.com/images/M/MV5BOTgyMWQ0ZWUtN2Q2MS00NmY0LWI3OWMtNjFkMzZlNDZjNTk0XkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_.jpg",
		1994);
		filme.setId(BancoDeDados.identificador++);
		filmes.add(filme);
		
		Filme filme2 = new Filme("Corações de Ferro", 
		"Don, junto com sua tripulação de cinco membros, embarca em uma missão que coloca muitas vidas em perigo enquanto se preparam para atacar o exército nazista."
		, "18", "Guerra", "Alicia von Rittberg, Jon Bernthal, Shia LaBeouf", duracao2, 
		"https://m.media-amazon.com/images/M/MV5BMjA4MDU0NTUyN15BMl5BanBnXkFtZTgwMzQxMzY4MjE@._V1_.jpg",
		2014);
		filme2.setId(BancoDeDados.identificador++);
		filmes.add(filme2);
		
		Filme filme3 = new Filme("Sonic the Hedgehog", 
				"Um ouriço extraterrestre é descoberto por um cientista com más intenções e planeja usar seus superpoderes para suas necessidades egoístas."
				, "Livre", "Aventura", "Jim Carrey, Ben Schwartz, James Marsden", duracao3, 
				"https://m.media-amazon.com/images/M/MV5BNTdmNmI4MzQtZTAzNS00MjhjLWEzOGQtZjI1NDNjZjk4N2JjXkEyXkFqcGdeQXVyMTM0NTUzNDIy._V1_.jpg",
				2020);
				filme3.setId(BancoDeDados.identificador++);
				filmes.add(filme3);
		
		System.out.println(filme.getDuracao());
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
