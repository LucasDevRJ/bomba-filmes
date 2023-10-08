<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada?acao=Login" var="cadastro"/>
<c:url value="/entrada?acao=ExibirFormularioUsuario" var="usuario"/>

<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="ISO-8859-1">
		<title>Login</title>
		<link rel="stylesheet" type="text/css" href="styles.css">
	</head>
	<body>
		<header class="cabecalho">
			<h1 class="logo">Bomba Filmes</h1>
		</header>
		
		<main class="principal">
			<h2 class="titulo">Login</h2>
			
			<form action="${cadastro}" method="post" class="formulario-login">
				<label for="login" class="atributo-formulario">Login:</label>
				<input type="text" id="login" name="login" class="entrada" required> 
				
				<label for="senha" class="atributo-formulario">Senha:</label>
				<input type="password" id="senha" name="senha" class="entrada" required>
				
				<a href="${usuario}">Cadastrar Usuario</a>
				
				<input type="submit" value="Entrar" class="botao">
			</form>
		</main>
		
		<footer class="rodape">
			
		</footer>
	</body>
</html>