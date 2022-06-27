package assignments;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class Assign2 {
	WebDriver driver;
  @Test
  public void Test2() {
	  driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
	  driver.navigate().back();
	  driver.navigate().forward();
	  driver.navigate().refresh();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.edge.driver","C:\\Users\\Roop\\Desktop\\Testing\\EdgeDriver\\msedgedriver.exe");
	  driver=new EdgeDriver();
	  driver.get("http://www.opesmount.in/grocerystore1/");
	  
  }

}
