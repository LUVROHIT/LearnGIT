package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DemoFrame
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		driver.findElement(By.id("draggable")).click();
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		
		Actions a=new Actions(driver);
		a.dragAndDrop(source,destination).build().perform();
		System.out.println("Main Page");
		driver.switchTo().defaultContent();
		System.out.println("contain Page");
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/ul/li[2]/a"))).click().build().perform();
		System.out.println("click");

	
	
	
	}
	
}