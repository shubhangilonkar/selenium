
package webelements_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_sendkey
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
		
	WebElement un = driver.findElement(By.xpath("//input[@id='email']"));
		
	un.sendKeys("abc");	
	}

}
