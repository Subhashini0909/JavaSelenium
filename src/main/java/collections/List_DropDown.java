package collections;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_DropDown {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement country = driver.findElement(By.name("country"));
		Select drop = new Select(country);
		drop.selectByVisibleText("ANGOLA");
		
//To Print the list of Options
		List<WebElement> countries = drop.getOptions();
		for(WebElement Drop : countries)
		{
			System.out.println(Drop.getText());
		}
		
		driver.quit();
	}

}
