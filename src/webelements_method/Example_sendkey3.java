package webelements_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_sendkey3 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.xpath("//textarea[@maxlength='2048']")).sendKeys("picture");
		
		WebElement un = driver.findElement(By.xpath("//textarea[@maxlength='2048']"));
		un.sendKeys("picture");
	}

}
