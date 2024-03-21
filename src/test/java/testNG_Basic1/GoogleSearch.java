package testNG_Basic1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearch {

	@Test
	public void main() throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("APjFqb")).sendKeys("Skoda", Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> Skoda =driver.findElements(By.xpath("//*[contains(text(), 'Škoda') or contains(text(), 'skoda') or contains(text(), 'Skoda') ]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("The word Skoda appears " +Skoda.size() + " times");
		driver.quit();
	}

}
