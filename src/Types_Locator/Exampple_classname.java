package Types_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exampple_classname 
{
	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/shubh/OneDrive/Desktop/selenium/Example_classname.html");
		Thread.sleep(3000);
		
		driver.findElement(By.className("abc123")).sendKeys("abc");
		
		driver.findElement(By.className("abc123")).sendKeys("xyz");
	}
	
	
	
	

}
