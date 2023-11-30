package com.github.lucasdevrj.bombafilmes.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.github.lucasdevrj.bombafilmes.modelos.BancoDeDados;
import com.github.lucasdevrj.bombafilmes.modelos.Filme;
import com.github.lucasdevrj.bombafilmes.modelos.Usuario;

public class ExibirAvaliacaoFilme implements Acao {

	public String executa(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		String idString = request.getParameter("id");
		Integer id = Integer.valueOf(idString);
		
		BancoDeDados bancoDeDados = new BancoDeDados();
		Filme filme = bancoDeDados.buscaFilme(id);
		
		System.out.println(filme.getNome());
		
		request.setAttribute("filme", filme);
		
		return "forward:avaliacao.jsp";
	}
}
