package project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElementCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Roop\\Desktop\\Testing\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
	WebElement text_field1=driver.findElement(By.id("single-input-field"));
		
		text_field1.sendKeys("My Name is Parvathi");
		
		//text_field1.clear();
		//WebElement btn_1=driver.findElement(By.linkText("Show Message"));
		//WebElement btn_1=driver.findElement(By.partialLinkText("show mess"));
		WebElement btn_1=driver.findElement(By.id("button-one"));
		
		//WebElement btn_1=driver.findElement(By.className("btn btn-primary"));
		btn_1.click();
		//btn_1.submit();
		
		String btn_1_tagname=btn_1.getTagName();
		System.out.println("Show tag name : "+btn_1_tagname);
		String btn_1_att=btn_1.getAttribute("id");
		System.out.println("Show Attribute Name : "+btn_1_att);
		
		String btn_1_text=btn_1.getText();
		System.out.println("Show Text Message : "+btn_1_text); 
		
		Dimension sz=btn_1.getSize();
		System.out.println("Display height of button : "+sz.height);
		System.out.println("Display width of button : "+sz.width);
		
		Point p=btn_1.getLocation();
		System.out.println("Display X axis : "+p.x);
		System.out.println("Display Y axis : "+p.y);
		
		String css_value=btn_1.getCssValue("font-family");
		System.out.println("Show font family : "+css_value);
		
		//Code on isDisplayed, isEnabled(), isSelected(), check boxes, radio button handling
		
		//Checkbox Demo
		
		WebElement chk_box=driver.findElement(By.linkText("Checkbox Demo"));
		System.out.println("Single Checkbox Demo");
		chk_box.click();
		//locate
		List<WebElement> chk_box1=driver.findElements(By.id("gridCheck"));
		System.out.println();
		boolean display=chk_box1.get(0).isDisplayed();
		System.out.println("Checkbox displayed : "+display);
		boolean enabled=chk_box1.get(0).isEnabled();
		System.out.println("Checkbox enabled : "+enabled);
		chk_box1.get(0).click();
		boolean selected=chk_box1.get(0).isSelected();
		System.out.println("Checkbox selected : "+selected);
		WebElement text=driver.findElement(By.id("message-one"));
		String displaychk=text.getText();
		System.out.println(displaychk);
		System.out.println("");

		List<WebElement> chk_box_mul=driver.findElements(By.className("check-box-list"));
		System.out.println("Multiple Checkbox Demo");
		boolean muldis=chk_box_mul.get(0).isDisplayed();
		System.out.println("Check box one displayed : "+muldis);
		boolean mulena0=chk_box_mul.get(0).isEnabled();
		System.out.println("Check box one enabled : "+mulena0);
		boolean mulena1=chk_box_mul.get(1).isEnabled();
		System.out.println("Check box two enabled : "+mulena1);
		boolean mulena2=chk_box_mul.get(2).isEnabled();
		System.out.println("Check box three enabled : "+mulena2);
		boolean mulena3=chk_box_mul.get(3).isEnabled();
		System.out.println("Check box four is enabled : "+mulena3);
		chk_box_mul.get(0).click();
		chk_box_mul.get(3).click();
		boolean mulsel2=chk_box_mul.get(2).isSelected();
		System.out.println("Check box three selected : "+mulsel2);
		
		WebElement btn_2=driver.findElement(By.id("button-two"));
		btn_2.click();
		btn_2.click();
		
		//Radio Buttons Demo
		
		WebElement radiobutton=driver.findElement(By.partialLinkText("Radio B"));
		radiobutton.click();
		
		List<WebElement> rbtn=driver.findElements(By.name("inlineRadioOptions"));
		System.out.println("Radio Button Demo");
		boolean rbtn1=rbtn.get(0).isDisplayed();
		System.out.println("Radio button male displayed : " +rbtn1);
		boolean rbtn2=rbtn.get(1).isDisplayed();
		System.out.println("Radio button Female is displayed : "+rbtn2);
		rbtn.get(1).click();
		
		WebElement clickvalue=driver.findElement(By.id("button-one"));
		clickvalue.click();
		WebElement showvalue=driver.findElement(By.id("message-one"));
		String value=showvalue.getText();
		System.out.println("Show selected value displayed : "+value);
		
		List<WebElement> pagender=driver.findElements(By.name("student-gender"));
		System.out.println("Patients Gender");
		boolean rbt1=pagender.get(0).isDisplayed();
		System.out.println("Radio button diaplyed : "+rbt1);
		boolean rbt2=pagender.get(1).isEnabled();
		System.out.println("Radio button enabled : "+rbt2);
		boolean rbt3=pagender.get(1).isSelected();
		System.out.println("Radio button Female selected : "+rbt3);
		pagender.get(0).click();
		boolean chkselect=pagender.get(0).isSelected();
		System.out.println("Radio button Male selected : "+chkselect);
		
		List<WebElement> paagegrp=driver.findElements(By.name("student-age"));
		System.out.println("Patients Age Group");
		boolean btn1=paagegrp.get(0).isDisplayed();
		System.out.println("Radio button 1 to 18 diaplyed : "+btn1);
		boolean btn2=paagegrp.get(1).isEnabled();
		System.out.println("Radio button 19 to 44 enabled : "+btn2);
		boolean btn3=paagegrp.get(2).isSelected();
		System.out.println("Radio button 45 to 60 selected : "+btn3);
		paagegrp.get(1).click();
		boolean ageselect=paagegrp.get(1).isSelected();
		System.out.println("Radio button 19 to 44 selected : "+ageselect);
		
		WebElement resultbtn=driver.findElement(By.id("button-two"));
		resultbtn.click();
		WebElement showresult=driver.findElement(By.id("message-two"));
		String result=showresult.getText();
		System.out.println("Result Displayed : "+result);
		
		
		
	}

}
