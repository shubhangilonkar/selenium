package DynamicElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_worldpopulation 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.worldometers.info/");
	Thread.sleep(2000);
	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Thread.sleep(2000);
	
	 String current = driver.findElement(By.xpath("(//div[@class='content-home']//a)[1]")).getText();
	 System.out.println(current);
	 
	 
	 
	 
	 
}
}
