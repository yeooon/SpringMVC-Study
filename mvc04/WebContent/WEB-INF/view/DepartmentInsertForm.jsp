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
<title>EmployeeInsertForm.jsp</title>
<link rel="stylesheet" type="text/css" href="<%=cp %>/css/main.css">
<link rel="stylesheet" type="text/css" href="<%=cp%>/css/jquery-ui.css">

<script type="text/javascript" src="http://code.jquery.com/jquery.min.js"></script>
<script type="text/javascript" src="<%=cp %>/images"></script>
<script type="text/javascript" src="<%=cp %>/js/jquery-ui.js"></script>

<script type="text/javascript">
 	// $();
 	// jquery();
 	$(document).ready(function()
	{
		// Ajax는 필요가 없었다...
		// 지역 추가 버튼이 클릭되었을 때 수행해야 할 코드 처리
		$("#submitBtn").click(function()
		{
			// 테스트
			//alert("테스트");
			//alert($("minBasicPay").val());
			//alert($("minBasicPay").text());
			
			// 데이터 검사(누락된 입력값이 있는지 없는지에 대한 여부 확인)
			if( $("#name").val()=="")
			{
				$("#err").html("필수 입력 항목이 누락되었습니다.");
				$("#err").css("display", "inline");
				return;				//-- submit 액션 처리 중단
			}		
			
			// 폼 submit 액션 처리 수행
			$("#departmentForm").submit();
		})	
	});
 
 	
 	
</script>

</head>
<body>

<!------------------------------
 #20. EmployeeInsertForm.jsp 
 - 직원 데이터 입력 페이지 
 ------------------------------->

<div>
	<!-- 메뉴 영역 -->
	<div>
		<c:import url="EmployeeMenu.jsp"></c:import>
	</div>
	
	<!-- 콘텐츠 영역 -->
	<div id="content">
		<h1>[ 부서 관리 ]</h1>
		<hr />
		
		<form action="departmentinsert.action" method="post" id="departmentForm">
			<table>
				<tr>
					<th>부서</th>
					<td>
						<input type="text" id="name" name="name" placeholder="부서"/>
					</td>
				</tr>			
				
				<tr>
					<td colspan="2" align="center">
						<br /><br />
						<button type="button" class="btn" id="submitBtn"
						style="width: 40%; height: 50px">부서 추가</button>
						<button type="button" class="btn" id="listBtn"
						style="width: 40%; height: 50px"
						onclick="location.href='departmentlist.action'">부서 리스트</button>
						<br /><br />
						
						<span id="err" style="color: red; font-weight: bold; display: none;"></span>
					</td>
				</tr>						
			</table>
		</form>
	</div>
	
	<!-- 회사 소개 및 어플리케이션 소개 영역 -->
	<div id="footer">
	</div>
	
</div>

	

</body>
</html>