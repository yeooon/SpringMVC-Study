package com.test.mvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class RegionListController implements Controller
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
		
		/*
		 * else if(session.getAttribute("admin")==null) { // ?? // 회원용 리스트를 만들지 않았기
		 * 때문에... // 회원인 경우에는... 로그인폼으로 보내버렸는데... 그게 아닌 경우에는?
		 * mav.setViewName("redirect:loginform.action"); return mav; } else {
		 * 
		 * }
		 */
		// ------------------------------------------------------ 세션 처리과정 추가		
		
		ArrayList<Region> regionList = new ArrayList<Region>();
		
		try
		{
			regionList = rdao.list();
			
			mav.addObject("regionList",regionList);
			
			mav.setViewName("/WEB-INF/view/RegionList.jsp");
			
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}

		return mav;
	}
	
}
