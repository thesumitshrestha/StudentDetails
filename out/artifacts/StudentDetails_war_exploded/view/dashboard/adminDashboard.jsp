<%--
  Created by IntelliJ IDEA.
  User: sarasumit
  Date: 6/25/2016
  Time: 7:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin</title>
  <jsp:include page="../layouts/navbar.jsp" />
</head>
<body>
<h1 class="text-center text-success"> Students List </h1>
<div class="container">
<table class="table table-hover">
  <tr>
    <th> Name </th>
    <th> Batch </th>
    <th> Roll No. </th>
    <th> Email </th>
    <th> Address </th>
    <th colspan="2"> Action </th>
  </tr>

    <tr>
  <c:forEach var="student" items="${studentDetail}" >

<%--
    <td><c:out value="${student.id}" /></td>
--%>
    <td><c:out value="${student.name}" /></td>
    <td><c:out value="${student.batch}" /></td>
    <td><c:out value="${student.roll}" /></td>
    <td><c:out value="${student.email}" /></td>
    <td><c:out value="${student.address}" /></td>
    <td><a
            href="/editStudent?id=<c:out value="${student.id }"/>">Update</a></td>
    <td><a
            href="/deleteStudent?id=<c:out value="${student.id }"/>">Delete</a></td>

  </tr>
</c:forEach>

</table>
  </div>
</body>
</html>
