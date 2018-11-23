<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Books</h1>
<a href="<c:url value="/books/add"/> ">Dodaj książkę</a>
<table>
    <tr>
        <th>Title</th>
        <th>Author</th>
        <th>Isbn</th>
        <th>Akcje</th>
    </tr>
    <c:forEach var="book" items="${books}">
    <tr>
        <td>${book.title}</td>
        <td>${book.author}</td>
        <td>${book.isbn}</td>
        <td>
            <a href='<c:url value="/books/delete?id=${book.id}"/>'>usuń<a>
        </td>
    </tr>

    </c:forEach>
</table>
</body>
</html>
