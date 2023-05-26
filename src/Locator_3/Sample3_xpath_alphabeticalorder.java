package Locator_3;

import java.awt.List;
import java.util.ArrayList;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample3_xpath_alphabeticalorder 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	Select s=new Select(month);
//	ArrayList<String> al=new ArrayList<String>();
//	 java.util.List<WebElement> get = s.getOptions();
//	for(WebElement w:get) 
//	{
//		al.add(w.getText());
//	}
//	
//	System.out.println("after sorting month");
//	
//	System.out.println(al);
	
	
	
	TreeSet ts=new TreeSet();
	
  java.util.List<WebElement> get = s.getOptions();
	
   for(WebElement w:get)
     {	   ts.add(w.getText());
  }   
	System.out.println("after sorting");
	System.out.println(ts);
}
}
