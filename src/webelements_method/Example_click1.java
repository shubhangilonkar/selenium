package webelements_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_click1 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 
	 Thread.sleep(3000);
driver.findElement(By.xpath("//a[text()='Create new account']")).click();


}
}
