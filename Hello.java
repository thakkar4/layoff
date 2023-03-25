package layoff;

import java.util.*;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Hello {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());

		// RadioButton//
		driver.findElement(By.cssSelector("input[value='radio2']")).click(); // Option1

		List<WebElement> rdos = driver.findElements(By.cssSelector("input[type = 'radio']")); // created a list for all
																								// RadioButtons
		rdos.get(0).click(); // option2 - select index from list

		for (WebElement radiobutton : rdos) {

			if (radiobutton.getAttribute("value").equals("radio3")) {

				radiobutton.click(); // option3 copy list inside the variable and select the specific attribute and
										// value
				
			/*	Boolean result = radiobutton.isSelected();
				System.out.println(result); */
				Assert.assertTrue(radiobutton.isSelected());
				
			}

		}
		// DropDown//
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropdown);
		s.selectByIndex(1);
		
		// Capture text//
		System.out.println(
				driver.findElement(By.xpath("//fieldset/legend[contains(text(),'Radio Button Example')]")).getText());

		// CheckBox//
		List<WebElement> checkbox = driver.findElements(By.cssSelector("input[type='checkbox']"));
		checkbox.get(1).click();

		for (WebElement box : checkbox) {
			if (box.getAttribute("value").equals("option3"))
			{
				box.click();
				Boolean result = box.isSelected();
				System.out.println(result);

			}

		}

	}
}
