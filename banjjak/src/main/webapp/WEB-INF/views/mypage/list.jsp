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

<style>
      .mypage {
            text-align: center;
            text-justify: distribute;
        }
        .manage-section {
            text-align: center;
            margin: 20px 0;
        }
        .category {
            display: flex;
            justify-content: center;
            gap: 40px;
            margin: 20px 0;
        }
        .mypage ul {
            list-style-type: none;
            padding: 0;
            text-align: center;
        }
        .box {
            width: 300px;
            height: 200px;
            border: 2px solid #FFFF99;
            background-color:  #FFFFE0;
            padding: 20px;
            text-align: center;
            box-sizing: border-box;
            border-radius: 20px;
        }
        .mypage li {
            margin-bottom: 15px;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        label {
            width: 150px;
            text-align: right;
            margin-right: 10px;
        }
        h3 {
        	text-align: left;
        }
    </style> 
</head>
<body>


<jsp:include page="../layouts/header.jsp"/>

<!-- 내 글 관리 섹션 -->
<div class="manage-section">
    <h1>내 글 관리</h1>
    
    <div class="category">
        <!-- 대바늘 글 목록 -->
        <div>
            <label>대바늘</label>
            <ul class="box">
             	<c:forEach var="knitting" items="${myKnitList}">
			        <h3>${knitting.knitTitle}</h3>
				</c:forEach>
            </ul>
        </div>
        <!-- 코바늘 글 목록 -->
        <div>
            <label>코바늘</label>
            <ul class="box">
				<c:forEach var="crochet" items="${myCroList}">
			        <h3>${crochet.croTitle}</h3>
				</c:forEach>
            </ul>
        </div>
    </div>
</div>

<!-- 내 정보 수정 섹션 -->
<div class="mypage">
    <h1>내 정보 수정</h1>
    <br>
    <!-- 사용자 정보 수정 폼 -->
    <form action="/mypage/list" method="POST">
        <ul>
            <li>
                <label for="userid">아이디</label>
                <input type="text" id="userId" name="userId" value="${userInfo.userId}" readonly required>
            </li>
            <li>
                <label for="userpassword">비밀번호</label>
                <input type="password" id="userpassword" name="password" placeholder="새 비밀번호" value="${userInfo.password}">
            </li>
            <li>
                <label for="username">이름</label>
                <input type="text" id="username" name="username" value="${userInfo.username}" maxlength="15" required>
            </li>
            <li>
                <label for="nickname">닉네임</label>
                <input type="text" id="nickname" name="nickname" value="${userInfo.nickname}" maxlength="15" required>
            </li>
            
            <li>
                <label for="user-mail">이메일</label>
                <input type="email" id="user-mail" name="email" value="${userInfo.email}" maxlength="255" required>
            </li>
        </ul>
    <br>
    <p>　<button type="submit">수정하기</button></p>
    <br><br><br>
</div>

<jsp:include page="../layouts/footer.jsp"/>
</body>
</html>
