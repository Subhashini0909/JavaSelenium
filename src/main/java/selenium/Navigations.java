package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
//Get
		driver.get("https://letcode.in/");
		
//Navigate To
		driver.navigate().to("https://letcode.in/buttons");
		
	
//Navigate Back
		driver.navigate().back();
		
		String Navigated_URL = driver.getCurrentUrl();
		System.out.println("Navigated URL : " + Navigated_URL);
		
//Forward
		driver.navigate().forward();
		
//Refresh
		driver.navigate().refresh();
		driver.quit();
		
//USING NAVIGATION METHODS WITH OBJECT
		Navigations nav = driver.navigate();
		
	}

}
