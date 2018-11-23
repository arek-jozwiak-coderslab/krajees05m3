<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>JESTEM JSP</h1>

<p>Miles: ${miles}</p>
<p>kmkm: ${kmkm}</p>

<c:out value="${kmkm}" default="default value"/>
<c:out value="${ss}" default="default value"/>


<c:out value="<b> bold text </b>" escapeXml="true"/>
<c:out value="<b> bold text </b>" escapeXml="false"/>


</body>
</html>
