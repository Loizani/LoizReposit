<%@ taglib prefix="s" uri="/struts-tags" %>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Liste de magasins : <s:property value="ListeMagasins" default="pas de magasin" /></p>
	<p>Liste de produits : <s:property value="ListeProduits" default="pas de produits" /></p>



</body>
</html>