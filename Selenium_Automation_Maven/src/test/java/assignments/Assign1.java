package assignments;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class Assign1 {
	WebDriver driver;
  @Test
  public void Test1() {
	  String title=driver.getTitle();
	  System.out.println(title);
	  String url=driver.getCurrentUrl();
	  System.out.println(url);
	  driver.close();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.edge.driver","C:\\Users\\Roop\\Desktop\\Testing\\EdgeDriver\\msedgedriver.exe");
	  driver=new EdgeDriver();
	  driver.get("https://selenium.obsqurazone.com/");
  }

}
