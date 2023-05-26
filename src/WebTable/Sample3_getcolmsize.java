package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3_getcolmsize 
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/shubh/OneDrive/Desktop/selenium/webtable.html");
	
	 int colmsize = driver.findElements(By.xpath("//table[@id='1234']//tr[2]/td")).size();
	System.out.println(colmsize);
	
	int colsize = driver.findElements(By.xpath("//table[@id='1234']//tr[1]/th")).size();
	
	System.out.println(colsize);
	
	
}
}
