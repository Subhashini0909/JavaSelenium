package selenium;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Save_In_File 
{
	    public static void main(String[] args) {

	        // Create an instance of ChromeDriver
	        ChromeDriver driver = new ChromeDriver();

	        // Navigate to the webpage
	        driver.get("https://www.guru99.com/xpath-selenium.html");

	        // Retrieve the page title
	        String pageTitle = driver.getTitle();
//	        WebElement ele =  driver.findElement(By.xpath("//div[@class='entry-content single-content']"));
//			String Text = ele.getText();

	        // Create a new Word document
	        XWPFDocument document = new XWPFDocument();

	        // Create a paragraph in the document
	        XWPFParagraph paragraph = document.createParagraph();

	        // Add text to the paragraph
	        XWPFRun run = paragraph.createRun();
	        run.setText(pageTitle);

	        // Save the document to a file
	        try (FileOutputStream out = new FileOutputStream("output.docx")) {
	            document.write(out);
	            System.out.println("Word document saved successfully.");
	        } catch (IOException e) {
	            System.err.println("Error saving Word document: " + e.getMessage());
	        }

	        // Close the browser
	        driver.quit();
	    }
	}

