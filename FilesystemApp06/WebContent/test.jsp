<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	request.setCharacterEncoding("UTF-8");
	String cp = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/main.css">
</head>
<body>

<div>
	<h1>파일업로드 - 단일파일 업로드</h1>
</div>

<div>
	<!-- enctype="multipart/form-data" : 파일을 물리적으로 업로드하기 위한 필수 속성 -->
	<!-- 파일을 물리적으로 업로드하기 위한 전송 요청 방식 -->
	<form action="test_ok.jsp" method="post" enctype="multipart/form-data">
	작성자 : <input type="text" name="userName"/>
	
	<!-- 파일 업로드 대화창 구성 -->
	<!-- 『input type="file"』 -->
	제목 : <input type="text" name="subject"/>
	파일 : <input type="file" name="uploadFile"/>
	<button type="submit">전송</button>
	</form>
</div>

</body>
</html>