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
        .category h3 {
            color: #f9a825;
            font-weight: bold;
            font-size: 1.2em;
        }
        .category-list {
            list-style-type: none;
            padding: 0;
        }
        .category-list li {
            margin-bottom: 5px;
        }
        .mypage ul {
            list-style-type: none;
            padding: 0;
            text-align: center;
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
            <h3>대바늘 &gt;</h3>
            <ul class="category-list">
                <c:forEach var="post" items="${postList}">
                    <c:if test="${post.category == '대바늘'}">
                        <li>${post.title}</li>
                    </c:if>
                </c:forEach>
            </ul>
        </div>
        <!-- 코바늘 글 목록 -->
        <div>
            <h3>코바늘 &gt;</h3>
            <ul class="category-list">
                <c:forEach var="post" items="${postList}">
                    <c:if test="${post.category == '코바늘'}">
                        <li>${post.title}</li>
                    </c:if>
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
