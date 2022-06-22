package com.test.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class RegionUpdateController implements Controller
{
	private IRegionDAO rdao;
	
	public void setRdao(IRegionDAO rdao)
	{
		this.rdao = rdao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		ModelAndView mav = new ModelAndView();
		
		// 세션 처리과정 추가 ------------------------------------------------------
			HttpSession session = request.getSession();
			
			if (session.getAttribute("name")==null) //-- 로그인이 되어 있지 않은 상황
			{
				mav.setViewName("redirect:loginform.action");
				return mav;
			}
			else if(session.getAttribute("admin")==null) //-- 로그인은 되었지만 관리자가 아닌 상황 
			{
				mav.setViewName("redirect:logout.action");
				return mav;
				//-- 로그인은 되어 있지만 이 때 클라이언트는
				// 일반 직원으로 로그인 되어 있는 상황이므로
				// 기존의 로그인 내용을 없애고 로그아웃 액션 처리하여
				// 다시 관리자로 로그인할 수 있도록 처리
			}
		// ------------------------------------------------------ 세션 처리과정 추가		
		
		String regionId = request.getParameter("regionId");
		String regionName = request.getParameter("regionName");
		
		try
		{
			Region region = new Region();
			
			region.setRegionId(regionId);
			region.setRegionName(regionName);
			
			rdao.modify(region);
			
			mav.setViewName("redirect:regionlist.action");
			
		} catch (Exception e)
		{
			// TODO: handle exception
			System.out.println(e.toString());
		}
		
		return mav;
	}
	
}
