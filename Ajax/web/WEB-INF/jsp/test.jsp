<!--<%@ page contentType="text/html;charset=UTF-8" language="java" %>-->
<html>
<head>
    <title>iFrame体验页面无刷新</title>

    <script>
        function goto() {
            <!-- 获取文本框的内容 -->
            const url = document.getElementById("url").value;
            <!-- iFrame 的地址赋值 -->
            document.getElementById("iFrm").src = url;
        }
    </script>
</head>
<body>

<div class="form-inline">
    <p>请输入弹窗地址:</p>
    <p>
        <!-- 文本框和提交按钮 -->
        <input type="text" id="url" value="https://haozhangms.github.io/">
        <input type="button" value="submit" onclick="goto()">
    </p>
</div>

<div>
    <!-- 定义一个 iFrame -->
    <iframe id="iFrm" style="width: 50%; height: 500px"></iframe>
</div>

</body>
</html>
