<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	<!-- Controle de fluxo -->


<html>
	<body>
	<!-- Se n�o for vazio a var n�o exibe -->
	<c:if test="${not empty empresa}">
			<!-- Imprime nome da empresa usando o jsp-->
			Empresa ${ empresa } cadastrada com sucesso!
	</c:if>
	<!-- Se for vazio a var exibe -->
	<c:if test="${empty empresa}">
			<!-- Imprime nome da empresa usando o jsp-->
			Nenhuma Empresa cadastrada!
	</c:if>	
	</body>
</html>
