package Inastallation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_title 
{
public static void main(String[] args) throws InterruptedException 
{
	       WebDriver driver  =new ChromeDriver();
	       driver.get("https://www.flipkart.com/");
	       
	      Thread.sleep(4000);
	      
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	    driver.close();
}
}
