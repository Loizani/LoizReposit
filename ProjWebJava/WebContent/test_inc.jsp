<!-- Volontairement en erreur, sert de fichier à inclure -->
<%@page import="java.util.*"%>
<%
java.util.List<Integer> myliste = new ArrayList<Integer>(); ;
	myliste.add(0, 12 );
	out.println( myliste.get( 0 ) ); 
%>