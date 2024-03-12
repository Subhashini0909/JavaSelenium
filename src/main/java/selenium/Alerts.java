package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		
		driver.findElement(By.id("accept")).click();
		
//SIMPLE ALERT
		Alert Simple = driver.switchTo().alert();
		String Simple_Alert_Text = Simple.getText();
		System.out.println(Simple_Alert_Text);
		Simple.accept();
		
//CONFIRM ALERT - DISMISS
		driver.findElement(By.id("confirm")).click();
		Alert Confirm_dismiss = driver.switchTo().alert();
		Thread.sleep(3000);
		Confirm_dismiss.dismiss();
		
//CONFIRM ALERT - ACCEPT
		driver.findElement(By.id("confirm")).click();
		Alert confirm_accept = driver.switchTo().alert();
		confirm_accept.accept();
		
//PROMPT ALERT
		driver.findElement(By.id("prompt")).click();
		Alert PROMPT = driver.switchTo().alert();
		PROMPT.sendKeys("Subhashini");
		PROMPT.accept();
		
//PRINTING THE TEXT FROM PROMPT ALERT
		WebElement Prompt_message = driver.findElement(By.className("box"));
		String msg = Prompt_message.getText();
		System.out.println(msg);
		
		
		driver.quit();
	}
	
	

}
