<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<%--User: ljh  Date: 2017/11/24  Time: 19:02--%>

<html>
<head>
    <title>用户注册</title>
    <%--<script type="text/javascript" src="js/jquery.min.js"></script>--%>
    <%--有网络访问时使用速度更快--%>
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script type="text/javascript">
        $(function() {
            $("#create").click(function() {
                var data = {
                    userName:$("#userName").val(),
                    password:$("#password").val()
                };
                $.ajax( {
                    type : "POST",
                    url : "/user/userInsert.action",
                    data : data,
                    dataType: "text",
                    success : function(msg) {
                        alert(msg);
                    },
                    error : function(msg) {
                        alert(msg);
                    }
                });
            });
        });
    </script>
</head>
<body>
    <table>
        <tr>
            <th>用户名：</th>
            <td>
                <input type="text" id="userName" name="userName" />
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
                <input type="button" id="create" value="注册" />
            </td>
        </tr>
    </table>
</body>
</html>