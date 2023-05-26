package Locator.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	Thread.sleep(4000);
	//enter us
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abc");
	
	Thread.sleep(4000);
	//enter pwd
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("xyzvsg");
	Thread.sleep(4000);
	//click on log
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}
}
