<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	<!-- Controle de fluxo -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<c:url value="/alteraEmpresa" var="linkServletNovaEmpresa" /> <!-- guarda o valor na vaariavel -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- Criando formul�rio -->
	<!-- SubCaminho para acessar a servlet -->
	<form action="${linkServletNovaEmpresa}" method="post"> 
	
		Nome: <input type="text" name="nome" value="${empresa.nome }"/>	<!--Cria a string "nome" e a caixa  --> 
		Data Abertura: <input type="text" name="data" value="<fmt:formatDate value="${�mpresa.dataAbertura }"  pattern="dd/MM/yyyy"/>"/> 
			<input type="hidden" name="id" value="${empresa.id }">
			<input type="submit"  />	<!-- Cria um bot�o -->
	
	</form>
</body>
</html>