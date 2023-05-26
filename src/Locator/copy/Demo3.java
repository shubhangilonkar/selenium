package Locator.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		//enter us
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
		Thread.sleep(3000);
		//entr pwd
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("xyz");
		Thread.sleep(3000);
		//click on login
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
