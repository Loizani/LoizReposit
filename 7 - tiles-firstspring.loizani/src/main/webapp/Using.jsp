<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p><a href="" target="_NEW">Url racine</a></p>
<p><a href="bonjoururi/ttttt" >Tester @PathVariable</a></p>
<p><H3><u>&#9658;UTILISATION DE TILES : </u></H3></p>
<p><H5><u>SANS TILES : </u></H5></p>
<p><a href="afficherListeCourses" >SANS TILES : LECTURE données </a></p>
<br />
<p><H5><u>AVEC TILES : </u></H5></p>
<p><a href="afficherListeCoursesTiles" >Affichage TILES : LECTURE données sql persistente Hibernate</a></p>
<p><a href="afficherCreationListeCourses" >Affichage TILES : AJOUT données sql persistente Hibernate</a></p>
<p><a href="afficherSuppressionListeCourses" >Affichage TILES : SUPPRESSION données sql persistente Hibernate</a></p>
<p><a href="afficherModificationListeCourses" >Affichage TILES : Modification données sql persistente Hibernate</a></p>
</body>
</html>