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

</head>
<body>
<!------------------------ 
	EmpList.jsp
	-직원 리스트 출력 페이지
	- 입력 / 수정 / 삭제 기능 없음
-------------------------->

<div>
	<!-- 메뉴 영역 -->
	<div>
		<c:import url="EmployeeMenu.jsp"></c:import>
	</div>
	
	<!-- 콘텐츠 영역 -->
	<div id="content">
	
		<h1>[ 직원 목록 (일반직원 전용) ]</h1>
		<hr />
		
		<!-- 직원 추가 div 제거 -->
		<br><br>
		
		<!-- -------------------------------------------------
		EMPLOYEEID NAME     
		DEPARTMENTNAME POSITIONNAME   
		REGIONNAME GRADE          
		------------------------------------------------- -->
		<table id="customers" class="table">
			<tr>
				<!-- 항목 15EA -->
				<th>번호</th>
				<th>이름</th>
				<th>지역</th>
				<th>부서</th>
				<th>직위</th>
				<th>등급</th>
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
			
			<c:forEach var="employee" items="${employeeList }">
			<tr>
				<td>${employee.employeeid }</td>
				<td>${employee.name }</td>
				<td>${employee.regionName }</td>
				<td>${employee.departmentName }</td>
				<td>${employee.positionName }</td>
				
				<%-- <td>${employee.basicPay }</td> --%>				
				<td>${employee.grade==0 ? "관리자" : "일반사원" }</td>
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