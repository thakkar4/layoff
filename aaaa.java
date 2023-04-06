package layoff;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class aaaa {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//driver.manage().window().maximize();
		List<WebElement> vegetables = driver.findElements(By.cssSelector("div[class='product']"));
		
		for(int i = 0; i<vegetables.size(); i++) {
			
			System.out.println(vegetables.get(i));
		}
	    	  System.out.println(vegetables.contains("Brocolli - 1 Kg")) ;
	    	  System.out.println(vegetables.isEmpty());
	    	  
			for(WebElement name : vegetables)
		{		
		   
		  				
				System.out.println(name);
			
		} 
		
				
		}
		
	}


