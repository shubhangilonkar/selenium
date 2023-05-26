package mockInterview_que;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	Thread.sleep(2000);
	
	boolean result = driver.findElement(By.xpath("//button[@id='disable']")).isEnabled();
	System.out.println(result);
	
	if(result)
	{
		System.out.println("button is  of enable");
	}
	else 
	{
		System.out.println("button is of disable");
	}
	
	Thread.sleep(2000);
	
	String text = driver.findElement(By.xpath("//button[@id='enable-button']")).getText();
	System.out.println(text);
}
}
