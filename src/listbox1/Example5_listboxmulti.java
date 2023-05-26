package listbox1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example5_listboxmulti 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		WebElement style = driver.findElement(By.xpath("//select[@name='cars']"));
		
		Select s=new Select(style);
		//s.selectByIndex(1);
		
		boolean result = s.isMultiple();
		
		System.out.println(result);
		if(result) 
		{
			System.out.println("list of is of multiselectable");
		}
		else {
			System.out.println("listbox is of single selectble");
		}
	}

}
