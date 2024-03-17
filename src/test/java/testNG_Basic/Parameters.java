package testNG_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parameters {
	
	@org.testng.annotations.Parameters({"Email1", "Pass1"})
	@Test
	public void para(String Email, String Pass)
	{
		//System.out.println("Email : " + Email + '\n' + "Password : " + Pass);
		
			ChromeDriver driver = new ChromeDriver();
		
			driver.get("https://letcode.in/");
			
			driver.findElement(By.linkText("Log in")).click();
		
			driver.findElement(By.name("email")).sendKeys(Email);
			
			driver.findElement(By.name("password")).sendKeys(Pass);
			
			driver.findElement(By.xpath("//button[@class='button is-primary' and text()='LOGIN']")).click();
	
			driver.quit();
	}

}
