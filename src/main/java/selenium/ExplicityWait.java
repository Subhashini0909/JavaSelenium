package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWait {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://letcode.in/waits");
//		
//		WebElement alert_loc = driver.findElement(By.id("accept"));
//		alert_loc.click();
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//alertIsPresent		
		//wait.until(ExpectedConditions.alertIsPresent()).accept();
//		Alert waiting = wait.until(ExpectedConditions.alertIsPresent());
//			//waiting.accept();
//			driver.switchTo().alert().accept();
//			
//		
//		driver.navigate().to("https://letcode.in/signin");
//		driver.findElement(By.name("email")).sendKeys("worthyweapon@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("Subha@0909");
//		driver.findElement(By.xpath("//button[@class='button is-primary' and text()='LOGIN']")).click();

//visibilityOf and invisibilityOf
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		WebElement toast = driver.findElement(By.xpath("//div[@role='alertdialog']"));
//		wait.until(ExpectedConditions.visibilityOf(toast));
//		System.out.println(toast.getText());
//		wait.until(ExpectedConditions.invisibilityOf(toast));
//		
//		driver.findElement(By.partialLinkText("Sign out")).click();
//		
//		System.out.println("Clicked on sign out");
		
		
		
		driver.navigate().to("https://www.flipkart.com/");
		
		String Title_FK = driver.getTitle();
		System.out.println(Title_FK);
		WebElement Furniture = driver.findElement(By.xpath("//span[text() = 'Home & Furniture']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(Furniture);
		System.out.println(Furniture.getText());
		WebElement Home = driver.findElement(By.xpath("//a[@class='_1BJVlg' and text()='Home Furnishings']"));
		builder.moveToElement(Home);
		
		driver.findElement(By.xpath("//a[@class='_3490ry' and text()= 'Mattresses']")).click();
		String Title_Home = driver.getTitle();
		System.out.println(Title_Home);
		
		//
		driver.quit();
//

	}

}
