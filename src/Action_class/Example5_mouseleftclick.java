package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example5_mouseleftclick 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(2000);
	//step1
	WebElement seller = driver.findElement(By.xpath("(//span[text()='Become a Seller'])[1]"));
	//step2
	Actions act=new Actions(driver);
	//step3
	act.moveToElement(seller).click().perform();
	
	
	
	
	
}
}
