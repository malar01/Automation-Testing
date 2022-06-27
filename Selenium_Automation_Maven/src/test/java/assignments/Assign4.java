package assignments;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Assign4 {
	WebDriver driver;
  @Test
  public void Test4() {
	  String actual_page_title=driver.getTitle();
	  System.out.println(actual_page_title);
	 String expected_page_title="Grocerystore";
	 Assert.assertEquals(actual_page_title,expected_page_title,"Title mismatch");
	 Assert.assertNotNull(driver);
	 
	 driver.close();
	 driver=new EdgeDriver();
	 driver.get("https://selenium.obsqurazone.com/");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.edge.driver","C:\\Users\\Roop\\Desktop\\Testing\\EdgeDriver\\msedgedriver.exe");
	  driver=new EdgeDriver();
	  driver.get("http://www.opesmount.in/grocerystore1/");
	  
	  
  }

}
