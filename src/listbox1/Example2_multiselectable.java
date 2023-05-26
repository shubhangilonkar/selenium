package listbox1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example2_multiselectable 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		
		driver.manage().window().maximize();
	WebElement style = driver.findElement(By.xpath("//select[@id='cars']"));
	
	Select s=new Select(style);
	
	boolean result = s.isMultiple();
	System.out.println(result);
	
	if(result) 
	{
		System.out.println("list box is multiselectable ");
	}
	else
	{
		System.out.println("list box is single-selectable ");
	}
	
//	s.selectByIndex(0);
//	s.selectByIndex(2);
//	s.selectByIndex(3);
//    Thread.sleep(2000);
//	
//	//s.deselectAll();
//    s.deselectByIndex(2);
//	
	
	}

}
