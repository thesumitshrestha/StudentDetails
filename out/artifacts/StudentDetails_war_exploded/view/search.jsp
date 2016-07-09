<%--
  Created by IntelliJ IDEA.
  User: sarasumit
  Date: 6/26/2016
  Time: 10:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Search Results</title>
  <jsp:include page="layouts/navbar.jsp"/>
</head>
<body>
<h1 class="text-center text-success"> Search Results </h1><br>
<div class="container">
<table class="table table-hover">
  <tr>
    <th> Name </th>
    <th> Batch </th>
    <th> Roll No. </th>
    <th> Email </th>
    <th> Address </th>
<%--
    <th colspan="2"> Action </th>
--%>
  </tr>

  <tr>
<c:forEach var="student" items="${studentDetail}" >
  <tr>
    <td><c:out value="${student.name}" /></td>
    <td><c:out value="${student.batch}" /></td>
    <td><c:out value="${student.roll}" /></td>
    <td><c:out value="${student.email}" /></td>
    <td><c:out value="${student.address}" /></td>
   <%-- <td><a
            href="AddNewServlet?action=edit&id=<c:out value="${student.id }"/>">Update</a></td>
    <td><a
            href="AddNewServlet?action=delete&id=<c:out value="${student.id }"/>">Delete</a></td>
  </tr><br><br>--%>
</c:forEach>
  </table>
  </div>
</body>
</html>
