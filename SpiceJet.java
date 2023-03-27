package layoff;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		/* .... Static Dropdown.... */

		/*
		 * List<WebElement> staticdropdown =
		 * driver.findElements(By.id("ctl00_mainContent_DropDownListCurrency"));
		 * 
		 * for(WebElement currency : staticdropdown) {
		 * if(currency.getText().equals("AED")) { currency.click();
		 * Assert.assertEquals(currency, "AED"); } }
		 */

		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select currency = new Select(dropdown);
		currency.selectByIndex(1);
		System.out.println(currency.getFirstSelectedOption().getText());
		Assert.assertEquals(currency.getFirstSelectedOption().getText(), "INR");

		currency.selectByVisibleText("AED");
		currency.getFirstSelectedOption().getText();
		System.out.println(currency.getFirstSelectedOption().getText());
		Assert.assertEquals(currency.getFirstSelectedOption().getText(), "AED");

		currency.selectByValue("USD");
		currency.getFirstSelectedOption().getText();
		System.out.println(currency.getFirstSelectedOption().getText());
		Assert.assertEquals(currency.getFirstSelectedOption().getText(), "USD");

		/* .............. Updated Drop Downs...... */

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for (int i = 1; i <= 3; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		Thread.sleep(2000);

		driver.findElement(By.id("hrefIncChd")).click();
		String passangers = driver.findElement(By.id("divpaxinfo")).getText();
		Assert.assertEquals(passangers, "4 Adult, 1 Child");

		/* ..........Check Boxes....... */

		List<WebElement> checkbox = driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println(checkbox.size());
		Assert.assertEquals(checkbox.size(), 6);

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		/* ..........Radio Buttons..... */

		/*
		 * List<WebElement> radiobuttons =
		 * driver.findElements(By.cssSelector("input[type='radio']"));
		 * System.out.println(radiobuttons.size());
		 * driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_2")).click(); String
		 * information = driver.findElement(By.className("MultiCityContent")).getText();
		 * System.out.println(information);
		 * driver.findElement(By.id("MultiCityModelAlert")).click();
		 */

		/* ......... Dynamic Drop down.... */

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click(); (use line 87
		// code instead..either one is good)
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']"))
				.click();

		/* ..........Radio Buttons..... */

		List<WebElement> radiobuttons = driver.findElements(By.cssSelector("input[type='radio']"));
		System.out.println(radiobuttons.size());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_2")).click();
		String information = driver.findElement(By.className("MultiCityContent")).getText();
		System.out.println(information);
		driver.findElement(By.id("MultiCityModelAlert")).click();

	}

}
