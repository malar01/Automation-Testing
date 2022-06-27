package pack1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class UploadFile {
	WebDriver driver;
  @Test
  public void fileUpload() {
	  WebElement upload_file=driver.findElement(By.name("uploadfile_0"));
	  upload_file.sendKeys("F:\\Automation-Testing\\Selenium-codes.txt");
	  
	  WebElement chk=driver.findElement(By.id("terms"));
	  chk.click();
	  
	  WebElement submit=driver.findElement(By.id("submitbutton"));
	  submit.click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.edge.driver","C:\\Users\\Roop\\Desktop\\Testing\\EdgeDriver\\msedgedriver.exe");
	  driver=new EdgeDriver();
	  driver.get("http://demo.guru99.com/test/upload/");
	  driver.manage().window().maximize();
  }

}
