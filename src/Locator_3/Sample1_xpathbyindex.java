package Locator_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1_xpathbyindex 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	//click on creat new acc
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(3000);
	//Enter FN
	
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("prdaeep");
	Thread.sleep(3000);
//Enter Surname
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("lawange");
	Thread.sleep(3000);
	//Enter Mob no
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8605906516");
	Thread.sleep(3000);
	driver.close();


}
}
