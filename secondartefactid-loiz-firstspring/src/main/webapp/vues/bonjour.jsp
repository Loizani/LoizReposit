<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        
    </head> 
    <body>
        <table border = 1 >
        <tr><td>sans controleur juste message : </td><td><p><spring:message code="libelle.bonjour"/></p></td></tr>
        <tr><td>avec controleur et message : </td><td><p><spring:message code="libelle.bonjour.lemonde" arguments="${personne}"/></p></tr>
        </table>
    </body>
</html>