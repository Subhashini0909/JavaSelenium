package selenium;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElements {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		String URL = "https://www.facebook.com/";
		driver.get(URL);
		WebElement active = driver.switchTo().activeElement();
		active.sendKeys("aaa.gmail.com", Keys.TAB, "pass", Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.quit();
		
	}
}
/*
 * NOTE : RemoteWebElement class implements WebElement interface
 */
