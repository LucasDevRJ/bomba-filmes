<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada?acao=ExibirFormularioLogin" var="login"/>
<c:url value="/entrada?acao=Logout" var="logout"/>

<header class="cabecalho">
	<h1 class="logo">Bomba Filmes</h1>
	<c:if test="${not login}">
		<a href="${logout}" class="logout">Sair</a>
	</c:if>
</header>