package collections;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfWords_GoogleSearch {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Java",Keys.ENTER);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
		List<WebElement> Element_Java = driver.findElements(By.xpath("//*[contains(text(), \"Java\") or contains(text(), \"java\")]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println(Element_Java.size());

		driver.quit();
	}
}
