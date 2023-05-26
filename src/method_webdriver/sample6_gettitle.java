package method_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample6_gettitle
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.firstcry.com/");
	Thread.sleep(3000);
            String text = driver.getTitle();
            System.out.println(text);
            Thread.sleep(2000);
            driver.close();
	
	
	
}
}
