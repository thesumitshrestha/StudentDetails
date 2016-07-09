<%--
  Created by IntelliJ IDEA.
  User: sarasumit
  Date: 6/24/2016
  Time: 10:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
  <jsp:include page="../layouts/files.jsp" />
</head>
<body>

<div class="top-content">

    <div class="inner-bg">
        <div class="container">
            <div class="row">
                <div class="col-md-4">

                </div>

                <div class="col-md-4">
                    <div class="form-box">
                        <div class="form-top">
                            <div class="form-top-left">
                                <h3 class="text-center">Register Form</h3>
                            </div>
                            <div class="form-top-right">
                                <i class="fa fa-key"></i>
                            </div>
                        </div>
                        <form action="/newUser" method="post">
                            <input type="text" name="firstName" placeholder="First Name" class="form-first-name form-control" id="form-first-name"><br>

                            <input type="text" name="lastName" placeholder="Last Name" class="form-first-name form-control" id="form-first-name"><br>

                            <input type="test" name="email" placeholder="Email" class="form-first-name form-control" id="form-first-name"><br>

                            <input type="text" name="username" placeholder="Username" class="form-first-name form-control" id="form-first-name"><br>

                            <input type="password" name="password" placeholder="Password" class="form-first-name form-control" id="form-first-name"><br>

<%--
                            <input type="text" class="validate" name="lastName" id = "lastName"/>

                            <input type="text" class="validate" name="email" id = "email"/>

                            <input type="text" class="validate" name="username" id = "username"/>

                            <input type="password" class="validate"  name="password" id = "password"/>--%>
                            <button type="submit" class="btn-lg btn-success">
                                Register
                            </button>
                    </form>


                     <%--   <form action='/login' method='POST' autocomplete='off'>
                            <div class="form-group">
                                <label class="sr-only" for="form-first-name" style="color:black">Username</label>
                                <input type="text" name="username" placeholder="Username" class="form-first-name form-control" id="form-first-name">
                            </div>

                            <div class="form-group">
                                <label class="sr-only" for="form-first-name" style="color:black">Password</label>
                                <input type="password" name="password" placeholder="Password" class="form-first-name form-control" id="form-first-name">
                            </div>

                            &lt;%&ndash;<input type='text' class='validate' name='username' id='username'/>
                            <label for="username">Username</label>
                            <input class="validate" type="password" name='password' id='password'/>
                            <label for="password">Password</label>&ndash;%&gt;

                            <button type="submit" class="btn btn-lg btn-success">Login</button>
                            <br>
                            <a href="../user/register.jsp" class="btn waves-effect waves-light green accent-3" type="submit">
                                Register
                            </a>&nbsp;&nbsp;If not yet logged in.
                        </form>
--%>

                    </div>
                </div>
                <div class="col-md-4">

                </div>
            </div>
        </div>
    </div>

</div>

<%--<form action="/newUser" method="post">
        <label for="firstName">First Name</label>
        <input type="text" class="validate" id = "firstName" name="firstName"/>
        <label for="lastName">Last Name</label>
        <input type="text" class="validate" name="lastName" id = "lastName"/>
        <label for="email">Email</label>
        <input type="text" class="validate" name="email" id = "email"/>
        <label for="username">Username</label>
        <input type="text" class="validate" name="username" id = "username"/>
        <label for="password">Password</label>
        <input type="password" class="validate"  name="password" id = "password"/>
    <button type="submit">
      Register
    </button>
  </div>
</form>--%>
</div>
</body>
</html>
