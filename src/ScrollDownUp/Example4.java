package ScrollDownUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example4 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.browserstack.com/guide/action-class-in-selenium");
	driver.manage().window().maximize();
	
	WebElement test=driver.findElement(By.xpath("/span[text()='Developers ']"));
	Thread.sleep(2000);
	
	Actions a=new Actions(driver);
	
	a.moveToElement(test).perform();
}
}
