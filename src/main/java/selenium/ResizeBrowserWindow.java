package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeBrowserWindow {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Dimension resize = new Dimension(600, 900);
		driver.manage().window().setSize(resize);
	}

}
