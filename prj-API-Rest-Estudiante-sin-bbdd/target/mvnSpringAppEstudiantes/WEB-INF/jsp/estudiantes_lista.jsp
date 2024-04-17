<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
	<head>
	<%@ page language='java' contentType='text/html;charset=iso-8859-1' isELIgnored="false" pageEncoding="ISO-8859-1" %>
	</head>
<body>

<h1>Lista Estudiantes</h1>
<!--
<a href="/estudiantes/lista">Ver lista Estudiantes</a>
<a href="/estudiantes/alta">Alta Estudiantes</a>
 -->

<table border="1">
	<thead>
		<tr>
			<td><b>ID</b></td>
			<td><b>nombre</b></td>
		</tr>
	</thead>

<c:forEach items="${estudiantes}" var="estudiante">
	<tr>
		<td><c:out value="${estudiante.id}"/></td>
		<td><c:out value="${estudiante.nombre}"/></td>
		<td><a href="modificar/<c:out value="${estudiante.id}"/>">Modificar</a></td>
		<td><a href="borrar/<c:out value="${estudiante.id}"/>">Borrar</a></td>
	</tr>
</c:forEach>

</table>

<!--  -->
<a href="principal">Volver Estudiantes</a>



</body>
</html>