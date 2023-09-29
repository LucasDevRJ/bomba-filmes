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
			<h2 class="titulo">Cadastrar Filme</h2>
			
			<form action="${novoFilmeServlet}" method="post" class="formulario">
				<label for="nome" class="atributo">Nome:</label>
				<input type="text" id="nome" name="nome" class="entrada"> 
				
				<label for="sinopse" class="atributo">Sinopse:</label>
				<textarea id="sinopse" name="sinopse" rows="4" cols="50" class="entrada"></textarea>
				
				<select name="faixaEtaria" id="faixaEtaria" class="entrada">
					<option value="Livre">Livre</option>
					<option value="10">10 Anos</option>
					<option value="12">12 Anos</option>
					<option value="14">14 Anos</option>
					<option value="16">16 Anos</option>
					<option value="18">18 Anos</option>
				</select>
				
				<label for="genero" class="atributo">Gênero:</label>
				<input type="text" id="genero" name="genero" class="entrada">
				
				<label for="elenco" class="atributo">Elenco:</label>
				<input type="text" id="elenco" name="elenco" class="entrada">
				
				<label for="duracao" class="atributo">Duração:</label>
				<input type="time" id="duracao" name="duracao" class="entrada">
				
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