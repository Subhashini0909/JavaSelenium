package pomTestFIles;

import org.testng.annotations.Test;

import pageObjectModel.UserLogin;

public class LoginTest {
	
	@Test
	public void logintest()
	{
		UserLogin obj = new UserLogin();
		obj.browserLaunch();
		obj.LaunchURL();
		obj.enterUsername("c.subhashini@gmail.com");
		obj.enterPassword("Subha@0909");
		obj.ClickOnLoginbtn();
		obj.quit();
		
	}

}
