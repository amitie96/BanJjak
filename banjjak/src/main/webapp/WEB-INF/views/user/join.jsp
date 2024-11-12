<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html>
<head>

<title>Member</title>
	<link rel="stylesheet" href="/resources/css/styles.css">
	<link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&display=swap" rel="stylesheet">

</head>
<body>
<jsp:include page="../layouts/header2.jsp"/>

	<div class="container">
       <img src="/resources/images/logo.png">
    </div>
	
	<h4>회원 가입</h4>
	<form:form method="post">
		<div>
		<label for="userId">아이디</label>
		<input type="text" name="userId">
		</div>
		<div>
		<label for="username">이름</label>
		<input type="text" name="username">
		</div>
		<div>
		<label for="nickname">닉네임</label>
		<input type="text" name="nickname">
		</div>
		<div>
		<label for="password">비밀번호</label>
		<input type="text" name="password">
		</div>
		<div>
		<label for="email">이메일</label>
		<input type="text" name="email">
		</div>
		
		<div><button>회원가입</button></div>
		<div><a href="/main">취소</a></div>
	</form:form>	       

<jsp:include page="../layouts/footer.jsp"/>
</body>
</html>