package method_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(2000);
	
	driver.close();
	
	
}

}
