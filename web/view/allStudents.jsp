<%--
  Created by IntelliJ IDEA.
  User: sarasumit
  Date: 6/25/2016
  Time: 7:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>All Students</title>
</head>
<body>
<c:forEach var="student" items="${studentDetail}" >
<tr>
  <td><c:out value="${student.id}" /></td>
  <td><c:out value="${student.name}" /></td>
  <td><c:out value="${student.batch}" /></td>
  <td><c:out value="${student.roll}" /></td>
  <td><c:out value="${student.email}" /></td>
  <td><c:out value="${student.address}" /></td>
  <td><a
          href="/editStudent?action=update&id=<c:out value="${student.id }"/>">Update</a></td>
  <td><a
          href="/editStudent?action=delete&id=<c:out value="${student.id }"/>">Delete</a></td>
</tr><br><br>
</c:forEach>

</body>
</html>
