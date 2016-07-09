<%--
  Created by IntelliJ IDEA.
  User: sarasumit
  Date: 6/27/2016
  Time: 6:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Edit Student</title>
  <jsp:include page="layouts/navbar.jsp" />

</head>
<body>
<h1 class="text-center text-success"> Edit Student </h1>
<form class="form-horizontal" method="POST" action="/editStudent" style="margin: 0 auto;width: 50%;border: 2px solid #3573a3;padding: 42px;border-radius: 10px;box-shadow: 10px 10px 0px 0px #196096;">
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">Name</label>
    <div class="col-sm-10">
      <input type="text" value="${studentDetails.name}" class="form-control" name="name" id="inputEmail3" placeholder="Name">
    </div>
  </div>
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">Batch</label>
    <div class="col-sm-10">
      <select  name="batch" class="form-control"  required="">
        <option> 2015</option>
        <option>2016</option>
        <option>2017</option>
        <option>2018</option>
      </select>
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">Roll No:</label>
    <div class="col-sm-10">
      <input type="text" value="${studentDetails.roll}" class="form-control" name="roll" required="" placeholder="Roll No.">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">Email: </label>
    <div class="col-sm-10">
      <input type="text" value="${studentDetails.email}" class="form-control" name="email" required="" id="inputPassword3" placeholder="Email">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">Address: </label>
    <div class="col-sm-10">
      <input type="text" value="${studentDetails.address}" class="form-control" name="address" required="" placeholder="Address">
    </div>
  </div>
  <input type="hidden" name="id" value="${studentDetails.id}">
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-success">Update</button>
    </div>
  </div>
</form>

<%--<form method="POST" action="/editStudent">
  &lt;%&ndash;
    <input type="text" name="studentId" value="<c:out value='${student.id}' />" readonly="readonly" placeholder="Student ID" /><br>
  &ndash;%&gt;
  Name: <input type="text" name="name" required="" value="${studentDetails.name}"><br><br>
  Batch: <select name="batch" value="${studentDetails.batch}" required="">
  <option> 2015</option>
  <option>2016</option>
  <option>2017</option>
  <option>2018</option>
</select><br><br>
  Roll No: <input type="text" name="roll" value="${studentDetails.roll}" required=""><br><br>
  Email: <input type="text" name="email" value="${studentDetails.email}" required=""><br><br>
  Address: <input type="text" name="address" value="${studentDetails.address}" required=""><br><br>
  Address: <input type="hidden" name="id" value="${studentDetails.id}"><br><br>
  <input type="submit"><br>
</form>--%>
</body>
</html>

