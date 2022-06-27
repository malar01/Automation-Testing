package pack1;

import org.testng.annotations.Test;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class DownloadHandling {
	WebDriver driver;
  @Test
  public void download() throws IOException {
	  WebElement downloadButton = driver.findElement(By.id("messenger-download"));
		 String sourceLocation = downloadButton.getAttribute("href");
		 System.out.println(sourceLocation);
		 String wget_command = "cmd /c C:\\Users\\Roop\\Downloads\\wget.exe -P E:\\Download --no-check-certificate " + sourceLocation;
		 Runtime.getRuntime().exec(wget_command);

  }
  @BeforeTest
  public void beforeTest() {
  
  System.setProperty("webdriver.edge.driver", "C:\\Users\\Roop\\Desktop\\Testing\\EdgeDriver\\msedgedriver.exe");
	driver=new EdgeDriver();
	driver.get("https://demo.guru99.com/test/yahoo.html");
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
  }
}