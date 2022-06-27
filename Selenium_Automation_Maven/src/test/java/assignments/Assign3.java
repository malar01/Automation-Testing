package assignments;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Assign3 {
	WebDriver driver;
  @Test
  public void Test() {
	  
	  String current_title=driver.getTitle();
	  System.out.println(current_title);
			 String expected_title="Grocerystore";
			 Assert.assertEquals(current_title, expected_title);
			 //driver.close();
			 Assert.assertNotNull(driver);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.edge.driver","C:\\Users\\Roop\\Desktop\\Testing\\EdgeDriver\\msedgedriver.exe");
	  driver=new EdgeDriver();
	  driver.get("http://www.opesmount.in/grocerystore1/");
  }

}
