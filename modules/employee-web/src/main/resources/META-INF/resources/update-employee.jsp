<%-- <%@page import="javax.portlet.RenderRequest"%>
<%@ include file="init.jsp"%>

<portlet:actionURL name="updateEmployee" var="updateStudentActionURL"/>
<aui:form action="<%=updateStudentActionURL%>" name="employeeForm" method="POST"/>


<%
	String  employeeId = renderRequest.getParameter("employeeId");
    String  firstName = renderRequest.getParameter("firstName");
    String lastName = renderRequest.getParameter("lastName");
    String email = renderRequest.getParameter("email");
    String password = renderRequest.getParameter("password");
    String phoneNumber = renderRequest.getParameter("phoneNumber");
    String address = renderRequest.getParameter("address");
    
%>


<aui:form action="${updateStudentActionURL}" method="post" >
	<aui:input type="text" name="employeeId" value="<%=employeeId %>"/>
	<aui:input name="firstName" type="text" value="${employee.firstName}"/>
	<aui:input name="lastName" type="text" value="${employee.lastName}"/>
	<aui:input name="email" type="text" value="${employee.email}"/>
	<aui:input name="password" type="text" value="${employee.password}"/>
	<aui:input name="phoneNumber" type="text" value="${employee.phoneNumber}"/>
	<aui:input name="address" type="text" value="${employee.address}"/>
	<aui:button type="submit" value="update" class="btn btn-warning btn-sm" />
</aui:form> --%>