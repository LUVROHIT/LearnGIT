package newPackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConceptPractise {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size()); // How to get count of number of links in a page? Interview Question
		
		WebElement footerDriver=driver.findElement(By.id("gf-BIG"));
		footerDriver.click();
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		WebElement coloumDriver = footerDriver.findElement(By.xpath("//table//tbody//tr//td[1]//ul"));
		coloumDriver.click();
		System.out.println(coloumDriver.findElements(By.tagName("a")).size());
		
		
		for(int i=1;i<coloumDriver.findElements(By.tagName("a")).size();i++)
		{
			String clickToNewTab= Keys.chord(Keys.CONTROL,Keys.ENTER); // for clicking new tab
			coloumDriver.findElements(By.tagName("a")).get(i).sendKeys(clickToNewTab);
		}	
			Thread.sleep(5000L);
			Set<String> newWindow =driver.getWindowHandles();
			Iterator<String> it=  newWindow.iterator(); 
		
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		}
		
}


