<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, com.github.lucasdevrj.bombafilmes.modelos.Filme"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="ISO-8859-1">
		<title>Lista de Filmes</title>
	</head>
	<body>
	
		<h1>Cat�logo</h1>
			
		<ul>
			<c:forEach items="${filmes}" var="filme">
				<li> ${filme.nome} </li>
			</c:forEach>
		</ul>	
	</body>
</html>