package com.github.lucasdevrj.bombafilmes.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.lucasdevrj.bombafilmes.modelos.BancoDeDados;

public class RemoverFilme implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		System.out.println("Excluindo Filme");
		
		String idString = request.getParameter("id");
		Integer id = Integer.valueOf(idString);
	
		BancoDeDados filmes = new BancoDeDados();
		filmes.removeFilme(id);
		
		return "redirect:entrada?acao=catalogo";
	}
}
