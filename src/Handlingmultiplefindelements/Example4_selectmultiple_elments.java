package Handlingmultiplefindelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_selectmultiple_elments 
{
	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
              driver.get("https://www.instagram.com/");		
		
		List<WebElement> Alllinks = driver.findElements(By.xpath("//a"));
		
		System.out.println(Alllinks.size());
		
	for(WebElement s1:Alllinks) 
	{
		System.out.println(s1.getText());
	}
		
		
	}

}
