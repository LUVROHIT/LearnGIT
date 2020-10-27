package newPackage;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeEcommerce {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 10);

		String[] itemNeeded = { "Brocolli", "Carrot", "Cucumber" };
		int j = 0;

		List<WebElement> itemName = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < itemName.size(); i++) {
			String[] name = itemName.get(i).getText().split("-");
			String formattedName = name[0].trim();

			List itemPurchasedList = Arrays.asList(itemNeeded); // Convert Array list

			if (itemPurchasedList.contains(formattedName)) {
				driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
				j++;

				if (j == itemNeeded.length) {
					break;
				}

			}

		}
		driver.quit();
	}
}
