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
			<h2>Cat�logo</h2>
			
			<ul>
				<c:forEach items="${filmes}" var="filme">
					<li> ${filme.nome} </li>
					<li> ${filme.sinopse} </li>
					<li> ${filme.faixaEtaria} </li>
					<li> ${filme.genero} </li>
					<li> ${filme.elenco} </li>
					<li> ${filme.duracao} </li>
					<li> ${filme.imagem} </li>
					<li> ${filme.anoLancamento} </li>
				</c:forEach>
			</ul>
		</main>
	</body>
</html>