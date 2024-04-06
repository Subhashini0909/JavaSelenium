package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/xpath-selenium.html");
		
		WebElement ele =  driver.findElement(By.xpath("//div[@class='entry-content single-content']"));
		String Text = ele.getText();
		System.out.println(Text);
		
		driver.quit();

	}

}
