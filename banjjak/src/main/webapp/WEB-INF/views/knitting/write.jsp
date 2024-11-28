<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>

<title>Knitting write</title>
	<link rel="stylesheet" href="/resources/css/styles.css">
	<link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&display=swap" rel="stylesheet">
<style>
    .input-block {
        width: 100%; /* 모든 입력란의 가로 길이를 100%로 설정 */
        padding: 15px;
        font-size: 16px;
        font-weight: normal;
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

    /* 글쓰기 버튼 아래 여백 추가 */
    .input-container button {
        margin-top: 20px;
        padding: 15px;
        font-size: 16px;
        font-weight: normal;
        background-color: #FFB3A5;
        border: none;
        border-radius: 50px;
        color: white;
    }

    /* 제목 입력란 크기 */
    .input-container.title input {
        width: 100%; /* 100%로 늘려서 다른 입력란 크기와 맞춤 */
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
</style>


</head>
<body>


<jsp:include page="../layouts/header.jsp"/>

<div>
    <h1>글쓰기</h1>
    <br>    
    <div>
    	<div>
    		<form method="post" action="write" enctype="multipart/form-data">
				<div>
				    <label for="knitTitle">제목</label>
				    <input type="text" id="knitTitle" name="knitTitle"class="input-block" placeholder="제목을 입력하세요" autofocus required>
				</div>
				
				<div>
				    <label for="knitRate">난이도</label>
				    <select id="knitRate" name="knitRate" class="input-block">
				        <option value="1">★</option>
				        <option value="2">★★</option>
				        <option value="3">★★★</option>
				    </select>
				</div>
    			
				<div>
					<label>첨부파일</label>
    				<input type="file" name="uploadFile">
    			</div>
    			
				<div>
					<label for="knitContent">내용</label>
					<textarea id="knitContent" name="knitContent"class="input-block" placeholder="내용을 입력하세요" rows="10"></textarea>
    			</div>

    			<div class="submit-button">
    				<button type="submit">글쓰기</button>
    			</div>
    		</form>
    	</div>
    </div>

<jsp:include page="../layouts/footer.jsp"/>
</body>
</html>