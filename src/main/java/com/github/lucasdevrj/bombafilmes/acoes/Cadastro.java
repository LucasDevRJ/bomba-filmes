package com.github.lucasdevrj.bombafilmes.acoes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cadastro {

	public void cadastrarFilme(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("/cadastro.jsp");
		rd.forward(request, response);
		
	}
}
