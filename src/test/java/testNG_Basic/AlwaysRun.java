package testNG_Basic;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class AlwaysRun {

	@Test()
	public void signUp()
	{
		System.out.println("Not registered? SignUp");
		throw new NoSuchElementException();
	}
	
	@Test(dependsOnMethods = "testNG_Basic.AlwaysRun.signUp", alwaysRun = true)
	public void login()
	{
		System.out.println("Already Registered? Login");
	}
	
	@Test(description = "To search the products") //Description - To add description the script
	public void search()
	{
		System.out.println("Make your preferred search here");
	}
	
	@Test(priority =2)
	public void welcome()
	{
		System.out.println("Welcome to xxx");
	}
}
