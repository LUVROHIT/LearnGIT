package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Departure {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
//    	driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		System.out.println("Banglore");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		System.out.println("Chennai");
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']"))
				.click();
		System.out.println("Chennai2");
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		System.out.println("Date");
//        Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute("string").contains("1"));
		System.out.println(
				driver.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute("string").contains("1"));

		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println("Adults");
		Select adults = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		adults.selectByValue("3");
		Select currency = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		currency.selectByValue("USD");
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}
}
