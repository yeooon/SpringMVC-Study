package bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class bbsDAO
{
	private Connection conn;
	private ResultSet rs;
	
	public bbsDAO()
	{
		try
		{
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String pwd = "tiger";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,user,pwd);
		} 
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}
	
	// 현재 시간을 불러오는 함수
	/*
	public String getDate() 
	{
		String sql = "SELECT SYSDATE FROM DUAL";
		try
		{
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next())
			{
				return rs.getString(1);
			}
		} 
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		return ""; //-- 데이터베이스 오류
	}
	*/
	

	public int getNext() 
	{
		
		try {
			String sql = "SELECT bbsID FROM TEST_BBS ORDER BY bbsID DESC";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) 
			{
				return rs.getInt(1)+1;
			}
			return 1; //첫번째 게시물인 경우
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		return -1;	//데이터베이스 오류
	}

	/*
	//수업시간에 배운대로 코딩
	public int getNext(int num)
	{
		int result = 0;
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "";
		
		try
		{
			sql = "SELECT NVL(MIN(NUM), -1) NEXTNUM"
				+ " FROM TEST_BBS"
				+ " WHERE NUM>?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if (rs.next())
				result = rs.getInt("NEXTNUM");
			rs.close();
			pstmt.close();
			
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return result;	
	}
	*/
	
	// 게시글 작성
	/*
	public int write(Bbs bbs)
	{
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = "";
		
		try
		{
			// hitCount 는 기본값 『0』 또는 『default』 또는 『입력항목 생략』 가능
			// created 는 기본값 『sysdate』 또는 『default』 또는 『입력항목 생략』 가능
			sql = "INSERT INTO TEST_BBS(bbsID, bbsTitle, userID, bbsContent, bbsAvailable, bbsDate)"
					+ " VALUES(TEST_SEQ.NEXTVAL,?,?,?,?,SYSDATE)";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, getNext()); 	//-- 다음번에 쓰여야 할 게시글 번호
			pstmt.setString(1, bbs.getBbsTitle()); 
			pstmt.setString(2, bbs.getUserId()); // 이건 당연히... 그렇게 뜨겠죠?
			pstmt.setString(3, bbs.getBbsContent()); 
			pstmt.setInt(4, 1); 			//-- 처음엔 글이 보여진다
			
			result =  pstmt.executeUpdate();	
			
			pstmt.close();
		
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return result;
	}
	*/
	// 글 쓰는 메소드
	public int write(String bbsTitle, String userId, String bbsContent)
	{	
		
		try
		{
			PreparedStatement pstmt = null;
			String sql = "INSERT INTO TEST_BBS(bbsID, bbsTitle, userID, bbsContent, bbsAvailable, bbsDate)"
					+ " VALUES(?,?,?,?,?,SYSDATE)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, getNext()); 	//-- 다음번에 쓰여야 할 게시글 번호
			pstmt.setString(2, bbsTitle); 
			pstmt.setString(3, userId); 
			pstmt.setString(4, bbsContent); 
			pstmt.setInt(5, 1); 			//-- 처음엔 글이 보여진다
			
			return pstmt.executeUpdate();	
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}

		return -1;	//데이터베이스 오류	
	}
	
	
	// 쓴 글 목록 가져오는 메소드
	public ArrayList<Bbs> getList(int pageNumber)
	{

		ArrayList<Bbs> List = new ArrayList<Bbs>();
		String sql = "";
		
		try
		{
			sql += "SELECT bbsID, bbsTitle, userID, bbsDate, bbsContent, bbsAvailable";
			sql += " FROM TEST_BBS";
			sql += " WHERE bbsID<?";
			sql += " ORDER BY bbsID DESC";

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, getNext() - (pageNumber - 1) * 10);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next())
			{
				Bbs bbs = new Bbs();
				bbs.setBbsID(rs.getInt(1));
				bbs.setBbsTitle(rs.getString(2));
				bbs.setUserId(rs.getString(3));
				bbs.setBbsDate(rs.getString(4));
				bbs.setBbsContent(rs.getString(5));
				bbs.setBbsAvailable(rs.getInt(6));
				List.add(bbs);
			}
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return List;
	}
	
	// 페이징 처리
	// 특정 게시물의 다음 게시물 번호 얻어내는 메소드 정의
	// 다음 게시물이 존재하지 않을 경우 -1 반환
	public boolean nextPage(int pageNumber)
	{
		try
		{
			String sql = "SELECT * FROM TEST_BBS"
					+ " WHERE bbsID < ? AND bbsAvailable = 1";		
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, getNext() - (pageNumber - 1) * 10);
			rs = pstmt.executeQuery();
			
			if (rs.next())
			{
				return true;
			}
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return false;
	}
	
	//글 내용 한 개 소환하는 메소드
	public Bbs getBbs(int bbsID)
	{
		try
		{
			String sql = "SELECT * FROM TEST_BBS WHERE bbsID = ?";		
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bbsID);
			rs = pstmt.executeQuery();
			
			if (rs.next())
			{
				Bbs bbs = new Bbs();
				bbs.setBbsID(rs.getInt(1));
				bbs.setBbsTitle(rs.getString(2));
				bbs.setUserId(rs.getString(3));
				bbs.setBbsDate(rs.getString(4));
				bbs.setBbsContent(rs.getString(5));
				bbs.setBbsAvailable(rs.getInt(6));
				return bbs;
			}
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return null; //-- 만약 bbsID값이 존재하지 않을때(글이 없을 때)
	}
	
	public int update(int bbsID, String bbsTitle, String bbsContent)
	{
		try
		{
			String sql = "UPDATE TEST_BBS SET bbsTitle = ?"
					+ ", bbsContent = ? WHERE bbsID = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bbsTitle); 	//-- 다음번에 쓰여야 할 게시글 번호
			pstmt.setString(2, bbsContent); 
			pstmt.setInt(3, bbsID); 			//-- 처음엔 글이 보여진다
			
			return pstmt.executeUpdate();	
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}

		return -1;	//데이터베이스 오류	
	}

	
	public int delete(int bbsID)
	{
		try
		{
			String sql = "DELETE FROM TEST_BBS WHERE bbsID = ?"; // bbsAvailable 만으로 delete를 구현할 수 있다.
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bbsID); 	//-- 다음번에 쓰여야 할 게시글 번호
			
			return pstmt.executeUpdate();	
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}

		return -1;	//데이터베이스 오류	
	}
}
	
	/*
	public int write(String bbsTitle, String userId, String bbsContent)
	{	
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = "";
		
		try
		{
			sql = "INSERT INTO TEST_BBS(bbsID, bbsTitle, userID, bbsContent, bbsAvailable, bbsDate)"
					+ " VALUES(?,?,?,?,?,SYSDATE)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, getNext(num)); 	//-- 다음번에 쓰여야 할 게시글 번호
			pstmt.setString(2, bbsTitle); 
			pstmt.setString(3, userId); 
			pstmt.setString(4, bbsContent); 
			pstmt.setInt(5, 1); 			//-- 처음엔 글이 보여진다
			
			result =  pstmt.executeUpdate();	
			
			pstmt.close();
			rs.close();
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}

		return result;	
	}
	*/
	
