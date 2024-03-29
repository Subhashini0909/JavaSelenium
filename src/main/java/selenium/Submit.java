package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/signin");
		driver.findElement(By.name("email")).sendKeys(null); //IllegalArgumentException
		driver.findElement(By.name("password")).sendKeys("Subha@0909");
		driver.findElement(By.xpath("//button[text() ='LOGIN']")).submit();
		driver.quit();

	}

}
