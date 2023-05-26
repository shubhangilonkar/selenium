package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1_popup 
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("444");
	
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	//switch
	Alert alt = driver.switchTo().alert();
	alt.accept();
	String text = alt.getText();
	System.out.println(text);
	
	
	
	
}
}
