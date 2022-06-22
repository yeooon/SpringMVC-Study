package com.test.mvc;

import java.sql.SQLException;
import java.util.ArrayList;

// 규격... 기성품의 규격같은 존재...

public interface IMemberDAO
{
	//회원정보 추가 메소드
	public int add(MemberDTO member) throws SQLException;
	
	//전체 인원 수 확인 메소드 선언
	public int count() throws SQLException;
	
	//회원 리스트 확인 메소드 선언
	public ArrayList<MemberDTO> list() throws SQLException;

}
