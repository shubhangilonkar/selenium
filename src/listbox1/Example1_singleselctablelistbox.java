package listbox1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example1_singleselctablelistbox 
{
public static void main(String[] args) 
{
	WebDriver driver =new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
	
	 WebElement colour = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
	  
	 Select sl=new Select(colour);
	 
	sl.selectByIndex(1);
	sl.selectByIndex(0);
	sl.selectByIndex(2);
	
	 
			
}

}
