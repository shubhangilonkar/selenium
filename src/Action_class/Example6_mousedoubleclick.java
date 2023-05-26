package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example6_mousedoubleclick 
 {
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Me')]"));
	//step2
	Actions act=new Actions(driver);
	//step3
//	act.moveToElement(doubleclick).perform();
//	act.doubleClick().perform();
//act.moveToElement(doubleclick)	.doubleClick().perform();
	
	
act.doubleClick(doubleclick) .perform();
	
	
}

}
