package testNG_Basic;

import java.util.NoSuchElementException;

import javax.management.RuntimeErrorException;

import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class Without_AlwaysRun {

	@Test()
	public void signUp()
	{
		System.out.println("Not registered? SignUp");
		throw new NoSuchElementException();
	}
	
	@Test(dependsOnMethods = "testNG_Basic.AlwaysRun.signUp")
	public void login()
	{
		System.out.println("Already Registered? Login");
	}
	
	@Test()
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
