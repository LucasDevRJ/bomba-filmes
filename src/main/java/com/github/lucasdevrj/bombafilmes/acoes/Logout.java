package com.github.lucasdevrj.bombafilmes.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.github.lucasdevrj.bombafilmes.modelos.Usuario;

public class Logout implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession sessao = request.getSession();
		Usuario usuario = (Usuario) sessao.getAttribute("usuarioLogado");
		System.out.println("O usuario " + usuario.getLogin() + " foi deslogado com sucesso!");
		sessao.invalidate();
		
		return "redirect:entrada?acao=ExibirFormularioLogin";
	}
}
