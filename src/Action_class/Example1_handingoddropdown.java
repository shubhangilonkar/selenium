package Action_class;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1_handingoddropdown
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	//click on cancle button
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	//click on login
	Thread.sleep(2000);
	
	//step1
WebElement more = driver.findElement(By.xpath("//div[text()='More']"));
Thread.sleep(2000);

	//step2
	Actions act=new Actions(driver);
	//step3
	act.moveToElement(more).perform();

}
}
