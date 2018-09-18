
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <br> <br>
  <a href="s1/testModelAndView">testModelAndView</a>
  <br> <br>
  <form action="s1/testPojo" method="post">
    username: <input type ="text" name="username"/>
    <br>
    password: <input type ="password" name="password"/>
    <br>
    email:<input type="text" name="email"/>
    <br>
    age:<input type="text" name="age">
    <br>
    city:<input type="text" name="address.city">
    <br>
    province:<input type="text" name="address.province">
    <br>
    <input type="submit" value="Submit">
  </form>
  <br> <br>
  <a href="s1/testCookieValue">testCookieValue</a><br>
  <br> <br>
  <a href="s1/testRequestParam?username=xuhaohao&age=2">testRequestParam</a><br>
  <br> <br>
  <form action="s1/testRest/1" method="post">
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="test Rest PUT"/>
  </form>
  <br> <br>
  <form action="s1/testRest" method="post">
    <input type="submit" value="test Rest POST"/>
  </form>
  <br> <br>
  <a href="s1/testRest/1">test Rest Get</a><br>

<form action="s1/testMethod" method="get">
  <input type="submit" value="submit"/>
</form>
  <a href="s1/testParamsAndHeaders?username=qwe&age=10">testParamsAndHeaders</a><br>
  <a href="s1/testPathVariable/1111">testPathVariable</a><br>
  <a href="s1/hello.action">hello Wrold!</a><br>

  </body>
</html>
