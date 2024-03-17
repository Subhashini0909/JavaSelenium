package testNG_Basic;

import org.testng.annotations.Test;

public class DependsOnMethod{
	
		@Test(dependsOnMethods = "testNG_Basic.SetPriority.welcome") //To use dependency from other class
		public void login()
		{
			System.out.println("Already Registered? Login");
		}
		
		@Test(dependsOnMethods = "login")
		public void search_product()
		{
			System.out.println("Make your preferred search here");
		}
}

