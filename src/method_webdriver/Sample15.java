package method_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample15 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.nykaa.com/");
	Thread.sleep(2000);
	
	driver.manage().window().minimize();
	
}
}
