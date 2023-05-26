package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_SwitchtoMainPage 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//switch to frame
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me ')]")).click();
		
//switch to main page
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
	 Thread.sleep(2000);
	 
		//click on main page
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
		
		
	}

}
