<%@ page import="java.util.List, com.github.lucasdevrj.bombafilmes.modelos.Filme"%>

<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<title>Lista de Filmes</title>
		<meta charset="utf-8">
	</head>
	<body>
		<ul>
			<%
				List<Filme> lista = (List<Filme>) request.getAttribute("filmes");
				for (Filme filme : lista) {
			%>
					<li>
						<%= filme.getNome() %>
					</li>
			<% } %>
			}
		</ul>
	</body>
</html>