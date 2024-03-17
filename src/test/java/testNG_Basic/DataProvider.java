package testNG_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {
	
	@org.testng.annotations.DataProvider(name="login")
	public String[][] getdata()
	{
		String data[][]=new String[2][2];
		
		//Data 1
		data[0][0] = "worthyweapon@gmail.com";
		data[0][1] = "Subha@0909";
		
		//Data 2
		data[1][0] = "c.subhashini09@gmail.com";
		data[1][1] = "Subha@0909";
		
		return data;
	}
	
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
	
			driver.quit();

}
}