package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserLogin {
	
	WebDriver driver=null;
	
	
	By Username = By.name("email");
	By Password = By.name("password");
	By LoginBtn =  By.xpath("//button[text()='LOGIN']");
	By ForgotPwd = By.xpath("//button[text()='Forgotten password?']");
	
	/**
	 * 
	 * @param Username
	 */
	
	public void browserLaunch()
	{
		driver=new ChromeDriver();
	}
	
	public void LaunchURL()
	{
		driver.manage().window().maximize();
		driver.get("https://letcode.in/signin");
	}
	
	
	public void enterUsername(String User)
	{
		//driver.switchTo().frame(0);
		driver.findElement(Username).sendKeys(User);;
	}
	
	public void enterPassword(String Pwd)
	{
		driver.findElement(Password).sendKeys(Pwd);;
	}
	
	public void ForgettonPassword()
	{
		driver.findElement(ForgotPwd).click();;
	}
	
	public void ClickOnLoginbtn()
	{
		driver.findElement(LoginBtn).click();
	}
	
	/**
	 * @Description - If in case you are executing a feature, login is part of that feature, you
	 * don't have to perform E2E validation. You can perform it in the below way
	 */
	
	public void login(String User, String Passwrd)
	{
		enterUsername(User);
		enterPassword(Passwrd);
		ClickOnLoginbtn();
	}
	
	public void quit()
	{
		driver.quit();
	}

}
