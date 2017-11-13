<%--User: ljh  Date: 2017/11/12  Time: 10:23--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to TWStar</title>
</head>
<body>
    ${error}
    <form action="login.do" method="get">
        <table>
            <td>
                <tr>账号：</tr>
                <tr>
                    <input type="text" id="userId" name="userId" /><br />
                </tr>
            </td>
            <td>
                <tr>密码：</tr>
                <tr>
                    <input type="password" id="password" name="password" /><br />
                </tr>
            </td>
            <td>
                <tr>
                    <input type="submit" value="登录" />
                </tr>
            </td>
        </table>
    </form>
</body>
</html>
