<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="ISO-8859-1">
		<title>Novo Filme</title>
	</head>
	<body>
		<main>
			<form action="/bomba-filmes/novoFilme" method="post">
				<label for="nome">Nome:</label>
				<input type="text" id="nome" name="nome" required>
				
				<label for="sinopse">Sinopse:</label>
				<textarea id="sinopse" name="sinopse" rows="4" cols="50"></textarea>
				
				<label for="faixa-etaria">Faixa Et�ria:</label>
				<input type="text" id="faixa-etaria" name="faixa-etaria">
				
				<label for="genero">G�nero:</label>
				<input type="text" id="genero" name="genero">
				
				<label for="elenco">Elenco:</label>
				<input type="text" id="elenco" name="elenco">
				
				<label for="imagem">URL da imagem:</label>
				<input type="url" id="imagem" name="imagem">
				
				<input type="submit" value="Cadastrar">
			</form>
		</main>
	</body>
</html>