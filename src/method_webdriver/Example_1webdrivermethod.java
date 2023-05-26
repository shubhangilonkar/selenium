package method_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_1webdrivermethod 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String title = driver.getTitle();
	System.out.println(title);
	String url = driver.getCurrentUrl();
	System.out.println(url);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.navigate().to("https://google.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
}
}
