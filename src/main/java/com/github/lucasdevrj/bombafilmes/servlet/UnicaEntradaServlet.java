package com.github.lucasdevrj.bombafilmes.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.lucasdevrj.bombafilmes.acoes.Catalogo;

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
		} else if (parametroAcao.equals("removeFilme")) {
			System.out.println("Removendo Filme");
		} else if (parametroAcao.equals("exibeFilme")) {
			System.out.println("Exibindo Filme");
		} else if (parametroAcao.equals("editaFilme")) {
			System.out.println("Editando Filme");
		}
	}
}
