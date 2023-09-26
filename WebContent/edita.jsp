<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/novoFilme" var="novoFilmeServlet"/>

<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="ISO-8859-1">
		<title>Novo Filme</title>
		<link rel="stylesheet" type="text/css" href="styles.css">
	</head>
	<body>
		<header class="cabecalho">
			<h1 class="logo">Bomba Filmes</h1>
		</header>
		<main class="principal">
			<h2 class="titulo">Editar Filme</h2>
			
			<form action="${novoFilmeServlet}" method="post" class="formulario">
				<label for="nome" class="atributo">Nome:</label>
				<input type="text" id="nome" name="nome" class="entrada"> 
				
				<label for="sinopse" class="atributo">Sinopse:</label>
				<textarea id="sinopse" name="sinopse" rows="4" cols="50" class="entrada"></textarea>
				
				<label for="faixaEtaria" class="atributo">Faixa Etária:</label>
				<input type="text" id="faixaEtaria" name="faixaEtaria" class="entrada">
				
				<label for="genero" class="atributo">Gênero:</label>
				<input type="text" id="genero" name="genero" class="entrada">
				
				<label for="elenco" class="atributo">Elenco:</label>
				<input type="text" id="elenco" name="elenco" class="entrada">
				
				<label for="duracao" class="atributo">Duração:</label>
				<input type="text" id="duracao" name="duracao" class="entrada">
				
				<label for="imagem" class="atributo">Imagem:</label>
				<input type="text" id="imagem" name="imagem" class="entrada">
				
				<label for="anoLancamento" class="atributo">Lançamento:</label>
				<input type="text" id="anoLancamento" name="anoLancamento" class="entrada">
				
				<input type="submit" value="Cadastrar" class="botao">
			</form>
		</main>
		
		<footer class="rodape">
			
		</footer>
	</body>
</html>