package com.github.lucasdevrj.bombafilmes.acoes;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.lucasdevrj.bombafilmes.modelos.BancoDeDados;
import com.github.lucasdevrj.bombafilmes.modelos.Filme;

public class CatalogarFilmes implements Acao {

	public String executa(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Listando Filmes");
		
		BancoDeDados bancoDeDados = new BancoDeDados();
		List<Filme> catalogo = bancoDeDados.getFilmes();
		
		request.setAttribute("filmes", catalogo);
		
		return "forward:catalogo.jsp";
	}
}
