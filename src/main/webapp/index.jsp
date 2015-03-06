<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--@elvariable id="blog" type="com.epam.tb.blog.model.Blog"--%>
<html>
<head>
    <title>Blog</title>
</head>
<body>
<h1>${blog.title}</h1>
<h2>${blog.description}</h2>

<c:forEach items="${blog.posts}" var="post"><%--@elvariable id="post" type="com.epam.tb.blog.model.Post"--%>
    <h3>${post.title}</h3>
    <div>Author: ${post.author}</div>
    <div>Created on: ${post.creationDate} </div>
    <div>${post.body}</div>


</c:forEach>
</body>
</html>
