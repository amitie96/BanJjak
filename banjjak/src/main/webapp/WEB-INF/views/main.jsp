<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>

<title>BanJjak</title>
	<link rel="stylesheet" href="/resources/css/styles.css">
	<link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&display=swap" rel="stylesheet">
    
</head>
<body>


<jsp:include page="layouts/header.jsp"/>

${userInfo.userId}
${userInfo.username}
${userInfo.nickname}
${userInfo.password}
${userInfo.email}


<jsp:include page="layouts/footer.jsp"/>
</body>
</html>