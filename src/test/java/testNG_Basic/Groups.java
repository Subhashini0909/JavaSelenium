package testNG_Basic;

import org.testng.annotations.Test;

public class Groups {

	@Test(groups = {"smoke", "reg"})
	public void signUp()
	{
		System.out.println("Not registered? SignUp");
	}
	
	@Test(groups = {"smoke"})
	public void login()
	{
		System.out.println("Already Registered? Login");
	}
	
	@Test(groups = {"reg"})
	public void search()
	{
		System.out.println("Make your preferred search here");
	}
	
	@Test(groups = {"smoke", "reg"})
	public void welcome()
	{
		System.out.println("Welcome to xxx");
	}
}
