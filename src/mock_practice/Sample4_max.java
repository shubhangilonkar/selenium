package mock_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4_max 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
//	Options s1 = driver.manage();
//	Window s2 = s1.window();
//	s2.maximize();
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	driver.close();
	
}
}
