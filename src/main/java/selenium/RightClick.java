package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

//RIGHT CLICK
		Actions builder = new Actions(driver);
		
		WebElement Right_Click = driver.findElement(By.xpath("//span[text()= \"right click me\"]"));
		builder.contextClick(Right_Click).perform();
		
		driver.findElement(By.xpath("//span[text()= \"Copy\"]")).click();
	
		Thread.sleep(3000);
//Alert
		Alert simple = driver.switchTo().alert();
		simple.accept();
		
	}

}
