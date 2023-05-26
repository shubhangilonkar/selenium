package Locator.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample6_xpathbytext
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(3000);
	
	//click on forgotten password
	
	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	Thread.sleep(3000);
}
}
