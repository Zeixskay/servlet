<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>用户信息</h2>
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


<a <c:if test="${start>1}">
    href="/login?start=${start-5}&pageNum=${pageNum-1} "
</c:if>>上一页</a>

&nbsp;<a <c:if test="${start+5<total}">
    href="/login?start=${start+5}&pageNum=${pageNum+1} "
</c:if>>下一页</a>
<br>
当前共${totalNum}页，共有${total}条数据 当前为第${pageNum}页

</body>
</html>
