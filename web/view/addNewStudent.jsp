<%--
  Created by IntelliJ IDEA.
  User: sarasumit
  Date: 6/25/2016
  Time: 8:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New Student</title>
  <jsp:include page="layouts/navbar.jsp" />

</head>
<body>
<h1 class="text-center text-success"> Add New Student </h1>
<form class="form-horizontal" method="POST" action="/addNewStudent" style="margin: 0 auto;width: 50%;border: 2px solid #3573a3;padding: 42px;border-radius: 10px;box-shadow: 10px 10px 0px 0px #196096;">
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">Name</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="name" id="inputEmail3" placeholder="Name">
    </div>
  </div>
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">Batch</label>
    <div class="col-sm-10">
      <select name="batch" class="form-control"  required="">
        <option> 2015</option>
        <option>2016</option>
        <option>2017</option>
        <option>2018</option>
      </select>    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">Roll No:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="roll" required="" placeholder="Roll No.">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">Email: </label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="email" required="" id="inputPassword3" placeholder="Email">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">Address: </label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="address" required="" placeholder="Address">
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-success">Create</button>
    </div>
  </div>
</form>

<%--<form method="POST" action="/addNewStudent">
&lt;%&ndash;
  <input type="text" name="studentId" value="<c:out value='${student.id}' />" readonly="readonly" placeholder="Student ID" /><br>
&ndash;%&gt;
  Name: <input type="text" name="name" required=""><br><br>
  Batch: <select name="batch"  required="">
  <option> 2015</option>
  <option>2016</option>
  <option>2017</option>
  <option>2018</option>
</select><br><br>
  Roll No: <input type="text" name="roll" required=""><br><br>
  Email: <input type="text" name="email" required=""><br><br>
  Address: <input type="text" name="address" required=""><br><br>
  <input type="submit"><br>
</form>--%>
</body>
</html>
