package pack1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class ActionsClassExample {
	WebDriver driver;
  @Test(enabled=false)
  public void rightClick() {
	  Actions ac=new Actions(driver);
	  WebElement elemt=driver.findElement(By.xpath("//span[text()=\"right click me\"]"));
	  ac.contextClick(elemt).perform();
	  WebElement edit=driver.findElement(By.xpath("//span[text()='Edit']"));
	  edit.click();
  }
	  
	  @Test(enabled=false)
	  public void doubleClickPgm() {
		  Actions ac_bt=new Actions(driver);
		  WebElement button_double=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		  ac_bt.doubleClick(button_double).perform();
	  }			  
@Test(enabled=false)
//https://jqueryui.com/droppable/
public void dragdroppgm() {
	WebElement frame=driver.findElement(By.className("demo-frame"));
	driver.switchTo().frame(frame);
	Actions ac_ddpgm=new Actions(driver);
	WebElement source=driver.findElement(By.id("draggable"));
	WebElement destination=driver.findElement(By.id("droppable"));
	ac_ddpgm.dragAndDrop(source, destination).perform();
}
				  
@Test
public void mouseHover() {
	Actions ac=new Actions(driver);
	WebElement main1=driver.findElement(By.linkText("Main Item 1"));
	ac.moveToElement(main1).perform();
	
	WebElement main2=driver.findElement(By.linkText("Main Item 2"));
	ac.moveToElement(main2).perform();
	
	WebElement sub=driver.findElement(By.linkText("SUB SUB LIST »"));
	ac.moveToElement(sub).perform();
	
	WebElement sub2=driver.findElement(By.linkText("Sub Sub Item 2"));
	ac.moveToElement(sub2).perform();
	//sub2.click();
}
@BeforeTest
  public void beforeTest() {
   
  System.setProperty("webdriver.edge.driver","C:\\Users\\Roop\\Desktop\\Testing\\EdgeDriver\\msedgedriver.exe");
	driver=new EdgeDriver();
	//driver.get("https://jqueryui.com/droppable/");
	driver.get("https://demoqa.com/menu/");
	driver.manage().window().maximize();	
  }
}
