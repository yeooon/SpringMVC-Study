<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
   request.setCharacterEncoding("UTF-8");
   String cp = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

<title>직거래 상품 페이지.jsp</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
<link rel="stylesheet" href="<%=cp %>/css/bootstrap.css">

<script type="text/javascript" src="http://code.jquery.com/jquery.min.js"></script>
<script type="text/javascript" src="/js/bootstrap.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<style>
   .map_wrap {position:relative;width:100%;height:500px;}
    .title {font-weight:bold;display:block; font-size: 10px;}
    .hAddr {position:absolute;left:10px;top:10px; font-size: 10px; border-radius: 2px;background:#fff;background:rgba(255,255,255,0.8);z-index:1;padding:5px;}
    #centerAddr {display:block;margin-top:2px;font-weight: normal;}
    .bAddr {padding:5px;text-overflow: ellipsis;overflow: hidden;white-space: nowrap; font-size: 3px;}
    
    #map img
     {

    	max-width: none;

    	height: auto;

    	border: 0

	}
</style> 
<style type="text/css">
p
{
	font-size: 9pt;
}
/* 내용 div */
.content
{
	padding: 4%;
}
/* 내용 안에 들어가는 p */
.content_text
{
	font-size: 15pt; 
	font-weight: bold; 
	line-height: 50%;
}

/* 유저 사진 */
.user_image
{
	width: 100px;
	height: 100px;
}
th,td
{
	border: 1px solid #444444;
}

d-block
{
	width: 100%; 
	height: 100%;
	object-fit: cover;
}

 .carousel-inner > .carousel-item > img 
 {
      top: 0;
      left: 0;
      min-width: 100%;
      max-width: 100%;
      min-height: 380px;
      max-height: 380px;
      object-fit: cover;
  } 

</style>



<script type="text/javascript">

function searchAddr()
{
  
    var pd_id = document.getElementById("pd_id").value;
    var hope_sdate = document.getElementById("hope_sdate").value;
    var hope_edate = document.getElementById("hope_edate").value;
    var hope_stime = document.getElementById("hope_stime").value;
    var hope_etime = document.getElementById("hope_etime").value;
    alert(hope_stime.charAt(0));
    if (hope_stime.charAt(0) < 10)
	{
		hope_stime = "0"+hope_stime;
		alert(hope_stime);
	}
    //alert(hope_stime);
    //alert(hope_etime);
    var url = "direct_place.action?pd_id=" + pd_id + "&hope_sdate=" + hope_sdate
    		+ "&hope_edate=" + hope_edate
    		+ "&hope_stime=" + hope_stime
    		+ "&hope_etime=" + hope_etime;
    
    window.open(url, "구매제안", "top=100px, left=100px, height=900px, width=519px, resizable=no");
  
    
}
function CountDownTimer(dt, id)
{
    var end = new Date(dt);
    var _second = 1000;
    var _minute = _second * 60;
    var _hour = _minute * 60;
    var _day = _hour * 24;
    var timer;
    function showRemaining()
    {
        var now = new Date();
        var distance = end - now;
        if (distance < 0)
        {
            clearInterval(timer);
            document.getElementById(id).innerHTML = '타임딜 종료됨';
            return;
        }
        var days = Math.floor(distance / _day);
        var hours = Math.floor((distance % _day) / _hour);
        var minutes = Math.floor((distance % _hour) / _minute);
        var seconds = Math.floor((distance % _minute) / _second);
        document.getElementById(id).innerHTML = days + '일 ';
        document.getElementById(id).innerHTML += hours + '시간 ';
        document.getElementById(id).innerHTML += minutes + '분 ';
        document.getElementById(id).innerHTML += seconds + '초';
    }
    timer = setInterval(showRemaining, 1000);
}

	window.onload = function()
	{
		
		var remain_date = document.getElementById("remain_date").value;
		//alert(remain_date);
		CountDownTimer(remain_date, 'demo');		
	};

function select_suggest(idx)
{
	//alert(idx.value);
	var idxValue = idx.value;
	var nick = "nick"+idxValue;
	//alert(nick);
	var suggest_info = "suggest_info"+idxValue;	
	
	var u_nickname = document.getElementById(nick).innerText;
	var suggest_infoList = document.getElementById(suggest_info).innerText;
	//alert(u_nickname);
	//alert(suggest_infoList);
	var pd_Id = pd_id.value;
	var sel = "sel"+idxValue;
	var suggest_code = document.getElementById(sel).value;
	/* var pd_id = document.getElementById(pd_id).value; */
	//alert(pd_id.value);
	var result = confirm("● " + u_nickname+" 님의 구매제안 정보 ●\n"
			             + suggest_infoList
			             + "\n정말 채택하시겠습니까??(★취소 불가)");
	
	
	if (result)
	{
		location.href = "select.action?suggest_code=" + suggest_code + "&pd_id=" + pd_Id;
	}
	
}

</script>


</head>
<body>

<%
	String u_id = (String)session.getAttribute("u_id");
	
	if(u_id != null)
	{	
%>
		<div class="header">
			<c:import url="/WEB-INF/view/user/main/comfit_header_user.jsp"></c:import>
		</div>
<%	}
	else
	{
%>
	<div>
   		<c:import url="/WEB-INF/view/user/main/comfit_header_nolog.jsp"></c:import>
	</div>
<%	} %>	
<%
	int check_id = (int)session.getAttribute("check_id");
%>

<!-- 판매자 / 구매자 분기 -->
<%
	// 판매자인 경우
	if(check_id == 1)
	{
%>
<div>
	<c:forEach var="mgrs" items="${mgrs }">
	<input type="hidden" id="lat" value="${mgrs.lat }" />
	<input type="hidden" id="lon" value="${mgrs.lon }" />
	</c:forEach>
</div>

<div class="container">
	<div style="padding-top: 5%;">
	<c:forEach var="drPd"  items="${drPdList }">
	
			<p class="fs-2" style="text-align: center; font-weight: bold;">[${drPd.category_name}] ${drPd.pd_title }</p>
		
		<div class="content">
		<div class="col-md-6" style="float: left; width: 560px; height: 420px; padding-top: 5%; margin-right: 3%;" >	
			<div id="carouselExampleIndicators" class="carousel slide carousel-fade" data-bs-touch="false" data-bs-ride="true">
			  <div class="carousel-indicators">
			    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
			    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
			    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
			    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="3" aria-label="Slide 4"></button>
			    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="4" aria-label="Slide 5"></button>
			  </div>
			  <div class="carousel-inner">
			    <div class="carousel-item active">
			    	<img src="images/${drPd.pd_photo}" class="d-block w-100 rounded" alt="...">
			    </div>
			  </div><!-- close.img -->
			  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
			    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
			    <span class="visually-hidden">Previous</span>
			  </button>
			  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
			    <span class="carousel-control-next-icon" aria-hidden="true"></span>
			    <span class="visually-hidden">Next</span>
			  </button>
			</div>
		</div>
		
		<input type="text" id="pd_id" value="${drPd.pd_id }" hidden="hidden"/>
		<table class="col-md-5">
			<tr>
				<td colspan="2">
				<p>거래방식</p>
				<!-- 속성에 따라 직거래/배송 표기 -->
				<p class="content_text" >직거래</p></td>
				
			</tr>
			<tr>
				<td colspan="2"><p>희망가격</p>
				<p class="content_text" style="color: blue;">${drPd.price} 원</p></td>
			</tr>
			<tr>
				<td>
				<p>희망 날짜</p>
				<p class="content_text" style="font-size: 12pt;">${drPd.pd_hope_sdate} ~ ${drPd.pd_hope_edate} </p>
				</td>
				<td><p>희망 시간대</p>
					<p class="content_text" style="font-size: 12pt;">${drPd.pd_hope_stime } ~ ${drPd.pd_hope_etime}</p>
				</td>
			</tr>
			<tr>
				<td colspan="2"><p>희망 장소</p>
					<p class="content_text" style="color: blue;">${drPd.pd_hope_place}</p>
				</td>
			</tr>
			<tr>
			<c:choose>
					<c:when test="${sel_Check !=0 }">
				<td colspan="2" style="border-bottom: 2px solid gray; color: red;"><p>거래 유효 시간</p>
					</c:when>
					<c:otherwise>
					<td colspan="2" style="border-bottom: 2px solid gray;"><p>거래 유효 시간</p>
				</c:otherwise>
				</c:choose>
				<!-- 경매 종료시간 적용/경매 종료시 경매종료라고 표기 -->
				<!-- <td colspan="2" style="border-bottom: 2px solid gray;"><p>경매 종료</p> -->
				<input type="hidden" id="remain_date" value="종료일 : ${drPd.remain_date }" >
				<c:choose>
					<c:when test="${sel_Check !=0 }">
						<p class="fs-2" style="font-weight: bold;">[<span class="fs-2" style="color: #ffd700;" id="dems">거래가 종료되었습니다.</span>]</p>	
					</c:when>
					<c:otherwise>
						<p class="fs-2" style="font-weight: bold;">[<span class="fs-2" style="color: #ffd700;" id="demo"></span>]</p>
					</c:otherwise>
				</c:choose>
				
				<!-- 종료 시 최종가 표기  -->
				<!-- <p class="content_text" style="color: blue;">최종 가격 : 143,000원</p> -->

				</td>
			</tr>
			<tr>
				<td style="padding-top: 10px;">
					<p>제조사/물품명</p>
				</td>
				<th style="padding-top: 10px;">
				
				
					<!-- 제조사/물품명 표기 -->
					<p style="font-weight: bold;">${drPd.maker_name}(${drPd.maker_name2 }) / ${drPd.pd_name }</p>
				</th>
			</tr>
			<tr>
				<td>
					<p>Comfit 추천가격</p>
				</td>
				<th>
					<!-- 상품에 따른 추천가 표기 -->
					<p style="color: blue;">${drPd.cf_price}</p>

				</th>
			</tr>
			
			<tr>
				<td colspan="2">

				
				<!-- 상태에 따라 버튼 변경 -->
				<!-- 판매자)입찰자 없을 때 :수정하기/삭제하기-->
				<!-- 판매자)입찰자 있을 때 :즉시낙찰/삭제하기 -->
				<!-- <button type="button" class="btn btn-warning" style="width: 48%;">즉시낙찰</button> -->
				<c:choose>
					<c:when test="${end_day < 0 }">
						<button type="button" class="btn btn-danger" style="width: 96%;" disabled="disabled">채택된 제안 없이 종료된 거래입니다.</button>
					</c:when>
					<c:otherwise>
						<c:choose>
							<c:when test="${sel_Check != 0 }">
								<button type="button" class="btn btn-danger" style="width: 96%;" disabled="disabled">거래가 종료되었습니다.</button>
							</c:when>
								<c:otherwise>
								<c:choose>
									<c:when test="${sl_check == 0 }">
										<button type="button" class="btn btn-primary" style="width: 48%;">수정하기</button>
										<button type="button" class="btn btn-secondary" style="width: 48%;">삭제하기</button>
									</c:when>
									<c:otherwise>
										<button type="button" class="btn btn-secondary" style="width: 48%;" disabled="disabled">수정하기</button>
										<button type="button" class="btn btn-secondary" style="width: 48%;" disabled="disabled">삭제하기</button>								
									</c:otherwise>
								</c:choose>
								</c:otherwise>
							</c:choose>
						</c:otherwise>
				</c:choose>
			</td>
			</tr>
		</table>
		</div>
		<input type="hidden" id="hope_sdate" value="${drPd.pd_hope_sdate }"/>
		<input type="hidden" id="hope_edate" value="${drPd.pd_hope_edate }"/>
		<input type="hidden" id="hope_stime" value="${drPd.pd_hope_stime}"/>
		<input type="hidden" id="hope_etime" value="${drPd.pd_hope_etime }"/>
		
		<div>
			<div class="col-md-6" style="width:100%; display: inline-block; float:left;">
				<table style="margin-left:5%; width:90%;">
					<tr class="table-secondary">
						<th style="height:25px; width: 100%; text-align: center;">
							<p style="font-size: 18pt;">상품 상세정보</p>
						</th>
					</tr>
					
					<!-- 공간분리용 tr -->
					<tr style="height: 10px;">
					</tr>
					
					<tr class="table-secondary">
						<td style="padding:5%;">
						<p>상품 상세정보<br><br>
						1. 제조사 A/S 가능여부 : ${drPd.pd_as_name } / AS 기간 :
						<c:choose>
							<c:when test="${drPd.pd_as_remain eq null}">
								※ 제조사 A/S 문의는 해당 제조사에 직접 문의하시기 바랍니다.
							</c:when>
							<c:otherwise>
								${drPd.pd_as_remain } 까지 가능<br><br>	
							</c:otherwise>
						</c:choose>
							2. 특이사항 : ${drPd.comments }
						
						</p>
						</td>
					</tr>
				</table>
			</div>
					<!-- 구매자) 판매자 정보 -->
			<div class="seller_info col-md-5" style="display: inline-block; padding-left: 3%; height: 270px;">
			
			<div class="card" style="width: 100%; padding:3%;">
				<div>
					<div class="user_image" style="float: left;">
						<img alt="" src="images/${drPd.profile }"
						style="object-fit:cover; height: 100%; width: 100%;">
					</div>
					<div style="padding-left: 25%;">
						<p class="fs-2" style="margin-top: 5%; font-weight: bold;">${drPd.u_nickname } 
						<span class="fs-6" style="color: green;">Level : ${userLevel }</span>
						</p>
					</div>
				</div>
				    
				  <div class="card-body" style="height: 85px;">
				    <h5 class="card-title"></h5>
				    <div style="text-align: right;">
				    	<p class="card-text" style="font-weight: bold;">누적 판매 수 : ${sellCount }회</p>
				    	<!-- <a href="user_detail_sell.jsp" style="text-decoration: none;">상세보기</a> -->
				    </div>
				  </div>
				</div>
       				
				<!-- 판매자 정보 아래 버튼  -->
				<!-- 
				<div style="text-align: center; margin-top: 1%;">
					<button class="btn btn-primary" style="width: 25%; margin-right: 15%;" onclick="location.href='/WEB-INF/view/user/main/POSTobject.jsp'">목록으로</button>
					<button class="btn btn-primary" style="width: 25%;">찜하기</button>
				</div>
				 -->
			</div>
		</div>
		
		</c:forEach>
		<!-- 제안정보가 출력될 폼 -->
		<div class="content_bid" style="margin-top: 5%; margin-left: 5%; margin-right:9%;">
		<p class="fs-3" style="padding-left: 4%; font-weight: bold;">현재 제안 정보</p>
			<c:forEach var="suggest" items="${suggestList }" varStatus="status" >
			<!-- 입찰 폼 한개 -->
			
			<div class="shadow p-3 mb-5 bg-body rounded">
			<table style="width: 100%;">
			<tr>
				<td style="width: 15%; padding-left: 3%;">
					<div class="user_image">
						<img alt="" src="images/${suggest.profile }"
						style="object-fit:cover; height: 100%; width: 100%;">
					</div>
				</td>
				<th style="padding-left: 2%;">
					<p class="fs-4" id="nick${status.count }">
					${suggest.u_nickname }
					</p>
					<input type="hidden" id="suggestCode${status.count }" value="${status.count }"/>
				</th>
				<td>
					<p style="padding-left:10%;" id="suggest_info${status.count }">가격 : ${suggest.price } 원<br>
					날짜 : ${suggest.suggest_time }<br>
					장소 : ${suggest.suggest_place } ${suggest.place_detail } </p>
					
				</td>
				<td style="text-align: right; margin-left: 20%;">
					<p id="suggest_date">${suggest.suggest_date }</p>
					<%
					String suggest_code = (String)request.getAttribute("suggest_code");
					int sel_Check = (Integer)request.getAttribute("sel_Check");
					// 채택에 포함되어있다면
					if(sel_Check!=0)
					{
					%>
						<c:choose>
							<c:when test="${suggest.suggest_code eq suggest_code }">
							<button type="button" id="sel${status.count }" disabled="disabled"
							 class="btn btn-success" value="${suggest.suggest_code }">채택</button>	
							</c:when>
							<c:otherwise>
								<button type="button" id="sel${status.count }" disabled="disabled"
								 class="btn btn-danger" value="${suggest.suggest_code }">미채택</button>		
							</c:otherwise>
						</c:choose>
					<%
					}
					else
					{	
					%>
						<button type="button" id="sel${status.count }" class="btn btn-primary" value="${suggest.suggest_code }"
						onclick="select_suggest(suggestCode${status.count })">채택하기</button>
					<%
					}
					%>
				</td>
			</tr>
			</table>
			</div>
			</c:forEach>
		</div>
	</div>
