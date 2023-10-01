package com.github.lucasdevrj.bombafilmes.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.lucasdevrj.bombafilmes.acoes.Cadastro;
import com.github.lucasdevrj.bombafilmes.acoes.Catalogo;
import com.github.lucasdevrj.bombafilmes.acoes.Edita;
import com.github.lucasdevrj.bombafilmes.acoes.Exibe;
import com.github.lucasdevrj.bombafilmes.acoes.Remove;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String parametroAcao = request.getParameter("acao");
		
		if (parametroAcao.equals("catalogo")) {
			System.out.println("Exibindo catalogo");
			
			Catalogo catalogo = new Catalogo();
			catalogo.catalogar(request, response);
			
		} else if (parametroAcao.equals("cadastro")) {
			System.out.println("Cadastrando Filme");
			
			Cadastro cadastro = new Cadastro();
			cadastro.cadastrarFilme(request, response);
			
		} else if (parametroAcao.equals("remove")) {
			System.out.println("Removendo Filme");
			
			Remove remove = new Remove();
			remove.removerFilme(request, response);
			
		} else if (parametroAcao.equals("exibe")) {
			System.out.println("Exibindo Filme");
			
			Exibe exibe = new Exibe();
			exibe.exibirFilme(request, response);
		
		} else if (parametroAcao.equals("edita")) {
			System.out.println("Editando Filme");
			
			Edita edita = new Edita();
			edita.editarFilme(request, response);
		}
	}
}
