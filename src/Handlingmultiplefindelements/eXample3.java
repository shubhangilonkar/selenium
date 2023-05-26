package Handlingmultiplefindelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class eXample3 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/shubh/OneDrive/Desktop/selenium/multiplecheckbox.html");
	
 List<WebElement> Allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
 System.out.println(Allcheckbox.size());
	for(WebElement s1:Allcheckbox)
		
	{
		s1.click();
		
		Thread.sleep(500);
	}
	//deselect checkbox
	for(int i=Allcheckbox.size()-1;i>=0;i--)
	{
		Allcheckbox .get(i).click();
		Thread.sleep(500);
	}
}
}
