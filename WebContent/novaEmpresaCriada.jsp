<%

String nomeEmpresa = (String)request.getAttribute("empresa");
System.out.println(nomeEmpresa);

%>


<html>
<body>
<!-- Imprime nome da empresa --> <!-- Usa o jsp -->
Empresa <%= nomeEmpresa %> cadastrada com sucesso!
</body>
</html>
