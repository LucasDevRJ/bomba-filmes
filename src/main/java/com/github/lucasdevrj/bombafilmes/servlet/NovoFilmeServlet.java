package com.github.lucasdevrj.bombafilmes.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.lucasdevrj.bombafilmes.modelos.Filme;


@WebServlet("/novoFilme")
public class NovoFilmeServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando novo filme");
		
		String nome = request.getParameter("nome");
		String sinopse = request.getParameter("sinopse");
		String faixaEtaria = request.getParameter("faixa-etaria");
		String genero = request.getParameter("genero");
		String elenco = request.getParameter("elenco");
		String imagem = request.getParameter("imagem");
		
		Filme filme = new Filme(nome, sinopse, faixaEtaria, genero, elenco, imagem);
		
		BancoDeDados bancoDeDados = new BancoDeDados();
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Filme " + nome + " Cadastrado com Sucesso!</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}
