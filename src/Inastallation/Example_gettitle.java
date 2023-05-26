package Inastallation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_gettitle 
{
public static void main(String[] args) throws InterruptedException 
{
	 WebDriver driver=new ChromeDriver();
	 driver.get(" https://www.google.com/");
	String s1 = driver.getTitle();
	System.out.println(s1);
	Thread.sleep(2000);
	
	
	driver.close();
}
}
