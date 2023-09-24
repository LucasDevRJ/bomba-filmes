package com.github.lucasdevrj.bombafilmes.modelos;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {

	private static List<Filme> filmes = new ArrayList<>();
	private static Integer identificador = 1;
	
	static {
		Filme filme = new Filme("The Professional", 
		"Mathilda tem apenas 12 anos de idade, mas já conhece o lado obscuro da vida: seu pai abusivo guarda drogas para policiais corruptos e a mãe a negligencia. O vizinho Léon gosta de cuidar de plantas, mas é um assassino de aluguel para o gângster Tony. Um dia, a família da menina é assassinada por um agente antidrogas desonesto, e ela se une a um relutante Léon para aprender o negócio mortal e vingar a morte dos pais.",
		"18", "Ação", "Jean Reno", 110, 
		"https://m.media-amazon.com/images/M/MV5BOTgyMWQ0ZWUtN2Q2MS00NmY0LWI3OWMtNjFkMzZlNDZjNTk0XkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_.jpg",
		1994);
		filme.setId(BancoDeDados.identificador++);
		filmes.add(filme);
	}
	
	public void adicionaFilme(Filme filme) {
		filme.setId(BancoDeDados.identificador++);
		BancoDeDados.filmes.add(filme);
		System.out.println("O filme " + filme.getNome() + " foi adicionado com sucesso!");
	}
	
	public List<Filme> getFilmes() {
		return filmes;
	}
}
