package layoff;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
        List<WebElement> productlist = driver.findElements(By.cssSelector("h4.product-name"));
        for(WebElement product : productlist) 
        {
        	if(product.getText().startsWith("Cucumber "))
        	{
        		System.out.println(product);
        	}
        }
	}

}
