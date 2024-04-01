package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling1 {

	public static void main(String[] args) {
		
		String URL = "https://letcode.in/windows";
		ChromeDriver driver =  new ChromeDriver();
		driver.get(URL);
//Click on the home button
		driver.findElement(By.id("home")).click();
//Goto the newly opened tab
		Set<String> Window_Handle = driver.getWindowHandles();
		List<String> SetToList = new ArrayList<String>(Window_Handle);
		driver.switchTo().window(SetToList.get(1));
		String ChildURL = driver.getCurrentUrl();
		System.out.println("Newly Opened Tab : " + ChildURL);
//Print the title of the page
		String Child_Title = driver.getTitle();
		System.out.println("Newly Opened Tab Title : " + Child_Title);
//Close the parent window
		driver.switchTo().window(SetToList.get(0)).close();
//Close the child window
		driver.switchTo().window(SetToList.get(1)).close();
		
//Click on the Muiltiple windows button
		//driver.get(URL);
//		System.out.println("Navigated To : " + driver.getCurrentUrl());
//		driver.findElement(By.id("multi")).click();
//Print all the window title
//		Set alltabs = driver.getWindowHandles();
//		for(String tab : alltabs)
//		{
//			String title = driver.switchTo().window(tab).getTitle();
//			System.out.println(title);
//		}
//Close all the windows
		driver.quit();
	}

}
