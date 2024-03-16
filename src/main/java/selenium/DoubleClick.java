package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class DoubleClick {

	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
//DOUBLE CLICK
		Actions builder = new Actions(driver);
		WebElement Double_Click = driver.findElement(By.xpath("//button[text()= 'Double-Click Me To See Alert']"));
		builder.doubleClick(Double_Click).perform();
		
//ALERT
		Alert simple_alert = driver.switchTo().alert();
		simple_alert.accept();
		
//SCREENSHOT
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/img2.png");
		FileHandler.copy(src, dest);

	}

}
