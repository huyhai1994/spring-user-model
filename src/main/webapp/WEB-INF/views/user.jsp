<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%--TODO: Bước 9: Tạo view user.jsp
        View user.jsp hiển thị thông tin của người dùng
        trong trường hợp đăng nhập thành công.
--%>
<head>
    <title>Title</title>
</head>
<body>
<h1>Welcome</h1>
<h3>Account: ${user.account}</h3>
<h3>Name: ${user.name}</h3>
<h3>Email: ${user.email}</h3>
<h3>Age: ${user.age}</h3>
</body>
</html>