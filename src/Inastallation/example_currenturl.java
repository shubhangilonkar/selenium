package Inastallation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example_currenturl 
{
public static void main(String[] args) throws InterruptedException
{
	 WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  
	  Thread.sleep(2000);
	 String url = driver.getCurrentUrl();
	 System.out.println(url);
	driver.close();
}
}
