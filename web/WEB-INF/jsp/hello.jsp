<!--

@create 2016-11-22 17:43
@author HelloWood
@email hellowoodes@gmail.com
-->
<%@ page contentType="text/html;charset=UTF-8"  isELIgnored ="false" language="java" %>
<html>
<head>
    <title>Title
    </title>
</head>
<body>
<h1>Success Page!</h1>
<h1>time: ${requestScope.time}</h1>
<h1>names: ${requestScope.names}</h1>

<h1>request user: ${requestScope.user}</h1>

<h1>session user: ${sessionScope.user}</h1>

<h1>request school: ${requestScope.school}</h1>

<h1>session school: ${sessionScope.school}</h1>
</body>
</html>
