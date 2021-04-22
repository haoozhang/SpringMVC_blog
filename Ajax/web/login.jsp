<%--
  Created by IntelliJ IDEA.
  User: zhao
  Date: 2021/4/22
  Time: 6:22 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.js"></script>
    <script>
        function checkName() {
            $.post({
                url: "${pageContext.request.contextPath}/a3",
                data: {"name" : $("#name").val()},
                success: function (data) {
                    console.log(data)
                    if (data.toString() === "ok") {
                        $("#userInfo").css("color", "green");
                    } else {
                        $("#userInfo").css("color", "red");
                    }
                    $("#userInfo").html(data);
                }
            })
        }
        function checkPwd() {
            $.post({
                url: "${pageContext.request.contextPath}/a3",
                data: {"pwd" : $("#pwd").val()},
                success: function (data) {
                    console.log(data)
                    if (data.toString() === "ok") {
                        $("#pwdInfo").css("color", "green");
                    } else {
                        $("#pwdInfo").css("color", "red");
                    }
                    $("#pwdInfo").html(data);
                }
            })
        }
    </script>
</head>
<body>

<p>
    username: <input type="text" id="name" onblur="checkName()">
    <span id="userInfo"></span>
</p>
<p>
    password: <input type="text" id="pwd" onblur="checkPwd()">
    <span id="pwdInfo"></span>
</p>

</body>
</html>
