<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada?acao=EditarFilme" var="editaFilme"/>

<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="ISO-8859-1">
		<title>Editar Filme</title>
		<link rel="stylesheet" type="text/css" href="styles.css">
	</head>
	<body> 
		<c:import url="cabecalho.jsp"></c:import>
		
		<main class="principal">
			<h2 class="titulo">Editar Filme</h2>
			
			<form action="${editaFilme}" method="post" class="formulario">
				<label for="id" class="atributo">ID:</label>
				<input type="text" id="id" name="id" class="entrada" required 
				value="${filme.id}" readonly> 
				
				<label for="nome" class="atributo">Nome:</label>
				<input type="text" id="nome" name="nome" class="entrada" required 
				value="${filme.nome}"> 
				
				<label for="sinopse" class="atributo">Sinopse:</label>
				<textarea id="sinopse" name="sinopse" rows="4" cols="50" class="entrada" 
				required maxlength="200">${filme.sinopse}</textarea>
				
				<label for="faixaEtaria" class="atributo">Faixa Et�ria:</label>
				<select name="faixaEtaria" id="faixaEtaria" class="entrada">
					<option value="Livre">Livre</option>
					<option value="10">10 Anos</option>
					<option value="12">12 Anos</option>
					<option value="14">14 Anos</option>
					<option value="16">16 Anos</option>
					<option value="18">18 Anos</option>
				</select>
				
				<label for="genero" class="atributo">G�nero:</label>
				<select name="genero" id="genero" class="entrada">
					<option value="A��o">A��o</option>
					<option value="Com�dia">Com�dia</option>
					<option value="Drama">Drama</option>
					<option value="Romance">Romance</option>
					<option value="Document�rio">Document�rio</option>
					<option value="Suspense">Suspense</option>
					<option value="Terror">Terror</option>
					<option value="Fic��o cient�fica">Fic��o cient�fica</option>
				</select>
				
				<label for="elenco" class="atributo">Elenco:</label>
				<input type="text" id="elenco" name="elenco" class="entrada" required
				value="${filme.elenco}">
				
				<label for="duracao" class="atributo">Dura��o:</label>
				<input type="time" id="duracao" name="duracao" class="entrada" required 
				value="${filme.duracao}">
				
				<label for="imagem" class="atributo">Imagem:</label>
				<input type="url" id="imagem" name="imagem" class="entrada" required
				value="${filme.imagem}">
				
				<label for="anoLancamento" class="atributo">Lan�amento:</label>
				<input type="text" id="anoLancamento" name="anoLancamento" class="entrada" 
				pattern="[0-9]{4}" required value="${filme.anoLancamento}">
								
				<input type="submit" value="Editar" class="botao">
			</form>
		</main>
		
		<c:import url="rodape.jsp"></c:import>
	</body>
</html>