package mockInterview_que;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://beginnersbook.com/2017/09/java-examples/");
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("(//a[@class='comment-reply-link'])[1]")).click();
	Thread.sleep(2000);
}
}
