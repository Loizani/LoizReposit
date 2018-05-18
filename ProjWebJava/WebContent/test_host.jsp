<%@ page import="java.util.ArrayList" %>
<%-- Comment --%>
<%--
*************    La directive jsp suivante aurait généré une erreur,
*************    car elle est compilée isolément bien que sur la même page
    
  ***********   <jsp:include page="test_inc.jsp"  /> ******************************
--%>

<%@ include file="test_inc.jsp" %>  