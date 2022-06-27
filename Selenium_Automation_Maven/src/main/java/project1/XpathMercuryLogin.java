package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathMercuryLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Roop\\Desktop\\Testing\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		WebElement userName1=driver.findElement(By.xpath("//input[contains(@name,'userName')]"));
		userName1.sendKeys("Test");
		WebElement password1=driver.findElement(By.xpath("//input[contains(@name,'password')]"));
		password1.sendKeys("Test@1234");
		WebElement submit1=driver.findElement(By.xpath("//input[contains(@name,'submit')]"));
		submit1.click();
		

	}

}
