<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

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
<jsp:include page="../layouts/header2.jsp"/>

<div class="ctbox">
    <div class="container">
       <img src="/resources/images/logo.png">
    </div>

    <form method="post">
        <div class="container">
            <p>아이디</p> <input name="userId" style="margin-left:13px" ></input>
        </div>
        <div class="container">
             <p>비밀번호</p> <input name="password" type="password"></input>
        </div>
        
        <div class="container">
            <button type="submit" class="button" >
                <img src="resources/images/login.png"></a>
            </button>
        </div>
    </form>
</div>               

<jsp:include page="../layouts/footer.jsp"/>
</body>
</html>