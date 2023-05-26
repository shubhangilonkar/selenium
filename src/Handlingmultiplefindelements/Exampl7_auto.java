package Handlingmultiplefindelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exampl7_auto 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver() ;
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		Thread.sleep(2000);
		
		List<WebElement> Allopt = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		String ecpText="redmi note 11";
		for(WebElement s1:Allopt) 
		{
			String ActualText = s1.getText();
			if(ActualText.equals(ecpText))
			{
				s1.click();
				break;
			}
			
			
		}
		
		
		
		
		
		
		
	}
	
}
