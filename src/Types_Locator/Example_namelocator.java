package Types_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_namelocator 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/shubh/OneDrive/Desktop/selenium/Example_name.html");
	//enterFN
	driver.findElement(By.name("xyz233")).sendKeys("abc");
	//enter LN
	driver.findElement(By.name("xyz233")).sendKeys("xys");
} 

}
