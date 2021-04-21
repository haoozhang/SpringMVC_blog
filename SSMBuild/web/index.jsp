<%--
  Created by IntelliJ IDEA.
  User: zhao
  Date: 2021/4/20
  Time: 3:05 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>ssmbuild</title>
    <style>
      a{
        text-decoration: none;
        color: black;
        font-size: 30px;
      }
      h3{
        width: 240px;
        height: 80px;
        margin: 100px auto;
        text-align: center;
        line-height: 80px;
        background: deepskyblue;
        border-radius: 4px;
      }
    </style>
  </head>
  <body>
  <h3>
    <a href="${pageContext.request.contextPath}/book/allBooks">展示书籍列表</a>
  </h3>
  </body>
</html>
