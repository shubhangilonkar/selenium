package DynamicElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi note 12 pro");
	
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	
 String reviews = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[8]")).getText();
 
 System.out.println(reviews);
 
	

}
}
