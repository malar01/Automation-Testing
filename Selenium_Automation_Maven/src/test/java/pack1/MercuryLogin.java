package pack1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;

public class MercuryLogin {
  WebDriver driver;
  @Test
  public void login() {
	  WebElement userName1=driver.findElement(By.xpath("//input[contains(@name,'userName')]"));
		userName1.sendKeys("Test");
		WebElement password1=driver.findElement(By.xpath("//input[contains(@name,'password')]"));
		password1.sendKeys("Test@1234");
		WebElement submit1=driver.findElement(By.xpath("//input[contains(@name,'submit')]"));
		submit1.click();
		}
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\Roop\\Desktop\\Testing\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();	
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
}
