<%@ taglib prefix="s" uri="/struts-tags" %>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p><s:property value="ListeMagasins" default="pas de magasin" /></p>
	<br />

	<p><s:property value="%{ListeMagasins}" default="toujours pas de magasin" /></p>

<%-- 	<p><c:out value="${ListeMagasins}" default="eeeeee"  /></p> --%>
	
	<br />
	<table boder=1>
		<thead>
			<tr>
				<th>Reference</th>
				<th>Designation</th>
				<th>Prix</th>
				<th>En solde</th>
			</tr>
		</thead>
		<s:iterator value="ListeProduits">
			<tr>
				<td><s:property value="strReference" /></td>
				<td><s:property value="strDesignation" /></td>
				<td><s:property value="iPrix" /></td>
				<td><s:property value="bSolded" /></td>
			</tr>
		</s:iterator>

	</table>
	<br />
	------------------------------------------------------------------------------
	<br />
	<%-- 	<s:property value="%{CatalogMap}" default="toujours pas de map" /> --%>

	<table>

		<s:iterator value="CatalogMap">
			<tr>
				<td><s:property value="key" /></td>

				<s:iterator value="value">

					<td><s:property /></td>

				</s:iterator>
			</tr>
		</s:iterator>

	</table>



</body>
</html>