package webelements_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_isselected
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);

WebElement femaleradiobtn = driver.findElement(By.xpath("(//label[@class='_58mt'])[1]"));

          boolean result = femaleradiobtn.isSelected();
        System.out.println(femaleradiobtn);
        
			if(result) 
			{
				System.out.println("radio butn is selected");
				
			}
			else 
			{
				System.out.println("radio btn is de-selected");
			}
}
}
