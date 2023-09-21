<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="ISO-8859-1">
		<title>Filme Criado</title>
	</head>
	<body>
		<c:if test="${not empty nome}">
			<ul>
				<li>
					<h2> ${nome} </h2>
					<p> ${sinopse} </p>
					<p> ${faixaEtaria} </p>
					<p> ${genero} </p>
					<p> ${elenco} </p>
					<p> ${duracao} </p>
					<img alt="" src="${imagem}">
				</li>
			</ul>
		</c:if>
		
		<c:if test="${empty nome}">
			<h2>Preencha o nome do filme!!</h2>
		</c:if>
	</body>
</html>