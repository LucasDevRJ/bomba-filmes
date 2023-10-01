package com.github.lucasdevrj.bombafilmes.acoes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Principal {
	
	public String exibeMenu(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		return "forward:principal.jsp";
	}
}
