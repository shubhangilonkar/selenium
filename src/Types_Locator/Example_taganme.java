package Types_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_taganme 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/shubh/OneDrive/Desktop/selenium/Example_tagname.html");
	Thread.sleep(3000);
	//enter FN
	driver.findElement(By.tagName("input")).sendKeys("abc");
	Thread.sleep(3000);
	//ENTER LN
	driver.findElement(By.tagName("input")).sendKeys("xyz");
	
	
}
}
