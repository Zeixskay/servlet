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
 <form action="/regist" method="post">
     <h3>用户注册</h3>
   姓名：<input type="text" name="uname" /><br/>
   密码：<input type="password" name="upwd" /><br/>
   <input id="regist" type="submit" value="注册"/>

 </form>
  </body>
<script>
    document.getElementById("regist").addEventListener('click',function () {
        alert("注册成功！");
    })
</script>
</html>
