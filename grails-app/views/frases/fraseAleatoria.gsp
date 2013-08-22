<%--
  Created by IntelliJ IDEA.
  User: Leonardo
  Date: 22/08/13
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
  <title>Minhas frases</title>
</head>
<body>

<g:link action="list" controller="frases">Listar</g:link>


<h1>${minhaFrase.frase}</h1>
<p>${minhaFrase.autor}<p>

</body>
</html>