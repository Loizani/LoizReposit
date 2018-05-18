<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Titre servlet No 2</title>
</head>
<body>
<p>2) Par le mappage de cette page jsp et de la servlet MaServlet, il y a ecrasement de ce contenu par a servlet</p>
<p>Pour le vérifier mapper puis démapper par le fichier web.xml sité dans le dossier WebContent</p>
<p>
	<%
	String strRecupCoucou = (String)request.getAttribute("varCoucou");
	out.println(strRecupCoucou);
	%>
</p>
</body> 

</html> 