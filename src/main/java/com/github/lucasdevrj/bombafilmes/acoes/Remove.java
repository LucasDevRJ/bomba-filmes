package com.github.lucasdevrj.bombafilmes.acoes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.lucasdevrj.bombafilmes.modelos.BancoDeDados;

public class Remove {

	public void removerFilme(HttpServletRequest request, HttpServletResponse response, Integer id) 
			throws ServletException, IOException {
		
		System.out.println("Excluindo Filme");
		
		BancoDeDados filmes = new BancoDeDados();
		filmes.removeFilme(id);
		
		RequestDispatcher rd = request.getRequestDispatcher("/catalogo.jsp");
		rd.forward(request, response);
	}
}
