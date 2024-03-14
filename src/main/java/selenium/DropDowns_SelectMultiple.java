package selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class DropDowns_SelectMultiple {

	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		
//Select Multiple Text
			WebElement Hero = driver.findElement(By.id("superheros"));
			Select Drop_Down3 = new Select(Hero);
			
	//To Check if the dropdown is multiple
			boolean ismul = Drop_Down3.isMultiple();
			System.out.println("Is multiple? " + ismul);
	//Select Multiple Values
			Drop_Down3.selectByIndex(0);
			Drop_Down3.selectByIndex(2);
			
			List<WebElement> Heros = Drop_Down3.getAllSelectedOptions();
			System.out.println("Selected items : " + Heros);
				
//SCREENSHOTS
			File src = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./Screenshots/img1.png");
			FileHandler.copy(src, dest);
				
				
				driver.quit();

	}

}
