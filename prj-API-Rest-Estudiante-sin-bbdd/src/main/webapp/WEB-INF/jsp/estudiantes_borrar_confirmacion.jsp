<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
	<%@ page language='java' contentType='text/html;charset=iso-8859-1' isELIgnored="false" pageEncoding="ISO-8859-1" %>
	</head>
<body>

<h1>Confirmación borrado Estudiantes</h1>

* se va a borrar al siguiente estudiante:<br>

	ID: ${estudiante.id}
	Nombre: ${estudiante.nombre}
	Apellido: ${estudiante.apellido}

<br>

<a href="alta">Volver Estudiantes</a>

</body>
</html>