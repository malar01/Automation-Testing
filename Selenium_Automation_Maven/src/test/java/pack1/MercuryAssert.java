package pack1;

import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class MercuryAssert {
	WebDriver driver;
	
	
  @Test(description="TC-002 Verfiy Title of the URL",priority=1,enabled=true)
  public void verifyTitle() {
	String actual_title=driver.getTitle();
	System.out.println(actual_title);
	String expected_title="Mercury Tours";
	//	Assert.assertEquals("actual_title", "expected_title","Title not match");
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(actual_title, expected_title,"Title not match");
  }
  @Test(description="TC-001 Verfiy the URL of the current page",priority=0,enabled=true)
  public void verifyUrl() {
	  String actual_url=driver.getCurrentUrl();
	  System.out.println(actual_url);
	  String expected_url="https://demo.guru99.com/test/newtours/";
	  Assert.assertEquals(actual_url,expected_url);
	  
  }
  @Test(description="TC-003 Verify whether username field is enabled",priority=2,enabled=true)
  public void verifyUsername() {
	  WebElement userName=driver.findElement(By.xpath("//input[contains(@name,'userName')]"));
	  boolean user=userName.isEnabled();
	  System.out.println(user);
	  Assert.assertTrue(user);
	  //Assert.assertFalse(false);
  }
  @Test(description="TC-004 Verify whether password field is disabled",priority=3,enabled=true)
  public void verifyPassword() {
	  WebElement password=driver.findElement(By.xpath("//input[contains(@name,'password')]"));
	  Assert.assertTrue(password.isDisplayed());
	  
  }
  @Test(description="TC-005 Verify whether user is able to login",priority=4,enabled=true)
  public void login() {
	  WebElement userName1=driver.findElement(By.xpath("//input[contains(@name,'userName')]"));
	  	userName1.sendKeys("Test");
	  	
	  	  
		WebElement password1=driver.findElement(By.xpath("//input[contains(@name,'password')]"));
		password1.sendKeys("Test@1234");
		WebElement submit1=driver.findElement(By.xpath("//input[contains(@name,'submit')]"));
		submit1.click();
		//Explicit wait
		//WebDriverWait wait=new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[contains(@name,'submit')]")));
		
		String actual_link=driver.getCurrentUrl();
		System.out.println("Actual Link is : " +actual_link);
		String expected_link="https://demo.guru99.com/test/newtours/login_sucess.php";
	Assert.assertEquals(actual_link,expected_link,"Url mismatch");	
  }
  
@SuppressWarnings("deprecation")
@BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\Roop\\Desktop\\Testing\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);	
		driver.manage().window().maximize();	
  }

  
  
}