</div>
</body>
</html><!-- 판매자 출력 페이지 -->

<%
	}
	else	// 구매자인경우
	{		
%>
<div>
	<c:forEach var="mgrs" items="${mgrs }">
	<input type="hidden" id="lat" value="${mgrs.lat }" />
	<input type="hidden" id="lon" value="${mgrs.lon }" />
	</c:forEach>
</div>

<div class="container">
	<div style="padding-top: 5%;">
	<c:forEach var="drPd"  items="${drPdList }">
	
			<p class="fs-2" style="text-align: center; font-weight: bold;">[${drPd.category_name}] ${drPd.pd_title }</p>
		
		<div class="content">
		<div class="col-md-6" style="float: left; width: 560px; height: 420px; padding-top: 5%; margin-right: 3%;" >	
			<div id="carouselExampleIndicators" class="carousel slide carousel-fade" data-bs-touch="false" data-bs-ride="true">
			  <div class="carousel-indicators">
			    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
			    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
			    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
			    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="3" aria-label="Slide 4"></button>
			    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="4" aria-label="Slide 5"></button>
			  </div>
			  <div class="carousel-inner">
			    <div class="carousel-item active">
			    	<img src="images/${drPd.pd_photo}" class="d-block w-100 rounded" alt="...">
			    </div>
			    <div class="carousel-item">
			      <img src="https://cdn.pixabay.com/photo/2016/03/26/13/09/cup-of-coffee-1280537__340.jpg" class="d-block w-100 rounded" alt="...">
			    </div>
			  </div>
			  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
			    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
			    <span class="visually-hidden">Previous</span>
			  </button>
			  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
			    <span class="carousel-control-next-icon" aria-hidden="true"></span>
			    <span class="visually-hidden">Next</span>
			  </button>
			</div>
		</div>
		
		<input type="text" id="pd_id" value="${drPd.pd_id }" hidden="hidden"/>
		<table class="col-md-5">
			<tr>
				<td colspan="2">
				<p>거래방식</p>
				<!-- 속성에 따라 직거래/배송 표기 -->
				<p class="content_text" >직거래</p></td>
				
			</tr>
			<tr>
				<td colspan="2"><p>희망가격</p>
				<p class="content_text" style="color: blue;">${drPd.price} 원</p></td>
			</tr>
			<tr>
				<td>
				<p>희망 날짜</p>
				<p class="content_text" style="font-size: 12pt;">${drPd.pd_hope_sdate} ~ ${drPd.pd_hope_edate} </p>
				</td>
				<td><p>희망 시간대</p>
					<p class="content_text" style="font-size: 12pt;">${drPd.pd_hope_stime } ~ ${drPd.pd_hope_etime}</p>
				</td>
			</tr>
			<tr>
				<td colspan="2"><p>희망 장소</p>
					<p class="content_text" style="color: blue;">${drPd.pd_hope_place}</p>
				</td>
			</tr>
			<tr>
				<c:choose>
					<c:when test="${sel_Check2 != 0 }">
						<td colspan="2" style="border-bottom: 2px solid gray; color: red;"><p>거래 유효 시간</p>
					</c:when>
					<c:otherwise>
						<td colspan="2" style="border-bottom: 2px solid gray;"><p>거래 유효 시간</p>
					</c:otherwise>
				</c:choose>				
				<!-- 경매 종료시간 적용/경매 종료시 경매종료라고 표기 -->
				<!-- <td colspan="2" style="border-bottom: 2px solid gray;"><p>경매 종료</p> -->
				<%-- <input type="text" id="remain_date" value="종료일 : ${drPd.remain_date }" > --%>
					
					<c:choose>
						<c:when test="${sel_Check2 != 0 }">
						<p class="fs-2" style="font-weight: bold;">[<span class="fs-2" style="color: #ffd700;" id="dems">거래종료</span>]</p>
						</c:when>
						<c:otherwise>
						<p class="fs-2" style="font-weight: bold;">[<span class="fs-2" style="color: #ffd700;" id="demo"></span>]</p>
						</c:otherwise>
					</c:choose>
						
				<!-- 종료 시 최종가 표기  -->
				<!-- <p class="content_text" style="color: blue;">최종 가격 : 143,000원</p> -->

				</td>
			</tr>
			<tr>
				<td style="padding-top: 10px;">
					<p>제조사/물품명</p>
				</td>
				<th style="padding-top: 10px;">
				
					<input type="hidden" id="remain_date" value="${drPd.remain_date }" >
					<!-- 제조사/물품명 표기 -->
					<p style="font-weight: bold;">${drPd.maker_name}(${drPd.maker_name2 }) / ${drPd.pd_name }</p>
				</th>
			</tr>
			<tr>
				<td>
					<p>Comfit 추천가격</p>
				</td>
				<th>
					<!-- 상품에 따른 추천가 표기 -->
					<p style="color: blue;">${drPd.cf_price}</p>

				</th>
			</tr>
			
			<tr>
				<td colspan="2">
			
				<%
					int end_day = (Integer)request.getAttribute("end_day");
					if(end_day<0)
					{
				%>
						<button type="button" class="btn btn-danger" style="width: 96%;" disabled="disabled">채택된 제안 없이 종료된 거래입니다.</button>
				<%
					}
					else
					{
				%>
					<c:choose>
					<c:when test="${sel_Check != 0 }">
						<button type="button" class="btn btn-danger" style="width: 96%;" disabled="disabled">거래가 종료되었습니다.</button>
					</c:when>
					<c:otherwise>
						<c:choose>
							<c:when test="${us_Check != 0 }">
							<c:choose>
								<c:when test="${sl_check == 0 }">
										<button type="button" class="btn btn-primary" style="width: 48%;" id="suggest"
				                		onclick="searchAddr()">구매제안</button>
											<button type="button" class="btn btn-secondary" style="width: 48%;">신고하기</button>
							    </c:when>
							    <c:otherwise>
							    		<button type="button" class="btn btn-primary" style="width: 48%;" id="suggest"
				                			onclick="searchAddr()">구매제안</button>
											<button type="button" class="btn btn-secondary" style="width: 48%;" disabled="disabled">신고하기</button>
							    </c:otherwise>											
							</c:choose>
							</c:when>
							<c:otherwise>
							<button type="button" class="btn btn-success" style="width: 96%;">구매제안완료</button>
							</c:otherwise>
						</c:choose>
					</c:otherwise>
					</c:choose>
				<%
					}
				%>
  			    

				</td>
			</tr>
		</table>
		</div>
		<input type="hidden" id="hope_sdate" value="${drPd.pd_hope_sdate }"/>
		<input type="hidden" id="hope_edate" value="${drPd.pd_hope_edate }"/>
		<input type="hidden" id="hope_stime" value="${drPd.pd_hope_stime}"/>
		<input type="hidden" id="hope_etime" value="${drPd.pd_hope_etime }"/>
		
		<div>
			<div class="col-md-6" style="width:100%; display: inline-block; float:left;">
				<table style="margin-left:5%; width:90%;">
					<tr class="table-secondary">
						<th style="height:25px; width: 100%; text-align: center;">
							<p style="font-size: 18pt;">상품 상세정보</p>
						</th>
					</tr>
					
					<!-- 공간분리용 tr -->
					<tr style="height: 10px;">
					</tr>
					
					<tr class="table-secondary">
						<td style="padding:5%;">
						<p>상품 상세정보<br><br>
						1. 제조사 A/S 가능여부 : ${drPd.pd_as_name } ${drPd.pd_as_remain } 까지 가능<br><br>
						2. 특이사항 : ${drPd.comments }
						</p>
						</td>
					</tr>
				</table>
			</div>
					<!-- 구매자) 판매자 정보 -->
			<div class="seller_info col-md-5" style="display: inline-block; padding-left: 3%; height: 270px;">
			
			<div class="card" style="width: 100%; padding:3%;">
				<div>
					<div class="user_image" style="float: left;">
						<img alt="" src="images/${drPd.profile }"
						style="object-fit:cover; height: 100%; width: 100%;">
					</div>
					<div style="padding-left: 25%;">
						<p class="fs-2" style="margin-top: 5%; font-weight: bold;">${drPd.u_nickname } 
						<span class="fs-6" style="color: green;">Level : ${userLevel }</span>
						</p>
					</div>
				</div>
				    
				  <div class="card-body" style="height: 85px;">
				    <h5 class="card-title"></h5>
				    <div style="text-align: right;">
				    	<p class="card-text" style="font-weight: bold;">누적 판매 수 : ${sellCount }회</p>
				    	<!-- <a href="user_detail_sell.jsp" style="text-decoration: none;">상세보기</a> -->
				    </div>
				  </div>
				</div>
       				
				<!-- 판매자 정보 아래 버튼  -->
				
				<!-- 	
					<div style="text-align: center; margin-top: 1%;">
					<button class="btn btn-primary" style="width: 25%; margin-right: 15%;" onclick="location.href='/WEB-INF/view/user/main/POSTobject.jsp'">목록으로</button>
					<button class="btn btn-primary" style="width: 25%;">찜하기</button>
				</div>
				 -->
			</div>
		</div>
		
		</c:forEach>
		<!-- 제안정보가 출력될 폼 -->
		<div class="content_bid" style="margin-top: 5%; margin-left: 5%; margin-right:9%;">
		<p class="fs-3" style="padding-left: 4%; font-weight: bold;">현재 제안 정보</p>
		
			<c:forEach var="suggest" items="${suggestList }" varStatus="status">
			<!-- 입찰 폼 한개 -->
			<div class="shadow p-3 mb-5 bg-body rounded">
			<table style="width: 100%;">
			<tr>
				<td style="width: 15%; padding-left: 3%;">
					<div class="user_image">
						<img alt="" src="images/${suggest.profile }"
						style="object-fit:cover; height: 100%; width: 100%;">
					</div>
				</td>
				<th style="padding-left: 2%;">
					<p class="fs-4">
					${suggest.u_nickname }
					</p>
				</th>
				<td>
					<p style="padding-left:10%;">가격 : ${suggest.price }원<br>
					날짜 : ${suggest.suggest_time }<br>
					장소 : ${suggest.suggest_place } ${suggest.place_detail } </p>
				</td>
				<td style="text-align: right; margin-left: 20%;">
					<p>${suggest.suggest_date }</p>
					<c:choose>
							<c:when test="${suggest.suggest_code eq suggest_code }">
							<button type="button" id="sel${status.count }" disabled="disabled"
							 class="btn btn-success" value="${suggest.suggest_code }">채택</button>	
							</c:when>
							<c:otherwise>
								<button type="button" id="sel${status.count }" disabled="disabled"
								 class="btn btn-danger" value="${suggest.suggest_code }">미채택</button>		
							</c:otherwise>
						</c:choose>
				</td>
						
				</td>
			</tr>
			</table>
			</div>
			</c:forEach>
		</div>

	<br />
	</div>
</div>
</body>
<%
	}
%>
</html>
				