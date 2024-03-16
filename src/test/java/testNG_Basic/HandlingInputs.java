package testNG_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingInputs {

	@Test
	public  void Inputs() 
	{
//Launch Chrome
		WebDriver driver = new ChromeDriver();
		
//Load URL
		driver.get("https://letcode.in/edit");

//Send Value to an input box
		driver.findElement(By.id("fullName")).sendKeys("Subhashini C");
		
//Append the text and press TAB key
		driver.findElement(By.xpath("//input[@class='input' and @id='join']")).sendKeys(" and kind" , Keys.TAB);
		
//Clear Text from an input box
		driver.findElement(By.id("clearMe")).clear();
		
//Print the value from the text box
		String Get_Text = driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println(Get_Text);
		
//Is enabled or disabled
		boolean Text_Enabled = driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println(Text_Enabled);
		
//Quit
		driver.quit();
		
	}

}
