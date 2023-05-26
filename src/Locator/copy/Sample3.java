package Locator.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	//enter username
	//driver.findElement(By.xpath(locator))
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shubhangi");
	//enter passward
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sanu1421");
	//click login button
	driver.findElement(By.xpath("//button[@name='login']")).click();
}
}