package com.github.lucasdevrj.bombafilmes.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.github.lucasdevrj.bombafilmes.modelos.BancoDeDados;
import com.github.lucasdevrj.bombafilmes.modelos.Usuario;

public class CadastrarUsuario implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		Usuario usuario = new Usuario(login, senha);
		BancoDeDados bancoDeDados = new BancoDeDados();
		bancoDeDados.adicionaUsuario(usuario);
		
		HttpSession sessao = request.getSession();
		sessao.setAttribute("usuarioLogado", usuario);
		
		System.out.println("Usuário " + usuario.getLogin() + " cadastrado com sucesso!");
		
		return "redirect:entrada?acao=ExibirMenuPrincipal";
	}
}
