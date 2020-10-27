package newPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium driver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.xpath("//a[contains(text(),'Privacy')]")).click();
		
		System.out.println(driver.getTitle());
		Set<String> id=driver.getWindowHandles();
		Iterator<String>it=id.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentId); 
		
		System.out.println(driver.getTitle());
	
	}

}
