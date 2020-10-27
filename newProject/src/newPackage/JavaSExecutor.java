package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSExecutor {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("Beng");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
		System.out.println((driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText()));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script="return document.getElementById('fromPlaceName').value;";
		String ActualText= (String) js.executeScript(script);
		System.out.println(ActualText);
		
		    
	}
	}


