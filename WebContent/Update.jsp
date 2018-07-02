<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UpdateServlet" method="post">
		IvrCode:<input type="text" name="ivrCode" value="<%=request.getParameter("ivr")%>"/><br />
		<br /> Periodo:<input type="text" name="periodo" value="<%=request.getParameter("periodo")%>"/><br />
		<input type="hidden" name="ivrCodeOld" value="<%=request.getParameter("ivr")%>"/><br />
		<input type="hidden" name="periodoOld" value="<%=request.getParameter("periodo")%>"/><br />
		<br /> <input type="submit" value="Modifica" />
	</form>
	
	
</body>
</html>