package newPackage;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoEcommerceWebsite 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		WebDriverWait wait=new WebDriverWait(driver, 10);
		int j = 0;
		String[] itemRequired = { "Onion", "Grapes", "Banana","Grapes", "Mango" }; // Array of String //List of vegetables that
																			// need to purchase

		List<WebElement> itemPurchased = driver.findElements(By.cssSelector("h4.product-name")); // list of vegetables
																									// in market

		for (int i = 0; i < itemPurchased.size(); i++) // get the size of the vegetables in market
		{
			String[] name = itemPurchased.get(i).getText().split("-");
			String formattedName = name[0].trim(); // trim is used to remove space

			List itemRequiredList = Arrays.asList(formattedName);

			if (itemPurchased.contains(itemRequiredList)) {
				j++;
				driver.findElements(By.xpath("/div[@class='product-action']//button")).get(i).click();

				if (j == itemRequired.length) {
					break;

				}
driver.quit();
			}

		}
	}
}