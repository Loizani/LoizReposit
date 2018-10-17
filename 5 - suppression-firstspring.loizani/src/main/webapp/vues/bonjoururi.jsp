<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title><spring:message code="titre.bonjour"/></title>
</head>
<body>
	<table border=1 bgcolor="#ABCDEF">
		<tr>
			<td>valeur de l'uri :</td><td>${personne}</td>
		</tr>
		<tr>
			<td>depuis variable entre accolades dans properties:</td>
			<td><p>
					<spring:message code="libelle.bonjour.lemonde"
						arguments="${personne}" />
				</p>
		</tr>
	</table>

</body>
</html>