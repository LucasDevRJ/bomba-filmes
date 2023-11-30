<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada?acao=AvaliarFilme" var="avaliarFilme"/>

<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="ISO-8859-1">
		<title>Avaliar Filme</title>
		<link rel="stylesheet" type="text/css" href="styles.css">
	</head>
	<body> 
		<c:import url="cabecalho.jsp"></c:import>
		
		<main class="principal">
			<h2 class="titulo">Avaliar Filme</h2>
			
			<form action="${avaliarFilme}" method="post" class="formulario">
			
				<input type="text" id="id" name="id" class="entrada" required 
				value="${filme.id}" hidden="hidden" readonly>
			
				<label for="nota" class="atributo">Nota:</label>
				<input type="number" id="nota" name="nota" class="entrada" min="0" max="10" required> 
				
				<input type="submit" value="Editar" class="botao">
			</form>
		</main>
		
		<c:import url="rodape.jsp"></c:import>
	</body>
</html>