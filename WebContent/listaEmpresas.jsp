<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa" %>	<!-- executa a Importação -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	<!-- Importa o jstl.jar -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>	<!-- Importa o jstl.jar -->


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standart Taglib</title>
</head>
<body>

	<c:if test="${not empty empresa }">
		Empresa ${empresa } cadastrada com sucesso!
	</c:if>
	
	Lista de empresas: <br />
	
	<ul>	<!-- Realiza o laço -->
		<c:forEach items="${empresas}" var="empresa">	<!-- Acessa a variável empresa -->
			<li> 
				${empresa.nome } - <fmt:formatDate value="${èmpresa.dataAbertura }"  pattern="dd/MM/yyyy"/> <!--imprime o nome da empresa  --> 
				<a href="/gerenciador/mostraEmpresa?id=${empresa.id }">Editar</a>		<!-- Mostra  empresa -->			
				<a href="/gerenciador/removeEmpresa?id=${empresa.id }">remove</a>		<!-- Remove  empresa -->
			</li>	
		</c:forEach>
	</ul> 

</body>
</html>