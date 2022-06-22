/*============================================================
   RgnListController.java
   - 사용자 정의 컨트롤러 클래스
   - 지역 리스트 페이지 요청에 대한 액션 처리(일반직원 전용)
   - DAO 객체에 대한 의존성 주입(DI)을 위한 준비
     → 인터페이스 형태의 자료형을 속성으로 구성
     → setter 메소드 구성
============================================================*/

package com.test.mvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

// ※ Spring 의 `Controller` 인터페이스를 구현하는 방법을 통해
//   사용자 정의 컨트롤러 클래스를 구현한다.

public class RgnListController implements Controller
{
	private IRegionDAO rdao;
	
	public void setRdao(IRegionDAO rdao)
	{
		this.rdao = rdao;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		// 액션 코드
		
		ModelAndView mav = new ModelAndView();
		
		// 세션 처리에 따른 추가 구성-----------------------------------------------------------------
		
		// 로그인 여부만 확인 → 관리자인지 확인할 필요 없음.
		
		HttpSession session = request.getSession();
		
		if (session.getAttribute("name")==null)		//-- 로그인을 하지 못한 상황
		{
			mav.setViewName("redirect:loginform.action");
			return mav;
		}
		// -----------------------------------------------------------------세션 처리에 따른 추가 구성
		
		ArrayList<Region> regionList = new ArrayList<Region>();
		
		try
		{
			regionList = rdao.list();
			
			mav.addObject("regionList", regionList);
			
			mav.setViewName("/WEB-INF/view/RngList.jsp");
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}	
		
		return mav;
		
	}
	
}