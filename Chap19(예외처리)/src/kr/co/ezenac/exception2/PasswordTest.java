package kr.co.ezenac.exception2;

public class PasswordTest
{
	private String password;
	
	
	
	public void setPassword(String password) throws PassWordException
	{
		if(password == null)
			throw new PassWordException("비밀번호는 null일 수 없습니다.");
		else if(password.length() <5)
			throw new PassWordException("비밀번호는 5글자를 넘을 수 없습니다.");
		this.password = password;
	}



	public static void main(String[] args)
	{
		PasswordTest test = new PasswordTest();
		String passWord = null;
		
		try
		{
			passWord = "ezen";
			test.setPassword(passWord);
		} catch (PassWordException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try
		{
			passWord = "ezen";
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
