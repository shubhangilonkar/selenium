package webelements_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		
		boolean result = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		
		System.out.println(result);
		
		if(result) 
		{
			System.out.println("element is enable");
		}
		else 
		{
			System.out.println("element is disable");
		}
		
		
		
	}

}
