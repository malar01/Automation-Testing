package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SimpleFormDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Roop\\Desktop\\Testing\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		/*WebElement form=driver.findElement(By.linkText("Simple Form Demo"));
		form.click();
		WebElement singleinput=driver.findElement(By.id("single-input-field"));
		singleinput.sendKeys("Add Two Numbers");
		
		WebElement button=driver.findElement(By.id("button-one"));
		button.click();
		WebElement message=driver.findElement(By.id("message-one"));
		message.getText();
		
		WebElement valueA=driver.findElement(By.id("value-a"));
		valueA.sendKeys("123");
		
		WebElement valueB=driver.findElement(By.id("value-b"));
		valueB.sendKeys("456");
		
		WebElement total=driver.findElement(By.id("button-two"));
		total.click();
		
		WebElement sum_total=driver.findElement(By.id("message-two"));
		sum_total.getText();*/
		
		//locate elements using xpath functions
		
		WebElement form=driver.findElement(By.linkText("Simple Form Demo"));
		form.click();
		WebElement singleinput=driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
		singleinput.sendKeys("Add Two numbers");
		WebElement button=driver.findElement(By.xpath("//button[contains(@id,'butt')]"));
		button.click();
		WebElement valueA=driver.findElement(By.xpath("//input[contains(@id,'value-a')or@placeholder='Enter Value']"));
		valueA.sendKeys("1234");
		WebElement valueB=driver.findElement(By.xpath("//input[starts-with(@placeholder,'Ent')and@id='value-b']"));
		valueB.sendKeys("4567");
		WebElement total=driver.findElement(By.xpath("//button[text()='Get Total']"));
		total.click();
		
					
		
	}

}
