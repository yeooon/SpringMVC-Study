/*====================
 MemberDTO.java
 - 사용자 정의 자료형 클래스
====================*/

package com.test.mvc;

public class MemberDTO
{
	private int mid;
	private String name, tel;
	
	// getter / setter 구성
	public int getMid()
	{
		return mid;
	}
	public void setMid(int mid)
	{
		this.mid = mid;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getTel()
	{
		return tel;
	}
	public void setTel(String tel)
	{
		this.tel = tel;
	}

}
