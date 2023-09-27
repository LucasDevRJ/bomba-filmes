package com.github.lucasdevrj.bombafilmes.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.lucasdevrj.bombafilmes.modelos.BancoDeDados;
import com.github.lucasdevrj.bombafilmes.modelos.Filme;

@WebServlet("/exibeFilme")
public class ExibeFilmeServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idString = request.getParameter("id");
		Integer id = Integer.valueOf(idString);
		
		BancoDeDados bancoDeDados = new BancoDeDados();
		Filme filme = bancoDeDados.buscaFilme(id);
		
		System.out.println(filme.getNome());
		
		request.setAttribute("filme", filme);
		RequestDispatcher rd = request.getRequestDispatcher("/edita.jsp");
		rd.forward(request, response);
		
	}

}
