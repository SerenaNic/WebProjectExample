<%@page import="it.unirc.campo_coni.util.BorderoBean"%>
<%@page import="java.util.LinkedList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personale Page</title>
</head>
<body>
<h1>Ciao Sei autenticato</h1>

	<%
		LinkedList<BorderoBean> b = (LinkedList<BorderoBean>) request.getAttribute("queryResults");
	%>


	<table>
		<tr>
			<th>IVR Code</th>
			<th>Periodo</th>
			<th>Stringa</th>
			<th>Modifica</th>
		</tr>
		<% for (int i =0; i<b.size();i++){
			%>
			<tr>
			<td><%=b.get(i).getCodice_ivr()%></td>
			<td><%=b.get(i).getPeriodo()%></td>
			<td><%=b.get(i).getStringa()%></td>
			<td><button><a href="<%=request.getContextPath()%>/Update.jsp?ivr=<%=b.get(i).getCodice_ivr()%>&periodo=<%=b.get(i).getPeriodo()%>">Modifica</a></button></td>
		</tr>
			
			<%} %>
		
	</table>
</body>
</html>