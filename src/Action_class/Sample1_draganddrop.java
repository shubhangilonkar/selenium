package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample1_draganddrop
{
public static void main(String[] args) throws InterruptedException
{
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	driver.manage().window().maximize();
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
	Thread.sleep(2000);
	WebElement src = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	
	WebElement des = driver.findElement(By.xpath("//div[@id='trash']"));
	Actions act =new Actions(driver);
	act.dragAndDrop(src, des).perform();
			
}
}
