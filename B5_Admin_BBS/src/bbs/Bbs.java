package bbs;

// getter, setter 를 자바 bean이라고 부르나봐...

public class Bbs
{
	private int bbsID;
	private String bbsTitle;
	private String userId;
	private String bbsDate;
	private String bbsContent;
	private int bbsAvailable;
	
	public int getBbsID()
	{
		return bbsID;
	}
	public void setBbsID(int bbsID)
	{
		this.bbsID = bbsID;
	}
	public String getBbsTitle()
	{
		return bbsTitle;
	}
	public void setBbsTitle(String bbsTitle)
	{
		this.bbsTitle = bbsTitle;
	}
	public String getUserId()
	{
		return userId;
	}
	public void setUserId(String userId)
	{
		this.userId = userId;
	}
	public String getBbsDate()
	{
		return bbsDate;
	}
	public void setBbsDate(String bbsDate)
	{
		this.bbsDate = bbsDate;
	}
	public String getBbsContent()
	{
		return bbsContent;
	}
	public void setBbsContent(String bbsContent)
	{
		this.bbsContent = bbsContent;
	}
	public int getBbsAvailable()
	{
		return bbsAvailable;
	}
	public void setBbsAvailable(int bbsAvailable)
	{
		this.bbsAvailable = bbsAvailable;
	}
}
