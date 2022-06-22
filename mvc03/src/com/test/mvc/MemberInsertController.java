/*===========================
 MemberInsertController.java
 - 사용자 정의 컨트롤러 클래스
 - 회원 데이터 추가 액션 처리 클래스
 - DAO 객체에 대한 의존성 주입
 준비 → 인터페이스 형태의 속성 구성
 	  → setter 메소드 추가
============================*/

package com.test.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

// ※ 『implements Controller』 혹은 『extends AbstractController』
//-- 서블릿에서 HttpServlet 을 상속받은 서블릿 객체 역할

// ※ Spring 의 『Controller』 인터페이스를 구현하는 방법을 퉁해
// 사용자 정의 컨트롤러 클래스를 구성한다.

public class MemberInsertController implements Controller
{
	// private MemberDAO dao 면 MemberDAO 밖에 못 들어온다.
	// 그래서 IMemberDAO가 들어와야 한다.
	
	private IMemberDAO dao;
	
	// setter 메소드 구성
	public void setDao(IMemberDAO dao)
	{
		this.dao = dao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		// 액션 코드
		ModelAndView mav = new ModelAndView();
		
		// 캐릭터 인코딩 설정
		request.setCharacterEncoding("UTF-8");
		
		// 이전 페이지로부터 넘어온 데이터 수신 
		String name = request.getParameter("name");
		String tel = request.getParameter("telephone");
		
		try
		{
			MemberDTO member = new MemberDTO();
			
			member.setName(name);
			member.setTel(tel);
			
			dao.add(member);
			
		} catch (Exception e)
		{
			// TODO: handle exception
			System.out.println(e.toString());
		}
		
		// sendRedirect() → MemberList.do
		//mav.setViewName("/WEB-INF/view/MemberList.jsp"); // (X)
		
		mav.setViewName("redirect:memberlist.do");

		return mav;
	}
	
}