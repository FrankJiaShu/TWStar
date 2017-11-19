<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%-- @User:ljh  @Date:2017/11/13 @Time: 10:23--%>

<html>
<head>
    <title>菜单首页</title>
</head>
<body>
<c:set var="runDate" value="<%=new Date()%>" />
<h1>
    您好<c:out value="${user.userName}" default=""/>,<br />
    欢迎登录TWStar综合管理系统<br />
    我是小T~<br />
    现在是<fmt:formatDate value="${runDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
</h1>
</body>
</html>
