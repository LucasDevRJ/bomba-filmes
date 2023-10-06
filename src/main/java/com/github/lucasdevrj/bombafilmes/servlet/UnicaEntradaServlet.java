package com.github.lucasdevrj.bombafilmes.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.github.lucasdevrj.bombafilmes.acoes.Acao;
import com.github.lucasdevrj.bombafilmes.acoes.CadastrarFilme;
import com.github.lucasdevrj.bombafilmes.acoes.CatalogarFilmes;
import com.github.lucasdevrj.bombafilmes.acoes.EditarFilme;
import com.github.lucasdevrj.bombafilmes.acoes.ExibirFilme;
import com.github.lucasdevrj.bombafilmes.acoes.ExibirFormularioCadastro;
import com.github.lucasdevrj.bombafilmes.acoes.ExibirMenuPrincipal;
import com.github.lucasdevrj.bombafilmes.acoes.RemoverFilme;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String parametroAcao = request.getParameter("acao");
		
		HttpSession sessao = request.getSession();
		boolean usuarioNaoEstaLogado = (sessao.getAttribute("usuarioLogado") == null);
		boolean ehUmaAcaoProtegida = !(parametroAcao.equals("Login") 
				|| parametroAcao.equals("ExibirFormularioLogin"));
		
		if (ehUmaAcaoProtegida & usuarioNaoEstaLogado) {
			response.sendRedirect("redirect:entrada?acao=ExibirFormularioLogin");
			return;
		}
		
		
		String classeNome = "com.github.lucasdevrj.bombafilmes.acoes." + parametroAcao;
		
		String nome;
		try {
			Class classe = Class.forName(classeNome);
			Object obj = classe.newInstance();
			Acao acao = (Acao) obj;
			nome = acao.executa(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException 
				| ServletException| IOException e) {
			throw new ServletException(e);
		}
		
		String[] tipoEndereco = nome.split(":");
		if (tipoEndereco[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoEndereco[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect(tipoEndereco[1]);
		}
		
//		String parametro = null;
//		if (parametroAcao.equals("catalogo")) {
//			System.out.println("Exibindo catalogo");
//			
//			CatalogarFilmes catalogo = new CatalogarFilmes();
//			parametro = catalogo.executa(request, response);
//			
//		} else if (parametroAcao.equals("formulario")) {
//			System.out.println("Cadastrando Filme");
//			
//			ExibirFormularioCadastro formulario = new ExibirFormularioCadastro();
//			parametro = formulario.executa(request, response);
//			
//		} else if (parametroAcao.equals("remove")) {
//			System.out.println("Removendo Filme");
//			
//			RemoverFilme remove = new RemoverFilme();
//			parametro = remove.executa(request, response);
//			
//		} else if (parametroAcao.equals("exibe")) {
//			System.out.println("Exibindo Filme");
//			
//			ExibirFilme exibe = new ExibirFilme();
//			parametro = exibe.executa(request, response);
//		
//		} else if (parametroAcao.equals("edita")) {
//			System.out.println("Editando Filme");
//			
//			EditarFilme edita = new EditarFilme();
//			parametro = edita.executa(request, response);
//			
//		} else if (parametroAcao.equals("cadastro")){
//			System.out.println("Cadastrando Filme");
//			
//			CadastrarFilme cadastro = new CadastrarFilme();
//			parametro = cadastro.executa(request, response);
//			
//		} else {
//			System.out.println("Menu Principal");
//			
//			ExibirMenuPrincipal principal = new ExibirMenuPrincipal();
//			parametro = principal.executa(request, response);
//		}
	}
}
