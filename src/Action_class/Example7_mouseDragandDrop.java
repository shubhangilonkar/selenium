package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example7_mouseDragandDrop 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	
	WebElement des = driver.findElement(By.xpath("(//ol[@align='center'])[2]"));
	//step2
	Actions act=new Actions(driver);
	//step3
	act.dragAndDrop(source, des).perform();
	//act.moveToElement(source).clickAndHold().moveToElement(des).release().perform();
	Thread.sleep(2000);
	driver.close();
	
}
}
