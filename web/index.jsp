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
    <title>用户登录</title>
  </head>
  <body>
 <form action="/loginServlet" method="post">
     <h3>用户登录</h3>
   姓名：<input type="text" name="uname" /><br/>
   密码：<input type="password" name="upwd" /><br/>
   <input type="submit" value="登陆"/>
 </form>
  </body>
</html>
