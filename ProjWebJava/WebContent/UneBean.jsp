<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<jsp:useBean id="userid" scope="page" class="test.javabeanpac.IdentiteBean">
<jsp:setProperty name="userid" property="nom" value="Loizani"></jsp:setProperty>
</jsp:useBean>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Première page JSP</title>
</head>
<body>
<form action="Personne.jsp" Method="post">
<jsp:getProperty  property="nom" name="userid" />
<p><% out.println("Bonjour :"); %></p>
<br />
<table  style="width:400px" border=1>
<tr><td colspan=2>Identit&eacute;</td></tr>
<tr><td style="width:20px;padding:10px">Nom</td><td><input type=text name="butName"></td></tr>
<tr><td>Prenom</td><td><input type=text name="butPrenom"></td></tr>
<tr><td>Age</td><td><input type=text name="butAge"></td></tr>
<tr><td>Année de naissance</td><td><input type=text name="butAnnee"></td></tr>
</table> <br/>
<input type=button onclick="window.location.href='./Personne.jsp'" value="vers personne">
<br/>
<input type=submit>
</form>
</body> 

</html>