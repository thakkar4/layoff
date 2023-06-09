package layoff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("thakkar4@yahoo.com");
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("3097501407");
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.className("infoMsg")).getText());
		
		driver.findElement(By.xpath("//div[@class = 'forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='Pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		//driver.findElement(By.xpath("//button[@class = 'submit signInBtn']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	}
	
}
