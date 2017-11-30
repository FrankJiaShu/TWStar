<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--User: ljh  Date: 2017/11/12  Time: 10:23--%>

<html>
<head>
    <title>Welcome to TWStar</title>
</head>
<body>
<form action="user/userLogin.action" method="get">
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
</body>
</html>
