<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	request.setCharacterEncoding("UTF-8");
	String cp = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=cp %>/css/main.css">

<script type="text/javascript" src="http://code.jquery.com/jquery.min.js"></script>
<script type="text/javascript">

	$(function()
	{
		// 테스트
		//alert("확인");
		
		// 수정 버튼 클릭 시 액션
		$(".updateBtn").click(function()
		{
			// 테스트
			alert("수정 버튼 클릭");
			
			$(location).attr("href","departmentupdateform.action?departmentId="+$(this).val())
			
		});
		
		// 삭제 버튼 클릭 시 액션 처리
		$(".deleteBtn").click(function()
		{
			// 테스트
			//alert("삭제 버튼 클릭");
			
			if (confirm("현재 선택한 데이터를 정말 삭제하시겠습니까?"))
			{
				$(location).attr("href","departmentdelete.action?departmentId=" + $(this).val())
			}
		});		
	});

</script>

</head>
<body>
<!------------------------ 
	RegionList.jsp
	- 지역 리스트 출력 페이지
	- 관리자가 접근하는 직원 데이터 출력 페이지
	(일반 직원이 접근하는 지역 데이터 출력 페이지는 regionList.jsp 로 구성 예정)
-------------------------->

<div>
	<!-- 메뉴 영역 -->
	<div>
		<c:import url="EmployeeMenu.jsp"></c:import>
	</div>
	
	<!-- 콘텐츠 영역 -->
	<div id="content">
	
		<h1>[ 부서 관리 (관리자 전용) ]</h1>
		<hr />
		
		<div>
			<form action="">
				<input type="button" value="부서 추가" class="btn"
				onclick="location.href='departmentinsertform.action'"/>
				<!-- onclick="location.href='EmployeeInsertForm.jsp'"/> -->
			</form>
		</div>
		<br><br>
		
		<!-- -------------------------------------------------
		EMPLOYEEID NAME SSN BIRTHDAY LUNAR LUNARNAME TELEPHONE      
		DEPARTMENTID DEPARTMENTNAME POSITIONID POSITIONNAME   
		REGIONID REGIONNAME BASICPAY EXTRAPAY PAY GRADE          
		------------------------------------------------- -->
		<table id="customers" class="table">
			<tr>
				<!-- 항목 15EA -->
				<th>번호</th>
				<th>이름</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
			
			<!-- 
				<tr>
				<td>1</th>
				<td>김상기</th>
				<td>620527</th>
				<td>1962-05-27</th>
				<td>양력</th>
				<td>010-9876-5432</th>
				<td>서울</th>
				<td>개발부</th>
				<td>사원</th>
				<td>1,500,000</th>
				<td>1,500,000</th>
				<td>3,000,000</th>
				<td>관리자</th>
				<td><button type="button" class="btn">수정</button></th>
				<td><button type="button" class="btn">삭제</button></th>
			</tr>
			<tr>
				<td>2</th>
				<td>이상기</th>
				<td>620527</th>
				<td>1962-05-27</th>
				<td>양력</th>
				<td>010-9876-5432</th>
				<td>서울</th>
				<td>개발부</th>
				<td>사원</th>
				<td>1,500,000</th>
				<td>1,500,000</th>
				<td>3,000,000</th>
				<td>관리자</th>
				<td><button type="button" class="btn">수정</button></th>
				<td><button type="button" class="btn">삭제</button></th>
			</tr>
			<tr>
				<td>3</th>
				<td>신상기</th>
				<td>620527</th>
				<td>1962-05-27</th>
				<td>양력</th>
				<td>010-9876-5432</th>
				<td>서울</th>
				<td>개발부</th>
				<td>사원</th>
				<td>1,500,000</th>
				<td>1,500,000</th>
				<td>3,000,000</th>
				<td>관리자</th>
				<td><button type="button" class="btn">수정</button></th>
				<td><button type="button" class="btn">삭제</button></th>
			</tr> 
			-->
			
			<c:forEach var="department" items="${departmentList }">
			<tr>
				<td>${department.departmentId }</td>
				<td>${department.departmentName }</td>
										
				<td><button type="button" class="btn updateBtn"
				value="${department.departmentId }">수정</button></td>
				<td><button type="button" class="btn deleteBtn"
				value="${department.departmentId }">삭제</button></td>
			</tr> 				
			</c:forEach>
			
			
		</table>
		
	</div>
	
	<!-- 회사 소개 및 어플리케이션 소개 영역 -->
	<div id="footer">
	</div>
	
</div>

</body>
</html>