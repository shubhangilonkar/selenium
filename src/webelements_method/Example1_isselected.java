package webelements_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_isselected 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(3000);
	
	boolean result = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).isSelected();
	System.out.println(result);
	
	if(result)
	{
		System.out.println("button is selected");
	}
	else 
	{
		System.out.println("button is de-selected");
	}
	
	
}

}
