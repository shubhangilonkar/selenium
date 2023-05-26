package Locator.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//create un
	//driver.findElement(By.xpath("locator type"))
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pradeeplavange@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("8329015592");
	
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//button[@name='login']")).click();
}
}
