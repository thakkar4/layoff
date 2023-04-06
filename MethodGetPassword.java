package layoff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MethodGetPassword {

	public static void main(String[] args) throws InterruptedException {
		String name = "rahul";
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String password = getPassword(driver);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='Pass']")).sendKeys(password);
		Thread.sleep(2000);
		//driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	/*	Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+ ",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close(); */
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+ ",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();

	}
public static String getPassword(WebDriver driver) throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		Thread.sleep(2000);
		String passwordText = driver.findElement(By.className("infoMsg")).getText();
		String[] passwordArray = passwordText.split("'");
		String[] passwordArrayTwo = passwordArray[1].split("'");
		String password= passwordArrayTwo[0];
		return password;	
			
	}
}
