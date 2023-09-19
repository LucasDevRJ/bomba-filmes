<%
	String nome = (String) request.getAttribute("nome");
	String sinopse = (String) request.getAttribute("sinopse");
	String faixaEtaria = (String) request.getAttribute("faixa-etaria");
	String genero = (String) request.getAttribute("genero");
	String elenco = (String) request.getAttribute("elenco");
	
	System.out.println(nome);
%>

<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<title>Filme Criado</title>
		<meta charset="utf-8">
	</head>
	<body>
		<ul>
			<li>
				<h2> <%=nome%> </h2>
				<p> <%=sinopse%> </p>
				<p> <%=faixaEtaria%> </p>
				<p> <%=genero%> </p>
				<p> <%=elenco%> </p>
			</li>
		</ul>
	</body>
</html>