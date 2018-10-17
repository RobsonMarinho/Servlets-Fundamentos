<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa" %>	<!-- executa a Importação -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	<!-- Importa o jstl.jar -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standart Taglib</title>
</head>
<body>
	Lista de empresas: <br />
	
	<ul>	<!-- Realiza o laço -->
		<c:forEatch items="${empresas}" var="empresa">	<!-- Acessa a variável empresa -->
			<li> ${empresa.nome } </li>	<!--imprime o nome da empresa  -->
		</c:forEatch>
	</ul>
	
	
	
	
	<ul>
	<% 
		List<Empresa> lista = (List<Empresa>) request.getAttribute("empresas");
		for (Empresa empresa : lista) {
	%>	
		<!-- Imprime o nome da empresa -->
		<li><%= empresa.getNome() %></li>	
	<% 
		}
	%>
	</ul>

</body>
</html>