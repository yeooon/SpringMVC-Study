package com.test.mvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class DepartmentListController implements Controller
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

		ArrayList<Department> departmentList = new ArrayList<Department>();
		
		try
		{
			departmentList = ddao.list();
			
			mav.addObject("departmentList", departmentList);
			
			mav.setViewName("/WEB-INF/view/DepartmentList.jsp");
			
			
		} catch (Exception e)
		{
			// TODO: handle exception
			System.out.println(e.toString());
		}
		
		return mav;
	}
	
}
