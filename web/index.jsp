
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <br> <br>

  <br> <br>
  <br> <br>
  <a href="<%= this.getServletContext().getContextPath() %>/s1/testRequestParam?username=xuhaohao&age=2">testRequestParam</a><br>
  <br> <br>
  <form action="<%= this.getServletContext().getContextPath() %>/s1/testRest/1" method="post">
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="test Rest PUT"/>
  </form>
  <br> <br>
  <form action="<%= this.getServletContext().getContextPath() %>/s1/testRest" method="post">
    <input type="submit" value="test Rest POST"/>
  </form>
  <br> <br>
  <a href="<%= this.getServletContext().getContextPath() %>/s1/testRest/1">test Rest Get</a><br>

<form action="<%= this.getServletContext().getContextPath() %>/s1/testMethod" method="get">
  <input type="submit" value="submit"/>
</form>
  <a href="<%= this.getServletContext().getContextPath() %>/s1/testParamsAndHeaders?username=qwe&age=10">testParamsAndHeaders</a><br>
  <a href="<%= this.getServletContext().getContextPath() %>/s1/testPathVariable/1111">testPathVariable</a><br>
  <a href="<%= this.getServletContext().getContextPath() %>/s1/hello.action">hello Wrold!</a><br>

  </body>
</html>