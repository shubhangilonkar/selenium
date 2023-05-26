package Handlingmultiplefindelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/shubh/OneDrive/Desktop/selenium/multiplecheckbox.html");
	
	
	List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox"));
	for(WebElement s1:checkbox) 
	{
		s1.click();
		Thread.sleep(500);
	}
	
}
	
}
