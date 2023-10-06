<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, com.github.lucasdevrj.bombafilmes.modelos.Filme"%>
<%@ page import="java.util.List, com.github.lucasdevrj.bombafilmes.acoes.Login"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada?acao=ExibirFormularioCadastro" var="cadastro"/>
<c:url value="/entrada?acao=CatalogarFilmes" var="catalogo"/>

<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="ISO-8859-1">
		<title>Principal</title>
		<link rel="stylesheet" type="text/css" href="styles.css">
	</head>
	<body>
		<header class="cabecalho">
			<h1 class="logo">Bomba Filmes</h1>
			<a href="entrada?acao=Logout" class="logout">Sair</a>
		</header>
		
		<main class="principal">
			<section class="links">
				<a href="${cadastro}" class="botao">
					Cadastrar Filme
				</a>
			
				<a href="${catalogo}" class="botao">
					Cat�logo
				</a>
			</section>
		</main>
		
		<footer class="rodape">
			
		</footer>
	</body>
</html>