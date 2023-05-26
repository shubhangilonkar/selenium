package listbox1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example8_getallselect
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	
	WebElement color = driver.findElement(By.xpath("//select[@name='cars']"));
	Select s=new Select(color);
	s.selectByIndex(0);
	s.selectByIndex(1);
	s.selectByIndex(2);
	
	List<WebElement> allopt = s.getAllSelectedOptions();
	for(WebElement s1:allopt)
	{
		System.out.println(s1.getText());
		
	}
	
}
}
