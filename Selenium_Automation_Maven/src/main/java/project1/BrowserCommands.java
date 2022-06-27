package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Roop\\Desktop\\Testing\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://selenium.obsqurazone.com/index.php");
			String title=driver.getTitle();
			System.out.println("Title="+title);
			String current_url=driver.getCurrentUrl();
			System.out.println(current_url);
			String page_source=driver.getPageSource();
			System.out.println(page_source);
			//driver.close();
			//driver.quit();
			}
		}





