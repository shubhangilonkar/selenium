package Inastallation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_get 
{
public static void main(String[] args) 
{
	WebDriver   driver =new ChromeDriver();
	//driver.get("https://www.facebook.com/");
	driver.get("https://www.flipkart.com/");
	driver.close();
	driver.quit();
}
}
