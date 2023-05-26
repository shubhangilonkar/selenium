package webelements_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_clear3 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	
			driver.get("https://www.makemytrip.com/");
			Thread.sleep(2000);
			
     driver.findElement(By.xpath("//p[text()='Login or Create Account']")).click();
		Thread.sleep(2000);
            WebElement username = driver.findElement(By.xpath(" //input[@class='font14 fullWidth'] "));
            username.sendKeys("shubhangi14lonkar@gmail.com");
		  Thread.sleep(4000);
		  username.clear();
		Thread.sleep(4000);
		username.sendKeys("abcd"); 
		

			
			
	
	
	
}
}
