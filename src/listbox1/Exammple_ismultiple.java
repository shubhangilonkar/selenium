package listbox1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exammple_ismultiple
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/shubh/OneDrive/Desktop/selenium/multiplelist.html");
	Thread.sleep(2000);
WebElement selectcountry = driver.findElement(By.xpath("//select[@id='1234']"));
	
	//step2
         Select s=new Select(selectcountry);

             boolean result = s.isMultiple();
             System.out.println(s);
	if(result) 
	{
		System.out.println("listbox is mult-iselectable");
	}
	else
	{
		System.out.println("listbox is single-iselectable");
	}
             
	
}
}
