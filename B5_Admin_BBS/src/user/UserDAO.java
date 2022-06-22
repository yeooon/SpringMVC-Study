package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO
{
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO()
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
	 
	public int login(String userId, String userPassword)
	{
		String sql = "SELECT USERPASSWORD FROM TEST_USER WHERE USERID = ?";
		try
		{
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();
			if (rs.next())
			{
				if (rs.getString(1).equals(userPassword)) //setString(1, userId);
				{
					return 1; // 로그인 성공
				}
				else
					return 0; // 비밀번호 불일치
			}
			return -1; // 아이디가 없음
		} 
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return -2; // 데이터베이스 오류
	}
	
	public int join(User user)
	{
		String sql = "INSERT INTO TEST_USER(USERID,USERPASSWORD,USERNAME,USERGENDER,USEREMAIL)"
				+ " VALUES(?, ?, ?, ?, ?)";
		
		try
		{
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUserId());
			pstmt.setString(2, user.getUserPassword());
			pstmt.setString(3, user.getUserName());
			pstmt.setString(4, user.getUserGender());
			pstmt.setString(5, user.getUserEmail());
			return pstmt.executeUpdate();
		} 
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		return -1;	// 데이터베이스 오류
	}
}
