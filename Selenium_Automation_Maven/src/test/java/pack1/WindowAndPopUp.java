package pack1;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class WindowAndPopUp {
	WebDriver driver;
  @Test
  public void locateWindows() {
	  WebElement b1 = driver.findElement(By.xpath("//a[normalize-space(text())='Like us On Facebook']"));
		b1.click();
		
		String MainWindow=driver.getWindowHandle();	//handle the main window by driver.getWindowHandle()
		
      // To handle all new opened window.				
      Set<String> s1=driver.getWindowHandles(); //To handle all opened windows by web driver, we can use “Driver.getWindowHandles()"	
      Iterator<String> itr=s1.iterator();		
     
      //{mainwindow,childwindow}
      		
      while(itr.hasNext())			
      {		
          String ChildWindow=itr.next();	//String childwindow = childwindow
          		
          if(!MainWindow.equalsIgnoreCase(ChildWindow))			
          {    		
                  // Switching to Child window
                  driver.switchTo().window(ChildWindow);
                  driver.manage().window().maximize();
                  driver.findElement(By.xpath("//input[contains(@name,'email')and@placeholder='Email or phone']")).sendKeys("parvathi.roop@gmail.com");          
	}
        
          
          
          //Switching to parent window
          //driver.switchTo().window(MainWindow);
  }
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.edge.driver","C:\\Users\\Roop\\Desktop\\Testing\\EdgeDriver\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://selenium.obsqurazone.com/window-popup.php");
		driver.manage().window().maximize();	
	 
  }

}
