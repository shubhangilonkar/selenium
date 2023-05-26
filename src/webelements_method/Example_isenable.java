package webelements_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_isenable 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	Thread.sleep(3000);
	boolean result = driver.findElement(By.xpath("//button[@class=\"_acan _acap _acas _aj1-\"]")).isEnabled();
	System.out.println(result);
	
	if(result) 
	{
		System.out.println("element is enable");
		
	}
	else
	{
		System.out.println("element is disbale"); 
		
	}
	
	
}
}
