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
<style type="text/css">
*{line-height: 150%;}
#customer td {text-align: center;}
#submitBtn
{
	height: 150;
	width: 250px;
	font-size: 18px;
	font-weight: bold;
	font-family: 맑은 고딕;
}
#err
{
	color: red;
	font-size: small;
	display: none;
}
</style>
<script type="text/javascript" src="http://code.jquery.com/jquery.min.js"></script>
<script type="text/javascript">
/* 제이쿼리 */
	$(document).ready(function()
	{
		$("#submitBtn").click(function()
		{
			// 테스트
			//alert("확인");
			$("#err").css("display","none");	// 이상이 없을 때에...
			
			if($("#name").val()=="" || $("#telephone").val()=="")
			{
				$("#err").css("display","inline");
				return
			}
			
			$("#memberForm").submit();
		});
	});
</script>
</head>
<body>

<div>
	<h1>회원 관리</h1>
	<hr />
</div>

<div>
	<form action="memberinsert.do" method="post" id="memberForm">
		이름<input type="text" name="name" id="name" class="control" required="required"/>
		<hr />
		전화<input type="text" name="telephone" id="telephone" class="control" required="required"/>
		<hr />
		<button type="button" id="submitBtn">회원 추가</button>
		<span id="err">모든 항목을 입력해야 합니다.</span>
	</form>
	
	<br />
	
	<p>전체 인원 수 : ${count }</p>
	
	<table id="customers" style="width: 500px;">
		<tr>
			<th>번호</th><th>이름</th><th>전화번호</th>
		</tr>
		
		<c:forEach var="member" items="${memberList}">
		<tr>
			<td>${member.mid }</td>
			<td>${member.name }</td>
			<td>${member.tel }</td>
		</tr>
		</c:forEach>
	</table>
	
</div>

</body>
</html>