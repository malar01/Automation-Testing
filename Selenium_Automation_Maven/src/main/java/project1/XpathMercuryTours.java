package project1;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathMercuryTours {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Roop\\Desktop\\Testing\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();
		WebElement firstName=driver.findElement(By.xpath("//input[@name='firstName']"));
		firstName.sendKeys("Priya");
		WebElement lastName=driver.findElement(By.xpath("//input[@name='lastName']"));
		lastName.sendKeys("Hari");
		WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("9852364780");
		WebElement email=driver.findElement(By.xpath("//input[@id='userName']"));
		email.sendKeys("test@1234");
		WebElement address=driver.findElement(By.xpath("//input[@name='address1']"));
		address.sendKeys("Kallampally");
		WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("Trivandrum");
		WebElement state=driver.findElement(By.xpath("//input[@name='state']"));
		state.sendKeys("Kerala");
		WebElement postalCode=driver.findElement(By.xpath("//input[@name='postalCode']"));
		postalCode.sendKeys("695011");
		
		//drop down handling
		
		WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
		Select s=new Select(country);
		s.selectByValue("INDIA");
		
		WebElement userName=driver.findElement(By.xpath("//input[@id='email']"));
		userName.sendKeys("Test");
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Test@1234");
		WebElement confirmPassword=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		confirmPassword.sendKeys("Test@1234");
		WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		
		
		//WebElement home=driver.findElement(By.linkText("Home"));
		//home.click();
		
		
		
		
		
	}

}
