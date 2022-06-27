package pack1;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class AlertHandling {
	WebDriver driver;
  @Test
  public void simpleAlert() {
	  
	  WebElement simpl_alert_exp=driver.findElement(By.xpath("//button[text()=\"Click me!\"]"));
		simpl_alert_exp.click();
		Alert al = driver.switchTo().alert();
		al.accept();
  }
  @Test(priority=1)
 public void confirmationAlert() {
	  WebElement confirm_alert_exp =driver.findElement(By.xpath("//button[text()=\"Click me!\"]/following::button[1]"));
	  confirm_alert_exp.click();
	  Alert al=driver.switchTo().alert();
	  al.accept();
	
  }
  @Test(priority=2)
  public void  promptAlert() {
	  WebElement prompt_alert_exp=driver.findElement(By.xpath("//button[text()=\"Click for Prompt Box\"]"));
	  prompt_alert_exp.click();
	  Alert al=driver.switchTo().alert();
	  al.sendKeys("Hi!I'm Parvathi");
	  al.accept();
  }
  @SuppressWarnings("deprecation")
@BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.edge.driver","C:\\\\Users\\\\Roop\\\\Desktop\\\\Testing\\\\EdgeDriver\\\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.manage().window().maximize();	
	  }
  }


