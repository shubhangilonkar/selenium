
package Inastallation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_gettitle1 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com");
	
	Thread.sleep(3000);
	
	String title = driver.getTitle();
	System.out.println(title);
}
}
