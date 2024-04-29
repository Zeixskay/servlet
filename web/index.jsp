<%--
  Created by IntelliJ IDEA.
  User: lh
  Date: 2022/11/30
  Time: 8:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
 <form action="/aaServlet" method="post">
   姓名：<input type="text" name="uname" /><br/>
   密码：<input type="password" name="upwd" /><br/>
   <input type="submit" value="登陆"/>
 </form>
  </body>
</html>
