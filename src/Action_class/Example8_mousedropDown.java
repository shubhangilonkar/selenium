package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example8_mousedropDown 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.browserstack.com/guide/action-class-in-selenium");
	
	driver.manage().window().maximize();
	
	WebElement deve = driver.findElement(By.xpath("//span[text()='Developers ']"));
	//step2
	Actions act=new Actions(driver);
	//step3
	act.moveToElement(deve).perform();
	
}
}
