package webelements_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	Thread.sleep(3000);
	WebElement UN = driver.findElement(By.xpath("//p[text()='Login or Create Account']"));
      UN.click();
      Thread.sleep(3000);
      
      driver.findElement(By.xpath("//li[text()='MyBiz Account']")).click();
      
      Thread.sleep(3000);
      WebElement Text = driver.findElement(By.xpath("//input[@name='username']"));
      Text.sendKeys("abc");
      Thread.sleep(3000);
      Text.clear();
      Thread.sleep(3000);
      Text.sendKeys("xyz");
      Thread.sleep(3000);
      
      
}
}
