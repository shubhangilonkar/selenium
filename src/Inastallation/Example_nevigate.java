package Inastallation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_nevigate 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	
	   driver.navigate().to("https://www.google.com/");
	   Thread.sleep(3000);
	   
	   driver.navigate().forward();
	   Thread.sleep(3000);

	   driver.navigate().back();
	   Thread.sleep(3000);

	   driver.navigate().refresh();
	   Thread.sleep(3000);

	   
}
}
