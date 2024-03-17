package testNG_Basic;

import org.testng.annotations.Test;

public class ASCII_Order {
	
	@Test
	public void signUp()
	{
		System.out.println("Not registered? SignUp");
	}
	
	@Test
	public void login()
	{
		System.out.println("Already Registered? Login");
	}
	
	@Test
	public void search()
	{
		System.out.println("Make your preferred search here");
	}

}
