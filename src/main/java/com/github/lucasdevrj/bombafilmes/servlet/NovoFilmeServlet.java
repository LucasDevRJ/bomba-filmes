package com.github.lucasdevrj.bombafilmes.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		Integer duracao = Integer.getInteger("duracao");
		String imagem = request.getParameter("imagem");
		String dataLancamento = request.getParameter("dataLancamento");
		
		Date dataLancamentoFormatada;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataLancamentoFormatada = sdf.parse(dataLancamento);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Filme filme = new Filme(nome, sinopse, faixaEtaria, genero, elenco, duracao, imagem, dataLancamentoFormatada);
		
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
		request.setAttribute("dataLancamento", filme.getDataLancamento());
		rd.forward(request, response);
	}
}
