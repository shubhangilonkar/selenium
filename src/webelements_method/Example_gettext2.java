package webelements_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_gettext2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//a[text()='Forgot password?']")).getText();
		System.out.println(text);
		
		
	}

}
