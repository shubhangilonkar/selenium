package WebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1_getrowsize 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/shubh/OneDrive/Desktop/selenium/webtable.html");
		
            int allRow = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
            System.out.println(allRow);
	}}
