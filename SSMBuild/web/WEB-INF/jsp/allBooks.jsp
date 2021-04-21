<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">
    <div class="row clear">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row form-inline">
        <div class="col-md-2 column">
            <!-- toAddBook -->
            <a class="btn btn-primary" style="margin-right: 15px" href="/book/toAddBook">新增</a>
            <a class="btn btn-primary" href="/book/allBooks">显示全部</a>
        </div>
        <div class="pull-left">
            <!-- searchBook -->
            <form action="/book/SearchBook" method="post">
                <input type="text" name="searchBookName" class="form-control" placeholder="请输入查询的书籍名称">
                <input type="submit" value="查询" class="btn btn-primary" style="margin-left: 15px">
            </form>
        </div>
    </div>

    <div class="row clear">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                    <tr>
                        <th>书籍编号</th>
                        <th>书籍名称</th>
                        <th>书籍数量</th>
                        <th>书籍描述</th>
                        <!-- 更新和删除操作 -->
                        <th>操作</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="book" items="${bookList}">
                        <tr>
                            <td>${book.bookId}</td>
                            <td>${book.bookName}</td>
                            <td>${book.bookCounts}</td>
                            <td>${book.detail}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/book/toUpdateBook?id=${book.bookId}">更新</a>

                                <a href="/book/deleteBook/${book.bookId}">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>
</html>
