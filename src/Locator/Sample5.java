package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample5 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("locator"))
		//enter username
		driver.findElement(By.xpath("//textarea[@maxlength='2048']")).sendKeys("abcd");
		//enter password
		//Thread.sleep(3000);

		
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sanu1411");
		Thread.sleep(3000);

		//click login button
		
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		//Thread.sleep(3000);
		
		//driver.close();
	

	}

	
}
