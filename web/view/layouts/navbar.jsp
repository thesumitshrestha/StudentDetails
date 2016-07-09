<%--
  Created by IntelliJ IDEA.
  User: sarasumit
  Date: 6/25/2016
  Time: 9:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
  <jsp:include page="../layouts/files.jsp" />

</head>
<body>
<nav class="navbar navbar-light bg-faded">
  <a class="navbar-brand" href="#">Student Details</a>
  <ul class="nav navbar-nav">
    <li class="nav-item active">
      <a class="nav-link" href="/view/dashboard/adminDashboard.jsp">Home </a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="view/addNewStudent.jsp">Add Students</a>
    </li>
    <li class="nav-item pull-right">
      <a class="nav-link" href="/logout">Logout</a>
    </li>
  </ul>
  <form action="/search" method="post" class="form-inline pull-xs-right">
    <input class="form-control" type="text" name="name" placeholder="Search By Name">
    <button class="btn btn-success-outline" type="submit">Search</button>
  </form>
</nav>

<%--<table>
  <tr><a href='/2015'> 2015 </a> </tr>
  <tr><a href="2016.jsp"> 2016 </a> </tr>
  <tr><a href="2017.jsp"> 2017 </a> </tr>
  <tr><a href="2018.jsp"> 2018 </a> </tr>
</table>
<a href="/allStudents"> All Students </a>--%>

</body>
</html>
