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
		out.println("<head>");
		out.println("<meta charset='utf-8>'");
		out.println("</head>");
		out.println("<body>");
		out.println("<ul>");
		
		for (Filme filme : filmes) {
			out.print("<li>");
			out.println("<p>" + filme.getNome() + "</p>");
			out.println("<p>" + filme.getSinopse()+ "</p>");
			out.println("<p>" + filme.getFaixaEtaria()+ "</p>");
			out.println("<p>" + filme.getGenero()+ "</p>");
			out.println("<p>" + filme.getElenco()+ "</p>");
			out.println("<img src='${filme.getUrlImagem()}'>");
			out.print("</li>");
		}
		
		out.println("</ul>");
		out.println("</body>");
		out.println("</html>");
	}

}
