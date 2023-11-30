package com.github.lucasdevrj.bombafilmes.acoes;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.github.lucasdevrj.bombafilmes.modelos.BancoDeDados;
import com.github.lucasdevrj.bombafilmes.modelos.Filme;
import com.github.lucasdevrj.bombafilmes.modelos.Usuario;

public class AvaliarFilme implements Acao {
		
	public String executa(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {
		System.out.println("Avaliação filme");
		
		String idString = request.getParameter("id");
		String notaString = request.getParameter("nota");
		
		Integer id = Integer.parseInt(idString);
		Integer nota = Integer.parseInt(notaString);
		
		HttpSession sessao = request.getSession();
		Usuario usuario = (Usuario) sessao.getAttribute("usuarioLogado");
		
		BancoDeDados bancoDeDados = new BancoDeDados();
		Filme filme = bancoDeDados.buscaFilme(id);
		filme.setNota(nota);
		
		System.out.println(usuario.getLogin());
				
		request.setAttribute("id", filme.getId());
		request.setAttribute("nota", filme.getNota());
					
		return "redirect:entrada?acao=CatalogarFilmes";
	}
}
