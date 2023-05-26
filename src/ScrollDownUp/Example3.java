package ScrollDownUp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 
{

public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.guru99.com/scroll-up-down-selenium-webdriver.html");
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement report = driver.findElement(By.xpath("//a[text()=' Report a Bug ']"));
	
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",report);
	
}
}
