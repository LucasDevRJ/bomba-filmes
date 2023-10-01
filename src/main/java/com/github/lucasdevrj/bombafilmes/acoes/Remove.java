package com.github.lucasdevrj.bombafilmes.acoes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.lucasdevrj.bombafilmes.modelos.BancoDeDados;

public class Remove {

	public void removerFilme(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		System.out.println("Excluindo Filme");
		
		String idString = request.getParameter("id");
		Integer id = Integer.valueOf(idString);
	
		BancoDeDados filmes = new BancoDeDados();
		filmes.removeFilme(id);
		
		response.sendRedirect("entrada?acao=catalogo");
	}
}
