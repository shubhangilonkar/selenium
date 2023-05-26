
package Locator.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			
			Thread.sleep(4000);
			//click on login
			driver.findElement(By.xpath("//a[text()='Login']")).click();
			Thread.sleep(4000);

			//enter us
 driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']")).sendKeys("7498389175");
			
}
}
