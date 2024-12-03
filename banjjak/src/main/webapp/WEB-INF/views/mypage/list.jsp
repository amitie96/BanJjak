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
            margin-top: 20px;
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
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        .box {
            width: 300px;
            height: 200px;
            border: 2px solid #FFFF99;
            background-color: #FFFFE0;
            padding: 20px;
            text-align: center;
            box-sizing: border-box;
            border-radius: 20px;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            margin: 5px;
        }

        .mypage li {
            margin-bottom: 15px;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .mypage a {
            text-decoration: none;
            color: #4CAF50;
            font-weight: bold;
            font-size: 18px;
        }

        .mypage a:hover {
            text-decoration: underline;
        }

        .pagination {
            margin-top: 20px;
            display: flex;
            justify-content: center;
            gap: 20px;
        }

        .pagination a {
            padding: 5px 10px;
            background-color: #4CAF50;
            color: white;
            border-radius: 5px;
            text-decoration: none;
        }

        .pagination a:hover {
            background-color: #45a049;
        }

        .pagination .disabled {
            background-color: #ddd;
            color: #aaa;
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
                    <li><a href="../knitting/detail.jsp?knitId=${knitting.knitId}">${knitting.knitTitle}</a></li>
                </c:forEach>
            </ul>
        </div>

        <!-- 코바늘 글 목록 -->
        <div>
            <label>코바늘</label>
            <ul class="box">
                <c:forEach var="crochet" items="${myCroList}">
                    <li><a href="Detail.jsp?crochetId=${crochet.croId}">${crochet.croTitle}</a></li>
                </c:forEach>
            </ul>
        </div>
    </div>

    <!-- 페이징 처리 -->
    <div class="pagination">
        <!-- 이전 페이지 -->
        <c:if test="${currentPage > 1}">
            <a href="?page=${currentPage - 1}">&lt; 이전</a>
        </c:if>

        <!-- 페이지 번호 -->
        <c:forEach var="pageNum" begin="1" end="${totalPages}">
            <a href="?page=${pageNum}" class="${pageNum == currentPage ? 'disabled' : ''}">${pageNum}</a>
        </c:forEach>

        <!-- 다음 페이지 -->
        <c:if test="${currentPage < totalPages}">
            <a href="?page=${currentPage + 1}">다음 &gt;</a>
        </c:if>
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
