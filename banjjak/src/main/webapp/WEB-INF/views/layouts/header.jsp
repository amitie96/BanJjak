<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<header>
    <div class="logo">
        <a href="/main">
           <img src="/resources/images/main.png">
        </a>
    </div>
    <div class="link">
        <ul>
        <li>
            <c:choose>
                <c:when test="${not empty user.userId}">
                    <!-- 로그아웃 링크 -->
                    <a href="/logout">로그아웃</a>
                </c:when>
                <c:otherwise>
                    <!-- 로그인 링크 -->
                    <a href="/login">로그인</a>
                </c:otherwise>
            </c:choose>
        </li>
        <li>
            <a href="/user/join">회원가입</a>
        </li>
        <li>
            <a href="#">마이페이지</a>
        </li>

        </ul>
    </div>
</header>
