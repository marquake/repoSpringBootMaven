<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
	<%@ page language='java' contentType='text/html;charset=iso-8859-1' isELIgnored="false" pageEncoding="ISO-8859-1" %>
	</head>
<body>

<h1>Alta Estudiantes</h1>


<form:form action="alta_estudiante" modelAttribute="estudiante" >
	Nombre: <form:input path="nombre"/>
	Apellido: <form:input path="apellido"/>

	<input type="submit" value="ENVIAR">
</form:form>

<br>
<a href="principal">Volver Estudiantes</a>

</body>
</html>