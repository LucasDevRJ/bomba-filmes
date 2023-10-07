package com.github.lucasdevrj.bombafilmes.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExibirMenuPrincipal implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		return "forward:principal.jsp";
	}
}
