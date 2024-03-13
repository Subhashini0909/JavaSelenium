package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		
//NOTE : FRAME is one of the example of Method Overloading
	//Using Index
		driver.switchTo().frame(0);
		driver.findElement(By.name("fname")).sendKeys("Subha");
		driver.findElement(By.name("lname")).sendKeys("C");
		
	//Using WebElement
		WebElement frame = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.name("email")).sendKeys("c.subhashini09@gmail.com");
		
	//Using ID Or Name
		/*driver.switchTo().frame("has-background-white");
		driver.findElement(By.name("email")).sendKeys("c.subhashini09@gmail.com"); */
		
//TO SWITCH TO PARENT FRAME
		driver.switchTo().parentFrame();
		driver.findElement(By.name("lname")).sendKeys("Chithiraipandi");

		/*NOTE :
		 * parentFrame() will take you to one frame back
		 */
		
//TO SWITCH TO DEFAULT CONTENT
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Watch tutorial")).click();
		
		/*NOTE : 
		 * defaultContent() will take to the Main Frame
		 */

	}

}
