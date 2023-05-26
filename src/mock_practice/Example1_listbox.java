package mock_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example1_listbox 
{
public static void main(String[] args) throws InterruptedException
{

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	Thread.sleep(3000);
	//step1
  WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
  //step2
  Select s1=new Select(date);
  //step3
 // s1.selectByVisibleText("10");               //string value
  
  //s1.selectByValue("5");            //string value
  s1.selectByIndex(6);             //int value
  
  
} 
}
