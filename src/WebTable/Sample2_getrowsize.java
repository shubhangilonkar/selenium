package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2_getrowsize 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/shubh/OneDrive/Desktop/selenium/webtable.html");
		
		List<WebElement> allrow = driver.findElements(By.xpath("//table[@id='1234']//tr"));
		int Rowsize = allrow.size();
		System.out.println(Rowsize);
	}

}
