package com.github.lucasdevrj.bombafilmes.acoes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Formulario {

	public String cadastro(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		return "forward:cadastro.jsp";
	}
}
