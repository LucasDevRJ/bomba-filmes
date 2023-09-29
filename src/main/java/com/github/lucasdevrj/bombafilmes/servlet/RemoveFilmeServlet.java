package com.github.lucasdevrj.bombafilmes.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.lucasdevrj.bombafilmes.modelos.BancoDeDados;
 
@WebServlet("/removeFilme")
public class RemoveFilmeServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String idString = request.getParameter("id");
		Integer id = Integer.valueOf(idString);
		
		BancoDeDados filmes = new BancoDeDados();
		filmes.removeFilme(id);
		
		response.sendRedirect("catalogo");
	}
}
