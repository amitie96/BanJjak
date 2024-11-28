<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html>
<head>
<style>
    .buttonclass {
    border: none; /* 테두리 제거 */
    padding: 0; /* 기본 패딩 제거 */
    background: none; /* 배경 제거 */
    cursor: pointer; /* 마우스 오버 시 포인터 커서 */
    }

    .buttonclass img {
        display: block; /* 이미지 주변 간격 제거 */
        transition: transform 0.2s ease, filter 0.2s ease; /* 마우스 오버 시 애니메이션 */
    }

    /* 마우스 오버 시 스타일 */
    .buttonclass:hover img {
        transform: scale(1.01); 
        filter: brightness(1.2); 
    }
</style>
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
            <button type="submit" class="buttonclass" >
                <img src="resources/images/login.png"></a>
            </button>
        </div>
        <br><br>
    </form>
</div>               

<jsp:include page="../layouts/footer.jsp"/>
</body>
</html>