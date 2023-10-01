package com.github.lucasdevrj.bombafilmes.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.lucasdevrj.bombafilmes.modelos.BancoDeDados;
import com.github.lucasdevrj.bombafilmes.modelos.Filme;

//@WebServlet("/editaFilme")
public class EditaFilmeServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		System.out.println("Alterando filme");
		
		String idString = request.getParameter("id");
		String nome = request.getParameter("nome");
		String sinopse = request.getParameter("sinopse");
		String faixaEtaria = request.getParameter("faixaEtaria");
		String genero = request.getParameter("genero");
		String elenco = request.getParameter("elenco");
		String duracaoString = request.getParameter("duracao");
		String imagem = request.getParameter("imagem");
		String anoLancamentoString = request.getParameter("anoLancamento");
		
		Integer id = Integer.valueOf(idString);
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		Date duracao = null;
		try {
			duracao = sdf.parse(duracaoString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Integer anoLancamento = Integer.valueOf(anoLancamentoString);
		
		BancoDeDados bancoDeDados = new BancoDeDados();
		Filme filme = bancoDeDados.buscaFilme(id);
		filme.setNome(nome);
		filme.setSinopse(sinopse);
		filme.setFaixaEtaria(faixaEtaria);
		filme.setGenero(genero);
		filme.setElenco(elenco);
		filme.setDuracao(duracao);
		filme.setImagem(imagem);
		filme.setAnoLancamento(anoLancamento);
		response.sendRedirect("catalogo");

	}
}
