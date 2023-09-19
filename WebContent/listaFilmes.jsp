<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<title>Lista de Filmes</title>
		<meta charset="utf-8">
	</head>
	<body>
		<ul>
			<%
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