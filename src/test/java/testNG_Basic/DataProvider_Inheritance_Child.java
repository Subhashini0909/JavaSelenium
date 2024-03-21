package testNG_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider_Inheritance_Child extends DataProvider_Inheritance_Parent
{
	
	@Test(dataProvider = "login")
	public void Signin(String Email, String Pass)
	{
		//System.out.println("Email : " + Email + '\n' + "Password : " + Pass);
		
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
		
			driver.get("https://letcode.in/");
			
			driver.findElement(By.linkText("Log in")).click();
		
			driver.findElement(By.name("email")).sendKeys(Email);
			
			driver.findElement(By.name("password")).sendKeys(Pass);
			
			driver.findElement(By.xpath("//button[@class='button is-primary' and text()='LOGIN']")).click();
	
			//driver.findElement(By.xpath("//h1[text()=\" LetCode with Koushik\"]")).isDisplayed();
			
			driver.quit();

}
}