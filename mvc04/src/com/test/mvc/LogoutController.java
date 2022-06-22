package com.test.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LogoutController implements Controller
{
	
	// 주요 속성 구성
	private IEmployeeDAO dao;
	// EmployeeDAO 객체가 주입될 예정이다...
	
	//setter 구성
	public void setDao(IEmployeeDAO dao)
	{
		this.dao = dao;
	}
		
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		ModelAndView mav = new ModelAndView();
		
		// 세선에 구성된 속성값을 제거
		// 세션은... 뭐지?
		HttpSession session = request.getSession();
		
		session.removeAttribute("name");
		session.removeAttribute("admin");
		
		// 로그아웃 뷰 페이지(→ 안전하게 로그아웃 되었습니다. 로그인 페이지로 돌아가기) 없이
		// 바로 로그인 페이지를 다시 요청할 수 있도록 처리.
        mav.setViewName("redirect:loginform.action");

		return mav;
	}
	
}
