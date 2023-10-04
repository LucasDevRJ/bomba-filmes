package com.github.lucasdevrj.bombafilmes.acoes;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.lucasdevrj.bombafilmes.modelos.BancoDeDados;
import com.github.lucasdevrj.bombafilmes.modelos.Filme;

public class CadastrarFilme implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String sinopse = request.getParameter("sinopse");
		String faixaEtaria = request.getParameter("faixaEtaria");
		String genero = request.getParameter("genero");
		String elenco = request.getParameter("elenco");
		String duracaoString = request.getParameter("duracao");
		String imagem = request.getParameter("imagem");
		String anoLancamentoString = request.getParameter("anoLancamento");
		
		System.out.println("Antes da formatação: " + duracaoString);
				
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		Date duracao = null;
		try {
			duracao = sdf.parse(duracaoString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println("Após a formatação: " + duracao);
		
		Integer anoLancamento = Integer.parseInt(anoLancamentoString);
		
		Filme filme = new Filme(nome, sinopse, faixaEtaria, genero, elenco, duracao, 
				imagem, anoLancamento);
		
		BancoDeDados bancoDeDados = new BancoDeDados();
		bancoDeDados.adicionaFilme(filme);
		
		request.setAttribute("nome", filme.getNome());
		request.setAttribute("sinopse", filme.getSinopse());
		request.setAttribute("faixaEtaria", filme.getFaixaEtaria());
		request.setAttribute("genero", filme.getGenero());
		request.setAttribute("elenco", filme.getElenco());
		request.setAttribute("duracao", filme.getDuracao());
		request.setAttribute("imagem", filme.getImagem());
		request.setAttribute("anoLancamento", filme.getAnoLancamento());
		
		System.out.println(filme.getGenero());
		
		return "redirect:entrada?acao=catalogo";
	}
}
