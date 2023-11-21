<%@ page import="java.rmi.Naming" %>
<%
    String message = null;
    try {
    } catch (Exception e) {
        e.printStackTrace();
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Next Page</title>
</head>
<body>
<h1>This is the Next Page</h1>
<!-- You can add more content or links here -->
<a href="index.jsp">Go back to Home Page</a>
<p>Message from server: <%=message%></p>
</body>
</html>
