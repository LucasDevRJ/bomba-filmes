<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, com.github.lucasdevrj.bombafilmes.modelos.Filme"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="ISO-8859-1">
		<title>Principal</title>
		<link rel="stylesheet" type="text/css" href="styles.css">
	</head>
	<body>
		<header class="cabecalho">
			<h1>Bomba Filmes</h1>
		</header>
		
		<main>
			<h2 class="titulo">Catálogo</h2>
			
			<ul class="lista">
				<c:forEach items="${filmes}" var="filme">
					<li class="filme">
						<p class="atributo"> ${filme.imagem} </p>
						<p class="atributo"> ${filme.nome} </p>
						<p class="atributo"> ${filme.sinopse} </p>
						<p class="atributo"> ${filme.faixaEtaria} </p>
						<p class="atributo"> ${filme.genero} </p>
						<p class="atributo"> ${filme.anoLancamento} </p>
						<p class="atributo"> ${filme.duracao} </p>
						<p class="atributo"> ${filme.elenco} </p>
					</li>
				</c:forEach>
			</ul>
		</main>
	</body>
</html>