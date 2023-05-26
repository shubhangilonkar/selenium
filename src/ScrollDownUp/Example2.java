package ScrollDownUp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
	WebElement term = driver.findElement(By.xpath("(//a[text()='Terms of Service'])[1]"));
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",term);	
}
}
