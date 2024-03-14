package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class DropDowns_Simple {

	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		
//SelectByVisibleText
		WebElement Fruits = driver.findElement(By.id("fruits"));
		Select Drop_Down = new Select(Fruits);
		Drop_Down.selectByVisibleText("Mango");
		
//SelectByValue
		WebElement Country = driver.findElement(By.id("country"));
		Select Drop_Down4 = new Select(Country);
		Drop_Down4.selectByValue("Brazil");
	//PRINT THe Selected item
		WebElement Selected = Drop_Down4.getFirstSelectedOption();
		System.out.println("Selected Country is : " + Selected.getText());
		
driver.quit();

	}

}
