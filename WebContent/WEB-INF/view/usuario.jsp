<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada?acao=CadastrarUsuario" var="cadastro"/>

<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="ISO-8859-1">
		<title>Cadastrar Usuario</title>
		<link rel="stylesheet" type="text/css" href="styles.css">
	</head>
	<body>
		<c:import url="cabecalho.jsp"></c:import>
		
		<main class="principal">
			<form action="${cadastro}" method="post" class="formulario">
				<label for="login" class="atributo-formulario">Usuario:</label>
				<input type="text" id="login" name="login" class="entrada" required> 
				
				<label for="senha" class="atributo-formulario">Senha:</label>
				<input type="password" id="senha" name="senha" class="entrada" required>
				
				<input type="submit" value="Cadastrar" class="botao">
			</form>
		</main>
		
		<footer class="rodape">
			
		</footer>
	</body>
</html>