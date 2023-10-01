package com.github.lucasdevrj.bombafilmes.acoes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.lucasdevrj.bombafilmes.modelos.BancoDeDados;
import com.github.lucasdevrj.bombafilmes.modelos.Filme;

public class Exibe {

	public String exibirFilme(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String idString = request.getParameter("id");
		Integer id = Integer.valueOf(idString);
		
		BancoDeDados bancoDeDados = new BancoDeDados();
		Filme filme = bancoDeDados.buscaFilme(id);
		
		System.out.println(filme.getNome());
		
		request.setAttribute("filme", filme);
		
		return "forward:edita.jsp";
	}
}
