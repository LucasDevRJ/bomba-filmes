package com.github.lucasdevrj.bombafilmes.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.lucasdevrj.bombafilmes.modelos.BancoDeDados;
import com.github.lucasdevrj.bombafilmes.modelos.Filme;

@WebServlet("/listaFilmes")
public class ListaFilmesServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		BancoDeDados bancoDeDados = new BancoDeDados();
		List<Filme> filmes = bancoDeDados.getFilmes();
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<ul>");
		
		for (Filme filme : filmes) {
			out.println("<li>" + filme.getNome() + "</li>");
		}
		
		out.println("</ul>");
		out.println("</body>");
		out.println("</html>");
	}

}
