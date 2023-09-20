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


@WebServlet("/novoFilme")
public class NovoFilmeServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando novo filme");
		
		String nome = request.getParameter("nome");
		String sinopse = request.getParameter("sinopse");
		String faixaEtaria = request.getParameter("faixaEtaria");
		String genero = request.getParameter("genero");
		String elenco = request.getParameter("elenco");
		String duracao = request.getParameter("duracao");
		String imagem = request.getParameter("imagem");
		
		Filme filme = new Filme(nome, sinopse, faixaEtaria, genero, elenco, duracao, imagem);
		
		BancoDeDados bancoDeDados = new BancoDeDados();
		bancoDeDados.adicionaFilme(filme);
		
		RequestDispatcher rd = request.getRequestDispatcher("/novoFilmeCriado.jsp");
		request.setAttribute("nome", filme.getNome());
		request.setAttribute("sinopse", filme.getSinopse());
		request.setAttribute("faixaEtaria", filme.getFaixaEtaria());
		request.setAttribute("genero", filme.getGenero());
		request.setAttribute("elenco", filme.getElenco());
		request.setAttribute("duracao", filme.getDuracao());
		request.setAttribute("imagem", filme.getImagem());
		rd.forward(request, response);
	}
}
