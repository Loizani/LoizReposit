<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:property value="ListeMagasins" default="pas de magasin" />
	<br />

	<s:property value="%{ListeMagasins}" default="toujours pas de magasin" />

	<c:out value="${ListeMagasins}" />
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

</body>
</html>