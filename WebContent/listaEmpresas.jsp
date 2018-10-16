<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa" %>	<!-- Importa  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Lista  de empresas: <br/>
	<ul>
	<% 
		List<Empresa> lista = (List<Empresa>)request.getAttribute("empresas");
		for (Empresa empresa : lista) {
	%>	<!-- Imprime o nome da empresa -->
		<li><%= empresa.getNome() %></li>	
	<% //Realiza um laço
		}
	%>
	</ul>

</body>
</html>