
package webelements_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_sendkey2
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
           driver.get("https://www.facebook.com/");	
           
          // driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("xyz");
        WebElement un = driver.findElement(By.xpath("//input[@name='pass']"));
           
        un.sendKeys("xyz");
           
}
}
