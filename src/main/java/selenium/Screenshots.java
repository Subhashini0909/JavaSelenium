package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {

	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		
//TO TAKE SCREENSHOT OF THE SCREEN
	//Capture a screenshot as a File
		File img_src = driver.getScreenshotAs(OutputType.FILE);
				//The OutputType.FILE parameter specifies that the screenshot should be returned as a File object.
		
	//Specify the destination file path and name
		File dest = new File("./Screenshots/img.png");
		
	//Copy the captured screenshot to the specified destination
		FileHandler.copy(img_src, dest);
		
//TO TAKE SCREENSHOT OF AN ELEMENT
		WebElement Home = driver.findElement(By.id("home"));
		File Img_Src1 = Home.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./Screenshots/Element.png");
		FileHandler.copy(Img_Src1, dest1);
	
//TO TAKE SCREENSHOT OF A SECTION
		WebElement Section = driver.findElement(By.xpath("//div[@class='card-content']//div[@class='content']"));
		File Img_Src2 = Section.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("./Screenshots/Section.png");
		FileHandler.copy(Img_Src2, dest2);
		
		driver.quit();

		//NOTE : CANNOT TAKE SCREENSHOTS IN ALERTS
	}

}
