<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
    <h2>用户信息</h2>
    <table border="1px" style="background: burlywood;text-align: center">
        <tr style="text-align: center">
            <td>行号</td>
            <td>id</td>
            <td>姓名</td>
            <td>密码</td>
        </tr>
        <c:forEach var="user" items="${list}" varStatus="xxx">
            <tr style="text-align: center">
                    <%--//上个页面设置了xlh 必须更换 不能再叫xlh--%>
                <td>${xxx.index+1}</td>
                <td>${user.id}</td>
                <td>${user.userName}</td>
                <td>${user.passWord}</td>

            </tr>
        </c:forEach>
    </table>


    <a <c:if test="${pageNum>1}">
        href="/student?start=${start-count}&pageNum=${pageNum-1}&count=${count} "
    </c:if>>上一页</a>

    &nbsp;<a <c:if test="${start+count<total}">
    href="/student?start=${start+count}&pageNum=${pageNum+1}&count=${count}"
</c:if>>下一页</a>
    <br>
    当前为第${pageNum}页，每页显示${count}条，当前共${totalNum}页，共有${total}条数据
    <form method="get" action="/student">
        从索引为 <input type="text" name="start" style="width: 50px;text-align: center"> 开始查找，
        每页展示 <input type="text" name="count" style="width: 50px;text-align: center"> 条,
        结果设置为第 <input type="text" value="1" name="pageNum" readonly size="4" style="width: 20px;text-align: center"> 页
        <input type="submit"  value="GO">
    </form>
<a href="/student?start=0&pageNum=1&count=5" style="font-size: 14px;text-decoration: none">->回到默认</a>






</body>
</html>
