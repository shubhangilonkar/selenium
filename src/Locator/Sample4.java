package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(4000);
	//enter username
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pradeeplavange");
	Thread.sleep(4000);

	//enter passward
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("8605906516");
	Thread.sleep(4000);

	//click login button
	driver.findElement(By.xpath("//button[@name='login']")).click();
	Thread.sleep(4000);
     driver.close();
	
}
}
