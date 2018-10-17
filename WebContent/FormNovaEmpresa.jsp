<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	<!-- Controle de fluxo -->
<c:url value="/novaEmpresa" var="linkServletNovaEmpresa" /> <!-- guarda o valor na vaariavel -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- Criando formulário -->
	<!-- SubCaminho para acessar a servlet -->
	<form action="${linkServletNovaEmpresa}" method="post"> 
	
		Nome: <input type="text" name="nome"/>	<!--Cria a string "nome" e a caixa  --> 
		Data Abertura: <input type="text" name="data"/> 
		
		<input type="submit"  />	<!-- Cria um botão -->
	
	</form>
</body>
</html>