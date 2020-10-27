package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\facebook.com");
		
		    
//	driver.get("https:\\yahoo.in");
//	driver.navigate().back();
//	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("rohitetc1992@gmail.com");
//	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("ilovmoms");
//	driver.findElement(By.cssSelector("input[value='Log In']")).click();

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rohitetc1992@gmail.com");
	}
}