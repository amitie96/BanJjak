<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Knitting</title>
    <link rel="stylesheet" href="/resources/css/styles.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&display=swap" rel="stylesheet">

   
</head>
<body>

    <jsp:include page="../layouts/header.jsp"/>

  	<p><strong>글 번호:</strong> ${knitting.knitId}</p>

    <p><strong>제목:</strong> ${knitting.knitTitle}</p>

    <p><strong>난이도:</strong> ${knitting.knitRate}</p>

    <p><strong>작성자:</strong> ${knitting.userId}</p>

    <p><strong>작성 시간:</strong> ${knitting.knitDate}</p>
    
    <img src="/upload/knitting/${knitting.knitUuid}_${knitting.knitFilename}">

    <jsp:include page="../layouts/footer.jsp"/>

</body>
</html>
