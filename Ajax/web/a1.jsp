<%--
  Created by IntelliJ IDEA.
  User: zhao
  Date: 2021/4/22
  Time: 10:45 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.js"></script>

    <script>
        function a1() {
            $.post({
                <!-- 调用后台请求 -->
                url: "${pageContext.request.contextPath}/a1",
                <!-- 向请求的 url 传递参数 -->
                data: {"name" : $("#textName").val()},
                <!-- 后台返回数据，由前端控制页面；如果后台控制页面，则转发和重定向必然会刷新整个页面 -->
                success: function (data, status) {
                    alert("后台返回数据：" + data);
                    alert("连接请求状态：" + status);
                }
            });
        }
    </script>

</head>
<body>
<!-- 失去焦点触发事件 -->
用户名：<input type="text" id="textName" onblur="a1()">
</body>
</html>
