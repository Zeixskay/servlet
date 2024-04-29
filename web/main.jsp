<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px" style="background: burlywood">
    <tr>
        <td>行号</td>
        <td>id</td>
        <td>姓名</td>
        <td>密码</td>
    </tr>
    <c:forEach var="user" items="${list}" varStatus="xxx">
        <tr>
            <%--//上个页面设置了xlh 必须更换 不能再叫xlh--%>
            <td>${xxx.index+1}</td>
            <td>${user.id}</td>
            <td>${user.userName}</td>
            <td>${user.passWord}</td>

        </tr>
    </c:forEach>
</table>
<a>上一页</a>&nbsp;<a>下一页</a>

</body>
</html>
