package selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		//===================================================//
		
		driver.switchTo().frame(0);
		
		WebElement Src = driver.findElement(By.id("draggable"));
		WebElement Target = driver.findElement(By.id("droppable"));
		
		Actions Drag_Drop = new Actions(driver);
		Drag_Drop.dragAndDrop(Src, Target).perform();
		
		
		//===================================================//
		
		driver.get("https://letcode.in/dropable");
		//driver.switchTo().frame(2);
		
		WebElement src1 = driver.findElement(By.xpath("//p[@id='text']"));
		WebElement Target1 = driver.findElement(By.id("droppable"));
		
		Actions Drag_Drop1 = new Actions(driver);
		Drag_Drop1.dragAndDrop(src1, Target1).perform();
		
		//===================================================//
		
		File img_src = driver.getScreenshotAs(OutputType.FILE);
		File imt_dest = new File("./Screenshots/img4.png");
		FileHandler.copy(img_src, imt_dest);
		
		driver.quit();

	}

}
