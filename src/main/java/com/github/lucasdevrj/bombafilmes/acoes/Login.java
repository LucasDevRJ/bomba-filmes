package com.github.lucasdevrj.bombafilmes.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.github.lucasdevrj.bombafilmes.modelos.BancoDeDados;
import com.github.lucasdevrj.bombafilmes.modelos.Usuario;

public class Login implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		BancoDeDados bancoDeDados = new BancoDeDados();
		Usuario usuario = bancoDeDados.existeUsuario(login, senha);
		
		if (usuario != null) {
			System.out.println("Usuário existe!!");
			HttpSession sessao = request.getSession();
			sessao.setAttribute("usuarioLogado", usuario);
			return "redirect:entrada?acao=ExibirMenuPrincipal";
		} 
		
		return "forward:login.jsp";
	}
}
