package Types_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_id 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/shubh/OneDrive/Desktop/selenium/Example_id.html");
		Thread.sleep(3000);
		driver.findElement(By.id("1234")).sendKeys("abc");
		
		Thread.sleep(3000);
		driver.findElement(By.id("5554")).sendKeys("xyz");
	}

}
