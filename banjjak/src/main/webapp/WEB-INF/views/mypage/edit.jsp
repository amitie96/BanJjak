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
<!--     <style>
    .input-block {
        width: 100%;
        padding: 15px;
        margin-bottom: 20px;
        box-sizing: border-box;
    }

    .input-container {
        margin-bottom: 20px;
        width: 100%;
        text-align: left;
    }

    .input-container label {
        display: block;
        margin-bottom: 5px;
        font-weight: normal;
        text-align: left;
    }

    .input-container input,
    .input-container select,
    .input-container textarea {
        width: 100%;
        padding: 15px;
        font-size: 16px;
        font-weight: normal;
        box-sizing: border-box;
    }

    .writing-block {
        margin-bottom: 20px;
    }

    .writing-block label {
        display: block;
        margin-bottom: 5px;
        font-weight: normal;
        text-align: left;
    }

    .writing-block textarea {
        width: 100%;
        height: 200px;
        padding: 15px;
        font-size: 16px;
        font-weight: normal;
        box-sizing: border-box;
        resize: none;
    }
    </style> -->
</head>
<body>


<jsp:include page="../layouts/header.jsp"/>

<div>
    <h1>수정하기</h1>
    <br>
    <form action="/knitting/edit" method="POST">
    <div class="input-container title">
        <label for="title">제목</label>
        <input type="text" id="title" class="input-block" placeholder="제목을 입력하세요" autofocus required >
    </div>

    <div class="input-container difficulty">
        <label for="difficulty">난이도</label>
        <select id="difficulty" class="input-block">
            <option value="1star">★</option>
            <option value="2star">★★</option>
            <option value="3star">★★★</option>
            <option value="4star">★★★★</option>
            <option value="5star">★★★★★</option>
        </select>
    </div>
    
    <div class="input-container attachments">
        <label for="file">첨부파일</label>
        <input type="file" id="file" class="input-block">
    </div>

    <div class="writing-block">
        <label for="content">내용</label>
        <textarea id="content" class="input-block" placeholder="내용을 입력하세요" rows="10"></textarea>
    </div>
    </form>

    <div class="submit-button">
        <button type="submit">글쓰기</button>
    </div>
</div>
       



<jsp:include page="../layouts/footer.jsp"/>
</body>
</html>