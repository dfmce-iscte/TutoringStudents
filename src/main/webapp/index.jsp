<%@ page import="java.rmi.Naming" %>
<%@ page import="interfaces.*" %>
<%@ page import="java.util.*" %>
<%
Map<ITeacher,Set<IAppointment>> teacher=null;
    try {
    	ITutoringServer server = (ITutoringServer) Naming.lookup("TutoringPlatform");
		 teacher= server.search_availability_for_specific_subject("Math");
    } catch (Exception e) {
        e.printStackTrace();
    }
%>
<p>Message from server: <%=teacher%></p>
<h1>Welcome to the Home Page</h1>
<a href="nextPage.jsp">Go to Next Page</a>



<script src="js/jquery-3.4.1.min.js"></script>
<script src="js/bootstrap.js"></script>
<script src="js/custom.js"></script>

