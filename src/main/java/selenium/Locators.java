package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) 
	{
	//Launch Browser
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	//Load URL
		driver.get("https://letcode.in/");
		
//LINK TEXT
		driver.findElement(By.linkText("Log in")).click();
		
	//Print current URL
		String Current_Login_URL = driver.getCurrentUrl();
		System.out.println("Login URL : " + Current_Login_URL);

//NAME
		driver.findElement(By.name("email")).sendKeys("worthyweapon@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Subha@0909");
		
//XPATH
		driver.findElement(By.xpath("//button[@class='button is-primary' and text()='LOGIN']")).click();
		
//		String Login_Button = "//button[@class='button is-primary' and text()='LOGIN']";
//		driver.findElement(By.xpath(Login_Button));
	}

}
