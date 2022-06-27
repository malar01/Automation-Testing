package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Roop\\Desktop\\Testing\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://selenium.obsqurazone.com/index.php");
			}
	}



