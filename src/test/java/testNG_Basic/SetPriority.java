package testNG_Basic;

import org.testng.annotations.Test;

public class SetPriority 
{
	@Test(priority = 1)
	public void signUp()
	{
		System.out.println("Not registered? SignUp");
	}
	
	@Test(priority = 2)
	public void login()
	{
		System.out.println("Already Registered? Login");
	}
	
	@Test(priority = 3)
	public void search()
	{
		System.out.println("Make your preferred search here");
	}
	
	@Test
	public void welcome()
	{
		System.out.println("Welcome to xxx");
	}

}
