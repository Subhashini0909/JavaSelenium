package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) 
	{
		System.setProperty("debdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); - Deprecated instead use the below one
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("accept")).click();
		
		driver.quit();

	}

}
