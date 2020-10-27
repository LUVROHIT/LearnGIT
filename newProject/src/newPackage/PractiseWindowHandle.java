package newPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseWindowHandle {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Selenium driver\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		
		String parent= driver.getWindowHandle();
		System.out.println(parent);
		Set<String> allWindow= driver.getWindowHandles();
		int count=allWindow.size();
		System.out.println(count);
		
		for(String child:allWindow)
		{
			if(parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);    
				
			}
		}
		
		
	}

}    
