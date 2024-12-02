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
    
<style>

	.container {
	         padding: 30px 0;
     }
     .title-button {
         background-color: #ffb3a5;
         border: none;
         border-radius: 50px;
         padding: 15px 30px;
         font-size: 24px;
         color: white;
         font-weight: bold;
         margin-bottom: 20px;
         display: inline-block;
     }
     .search-bar {
         margin: 20px 0;
         position: relative;
         display: inline-block;
     }
     .search-bar input[type="text"] {
         padding: 10px;
         width: 300px;
         border-radius: 30px;
         border: 1px solid #ddd;
         padding-right: 40px;
     }
     .search-bar button {
         position: absolute;
         right: 5px;
         top: 5px;
         background: none;
         border: none;
         font-size: 18px;
         color: #888;
     }
	.options {
	    display: flex;
	    justify-content: space-between;
	    align-items: center;
	    font-size: 18px;
	    margin: 20px 0;
	    color: #666;
	    padding-right: 20px;
	}
	
	.sort-options {
	    display: flex;
	    gap: 15px; /* 최신순과 인기순 사이 간격 */
	}
	
	.sort-options a {
	    color: #666;
	    text-decoration: none;
	    font-weight: bold;
	}
	
	.sort-options a:hover {
	    color: #ffb3a5; /* 호버 시 강조 색상 */
	}
     .gallery {
         display: grid;
         grid-template-columns: repeat(3, 1fr);
         gap: 20px;
         padding: 0 20px;
     }
     .gallery-item {
         background-color: #ffe08a;
         padding: 10px;
         border-radius: 10px;
         box-shadow: 0px 2px 8px rgba(0, 0, 0, 0.1);
         text-align: center;
     }
     .gallery-item img {
         width: 100%;
         border-radius: 10px;
     }
     .gallery-item h3 {
         font-size: 16px;
         margin: 10px 0 5px;
     }
     .gallery-item .info {
         font-size: 14px;
         color: #888;
     }
     .gallery-item .icons {
         margin-top: 5px;
         font-size: 14px;
         color: #f5a623;
     }
     
</style>
    
</head>
<body>


<jsp:include page="../layouts/header.jsp"/>

<div class="container">

    <img src="../resources/images/knitting.png" alt="대바늘" width="250" height="100">
   
</div>

<div class="search-bar">
        <input type="text" placeholder="검색어를 입력하세요">
        <button>&#128269;</button>
    </div>

	<div class="options">
	    <a href="write" class="share-option"><img src="../resources/images/pencil.png" width="20"> 나의 도안 공유하기</a>
	    <div class="sort-options">
	        <a href="?sort=latest">최신순</a>
	        <a href="?sort=popular">인기순</a>
	    </div>
	</div>

	<div>
	<c:forEach var="knitting" items="${knittingList}">
	    <div>
	    	<img src="/upload/knitting/${knitting.knitUuid}_${knitting.knitFilename}">
	        <h3>${knitting.knitTitle}</h3>
	        <div class="info">작성자: ${knitting.userId}</div>
	        <div class="icons">난이도: ${knitting.knitRate}</div>
	    </div>
	</c:forEach>
	</div>
	    
<jsp:include page="../layouts/footer.jsp"/>
</body>
</html>