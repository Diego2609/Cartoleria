<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>       
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">
		<h2>Modifica Prodotto</h2>
		<form:form action="edit" method="post" modelAttribute="prodotto">
			<table >
				<tr>
					<td>ID: </td>
					<td>${prodotto.id}
						<form:hidden path="idProdotto"/>
					</td>
				</tr>			
				<tr>
					<td>Nome: </td>
					<td><form:input path="nome" /></td>
				</tr>
				<tr>
					<td>Quantità: </td>
					<td><form:input type="number" path="qtaProdotto" /></td>
				</tr>		
				<tr>
					<td colspan="2"><input type="submit" value="Salva"></td>
				</tr>						
			</table>
		</form:form>
		<form action="indietro" method="post">
		<input type="submit" value="indietro">		
		</form>
	</div>

</body>
</html>