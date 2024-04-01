package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://letcode.in/windows");
		driver.findElement(By.id("home")).click();
		Set<String> handle =  driver.getWindowHandles();
				//getWindowHandles 
		
		List<String> SetToList = new ArrayList<String>(handle);
		driver.switchTo().window(SetToList.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(SetToList.get(0)).close();
		
		Set<String> handle1 =  driver.getWindowHandles();
		SetToList.clear();
		SetToList.addAll(handle1);
		driver.switchTo().window(SetToList.get(0));
		System.out.println(driver.getCurrentUrl());
		//driver.quit();

	}

}
