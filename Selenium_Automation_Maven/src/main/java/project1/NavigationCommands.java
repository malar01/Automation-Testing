package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Roop\\Desktop\\Testing\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.navigate().to("https://demo.guru99.com/test/newtours/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
			}

}
