<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>${param.km} km to ${param.km*1.609344} mil</p>


<c:out value="${role}" default="guest"/>


${start} <br/>
${end}
</body>
</html>
