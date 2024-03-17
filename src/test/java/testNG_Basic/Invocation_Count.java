package testNG_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invocation_Count {
	
	@Test(invocationCount = 3)
public void Invocating()
{
	//Launch Chrome
			WebDriver driver = new ChromeDriver();
			
	//Load URL
			driver.get("https://letcode.in/edit");
			
			String Get_Text = driver.findElement(By.id("getMe")).getAttribute("value");
			System.out.println(Get_Text);
			
			driver.quit();
}

}
