<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<table border="1">
		<tr>
			<th>ID Prodotto</th>
			<th>Nome</th>
			<th>Qta Prodotto</th>
			<th>Azione</th>
		</tr>
		<c:forEach items="${listProdotti}" var="p">
		<tr>
			<td>${p.id}</td>
			<td>${p.nome}</td>
			<td>${p.qta}</td>
			<td>
				<a href="modifica?id=${p.id}">modifica</a>
				&nbsp;&nbsp;&nbsp;
				<a href="elimina?id=${p.id}">elimina</a>
			</td>
		</tr>
		</c:forEach>
	</table>
	
		<h3><a href="new">Nuovo Prodotto</a></h3>
	





</body>
</html>