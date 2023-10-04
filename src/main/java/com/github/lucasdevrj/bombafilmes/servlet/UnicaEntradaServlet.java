package com.github.lucasdevrj.bombafilmes.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		String classeNome = "com.github.lucasdevrj.bombafilmes.acoes." + parametroAcao;
		
		Class classe = Class.forName(classeNome);
		Object obj = classe.newInstance();
		String nome = obj.executa(request, response);
		
		String parametro = null;
		if (parametroAcao.equals("catalogo")) {
			System.out.println("Exibindo catalogo");
			
			CatalogarFilmes catalogo = new CatalogarFilmes();
			parametro = catalogo.executa(request, response);
			
		} else if (parametroAcao.equals("formulario")) {
			System.out.println("Cadastrando Filme");
			
			ExibirFormularioCadastro formulario = new ExibirFormularioCadastro();
			parametro = formulario.executa(request, response);
			
		} else if (parametroAcao.equals("remove")) {
			System.out.println("Removendo Filme");
			
			RemoverFilme remove = new RemoverFilme();
			parametro = remove.executa(request, response);
			
		} else if (parametroAcao.equals("exibe")) {
			System.out.println("Exibindo Filme");
			
			ExibirFilme exibe = new ExibirFilme();
			parametro = exibe.executa(request, response);
		
		} else if (parametroAcao.equals("edita")) {
			System.out.println("Editando Filme");
			
			EditarFilme edita = new EditarFilme();
			parametro = edita.executa(request, response);
			
		} else if (parametroAcao.equals("cadastro")){
			System.out.println("Cadastrando Filme");
			
			CadastrarFilme cadastro = new CadastrarFilme();
			parametro = cadastro.executa(request, response);
			
		} else {
			System.out.println("Menu Principal");
			
			ExibirMenuPrincipal principal = new ExibirMenuPrincipal();
			parametro = principal.executa(request, response);
		}
		
		String[] tipoEndereco = parametro.split(":");
		if (tipoEndereco[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoEndereco[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect(tipoEndereco[1]);
		}
	}
}
