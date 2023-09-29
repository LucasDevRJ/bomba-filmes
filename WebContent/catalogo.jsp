<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, com.github.lucasdevrj.bombafilmes.modelos.Filme"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/cadastro" var="cadastro"/>

<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="ISO-8859-1">
		<title>Catálogo</title>
		<link rel="stylesheet" type="text/css" href="styles.css">
	</head>
	<body>
		<header class="cabecalho">
			<h1 class="logo">Bomba Filmes</h1>
		</header>
		
		<main class="principal">
			<h2 class="titulo">Catálogo</h2>
			
			<section>
				<ul class="lista">
					<c:forEach items="${filmes}" var="filme">
						<li class="filme">
							<img alt="" src="${filme.imagem}" class="cartas">
							<p class="atributo">Nome: ${filme.nome} </p>
							<p class="atributo">Sinopse: ${filme.sinopse} </p>
							<p class="atributo">Faixa Etaria: ${filme.faixaEtaria} </p>
							<p class="atributo">Gênero: ${filme.genero} </p>
							<p class="atributo">Ano: ${filme.anoLancamento} </p>
							<p><fmt:formatDate value="${filme.duracao}" pattern="HH'h':MM'm'"/></p>
							<!--<p class="atributo">Duração ${filme.duracao} Minutos</p>-->
							<p class="atributo">Elenco: ${filme.elenco} </p>
							
							<div class="catalogo-links">
								<a href="/bomba-filmes/exibeFilme?id=${filme.id}">Editar</a>
								<a href="/bomba-filmes/removeFilme?id=${filme.id}">Remover</a>
							</div>
						</li>
					</c:forEach>
				</ul>
			</section>
			
			<section class="links">
				<a  href="${cadastro}" class="botao">
					Cadastrar Filme
				</a>
			</section>
		</main>
		
		<footer class="rodape">
			
		</footer>
	</body>
</html>