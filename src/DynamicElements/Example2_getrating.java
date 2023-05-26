package DynamicElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_getrating 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//click on cancle btn
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(2000);
	
//send key into search box
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi note 12 pro");
	//click on search
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	//get text of rataing
	String Rating = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]")).getText();
	
	System.out.println(Rating);
	
}
}
