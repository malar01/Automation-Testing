package project1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScreenShotHandling {

	public static void main(String[] args) throws IOException {
		
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Roop\\Desktop\\Testing\\msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
			driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
			//driver.manage().window().maximize();
			
			//Taking Screen Shots
			
			
			 TakesScreenshot ts=(TakesScreenshot) driver; 
			 File source=ts.getScreenshotAs(OutputType.FILE); 
			 FileUtils.copyFile(source,new File("C:\\Users\\Roop\\Desktop\\Automation-Testing\\Screen Shots\\form.jpeg"));
			 
			
			//To scroll vertically and horizontally
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			
			 js.executeScript("window.scrollBy(0,250)");
			 js.executeScript("window.scrollBy(0,-250)");
			 
			//To scroll an element to our view
			 
			 WebElement get_total=driver.findElement(By.id("button-two"));
			 js.executeScript("arguments[0].scrollIntoView()",get_total); 
			 get_total.click();
			 
		}

	}
