<%
	String nome = "Cora��es de Ferro";
	String sinopse = "Don, junto com sua tripula��o de cinco membros, " +
	"embarca em uma miss�o que coloca muitas vidas em perigo enquanto se preparam para atacar"
	+ "o ex�rcito nazista.";
	String faixaEtaria = "18+";
	String genero = "Guerra/A��o";
	String elenco = "Shia LaBeouf, Jon Bernthal, Scott Eastwood...";
	String urlImagem = "https://www.themoviedb.org/t/p/w500/pfte7wdMobMF4CVHuOxyu6oqeeA.jpg";
	
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
				<h2> <%out.println(nome);%> </h2>
				<p> <%out.println(sinopse);%> </p>
				<p> <%=faixaEtaria%> </p>
				<p> <%out.println(genero);%> </p>
				<p> <%out.println(elenco);%> </p>
				<p> <%out.println(urlImagem);%> </p>
			</li>
		</ul>
	</body>
</html>