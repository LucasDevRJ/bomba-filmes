<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, com.github.lucasdevrj.bombafilmes.modelos.Filme"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/cadastro" var="cadastro"/>
<c:url value="/catalogo" var="catalogo"/>

<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="ISO-8859-1">
		<title>Filme Criado</title>
		<link rel="stylesheet" type="text/css" href="styles.css">
	</head>
	<body>
		<header class="cabecalho">
			<h1 class="logo">Bomba Filmes</h1>
		</header>
		
		<main>
			<section>
				<h2 class="mensagem">O filme foi removido com sucesso!</h2>
			</section>
			
			<section class="links">
				<a  href="${cadastro}" class="botao">
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