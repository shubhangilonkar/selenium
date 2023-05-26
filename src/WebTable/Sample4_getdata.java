package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4_getdata 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/shubh/OneDrive/Desktop/selenium/webtable.html");
 String text = driver.findElement(By.xpath("//table[@id='1234']//tr[3]/td[3]")).getText(); 
		System.out.println(text);
		
		String text2 = driver.findElement(By.xpath("//table[@id='1234']//tr[1]/th[2]")).getText();
		
		System.out.println(text2);
		
		
		
		
		
	}

}
