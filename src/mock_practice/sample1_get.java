package mock_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1_get 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	Thread.sleep(2000);
	
	driver.close();
	
	
}
	
}
