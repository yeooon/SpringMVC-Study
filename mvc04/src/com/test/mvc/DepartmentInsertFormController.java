package com.test.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class DepartmentInsertFormController implements Controller
{
	private IDepartmentDAO ddao;
	
	public void setDdao(IDepartmentDAO ddao)
	{
		this.ddao = ddao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		ModelAndView mav = new ModelAndView();
		
		try
		{
			mav.setViewName("/WEB-INF/view/DepartmentInsertForm.jsp");
			
		} catch (Exception e)
		{
			// TODO: handle exception
			System.out.println(e.toString());
		}

		return mav;
	}
	
}
