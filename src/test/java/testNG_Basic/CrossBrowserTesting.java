package testNG_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	WebDriver driver;
	@Parameters({"Email1", "Pass1", "Browser"})
	@Test
	public void para(String Email, String Pass, String Browsers)
	{
		
		switch (Browsers) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
			
		case "Edge":
			driver = new EdgeDriver();
			break;

		default:
			System.err.println("Browser is not defined");
			break;
		}
		
			driver.manage().window().maximize();
			driver.get("https://letcode.in/");
			
			driver.findElement(By.linkText("Log in")).click();
		
			driver.findElement(By.name("email")).sendKeys(Email);
			
			driver.findElement(By.name("password")).sendKeys(Pass);
			
			driver.findElement(By.xpath("//button[@class='button is-primary' and text()='LOGIN']")).click();
	
			driver.findElement(By.linkText("Sign out")).click();
			
			driver.quit();
	}

}
