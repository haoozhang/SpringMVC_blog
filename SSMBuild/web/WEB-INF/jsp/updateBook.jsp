<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="/book/updateBook" method="post">
        <!-- update SQL 语句执行时需要 bookId -->
        <input type="hidden" name="bookId" value="${selectBook.bookId}">
        书籍名称: <input type="text" name="bookName" value="${selectBook.bookName}" required><br><br><br>
        书籍数量: <input type="text" name="bookCounts" value="${selectBook.bookCounts}" required><br><br><br>
        书籍描述: <input type="text" name="detail" value="${selectBook.detail}" required><br><br><br>
        <input type="submit" value="修改">
    </form>
</div>

</body>
</html>
