package newPackage;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceWebsite
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		int j=0;
		
		String[] itemPurchased = {"Brocolli","Carrot","Cauliflower","Mushroom"};  // Array of string 
		// we can create array list here also instead of array of string but array list takes more memory

		List<WebElement> itemNeeded = driver.findElements(By.cssSelector("h4.product-name"));
      
      
			for(int i=0;i<itemNeeded.size();i++)
				{
					String[] name= itemNeeded.get(i).getText().split("-");  // returns an array
					String formattedName=name[0].trim();
					
					// convert array into array list for easy search
					//array list support "contains" class that make search easy
					//format it to actual vegetables name
					
					List itemPurchasedList = Arrays.asList(itemPurchased);
								
					if(itemPurchasedList.contains(formattedName))
						{
							j++;
							driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
							
							if(j==itemPurchased.length)
							{
								
								break;
							}
							
						}
				}	  
    	  
      }  
}

	
