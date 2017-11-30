<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%--User: ljh  Date: 2017/11/19  Time: 10:23,if not pass then jump to here--%>

<html>
<head>
    <title>Welcome to TWStar</title>
</head>
<body>
<form action="userLogin.action" method="get">
    <table>
        <tr>
            <th>账号：</th>
            <td>
                <input type="text" id="userId" name="userId" />
            </td>
        </tr>
        <tr>
            <th>密码：</th>
            <td>
                <input type="password" id="password" name="password" />
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="登录" />
            </td>
        </tr>
    </table>
</form>
<%--如果密码错误，返回错误信息--%>
<c:out value="${error}" default="" />
</body>
</html>
