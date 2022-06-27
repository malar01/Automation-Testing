package project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Roop\\Desktop\\Testing\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();
		
		WebElement drop_down1=driver.findElement(By.id("single-input-field"));
		Select s=new Select(drop_down1);
		s.selectByIndex(1);
		//s.selectByValue("Yellow");
		//s.selectByVisibleText("Green");
		
		List<WebElement> fromoptions=s.getOptions();
		int size=fromoptions.size();
		System.out.println("The size is : "+size);
		System.out.println("\n The Option Values \n");
		for(int i=0;i<size;i++)
		{
			String myoption=fromoptions.get(i).getText();
			System.out.println(myoption);
		}
		
		System.out.println("First Selected option from Single select");
		
		WebElement w1=s.getFirstSelectedOption();
		System.out.println(w1.getText());
		
		
		//multiple select option
		
		WebElement drop_down2=driver.findElement(By.id("multi-select-field"));
		Select s1=new Select(drop_down2);
		s1.selectByVisibleText("Red");
		//s1.selectByIndex(1);
		s1.selectByValue("Green");
		
		//deselecting selected option from drop down
				
		//s1.deselectAll();
		s1.deselectByIndex(0);
		//s1.deselectByValue("Green");
		//s1.deselectByVisibleText("Red");
		
		List<WebElement> fromselected=s1.getAllSelectedOptions();
		int size1=fromselected.size();
		System.out.println("The size is : "+size1);
		System.out.println("\n The Option Values \n");
		for(int j=0;j<size1;j++)
		{
			String option_value=fromselected.get(j).getText();
			System.out.println(option_value);
		}
		
		System.out.println("First Selected option from Multiple select");
		
		WebElement w2=s1.getFirstSelectedOption();
		System.out.println(w2.getText());
		System.out.println("Enter the name");
	}

	
}


