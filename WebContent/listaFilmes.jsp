<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, com.github.lucasdevrj.bombafilmes.modelos.Filme"%>

<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="ISO-8859-1">
		<title>Lista de Filmes</title>
	</head>
	<body>
		<ul>
			<%
				List<Filme> lista = (List<Filme>) request.getAttribute("filmes");
				for (Filme filme : lista) {
			%>
					<li>
						<%= filme.getNome() %>
						<%= filme.getSinopse() %>
					</li>
			<% } %>
		</ul>
	</body>
</html>