package mock_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_ismultiple1 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/shubh/OneDrive/Desktop/selenium/Sample1_multiplelistbox.html");
	Thread.sleep(3000);
	//step1
	     WebElement selectcountry = driver.findElement(By.xpath("//select[@id='1234']"));
	     //step2
	     Select s=new Select(selectcountry);
	     
	    boolean result = s.isMultiple();
	    System.out.println(result);
	    
	    if(result)
	    {
	    	System.out.println("listbox is multi_selectable");
	    }
	    else 
	    {
	    	System.out.println("listbox is single_selectable");
	    }
}
}
