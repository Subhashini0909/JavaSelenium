package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) 
	{
		//Launching Chrome
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Launching Edge
		System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
		EdgeDriver driver1 = new EdgeDriver();

	}

}
