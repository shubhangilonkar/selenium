package Locator_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_xpathbyindex 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	// click create new acc
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(3000);
		//enter UN
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("shubhangi");
		Thread.sleep(3000);
//enter surname
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("lonkar");
		Thread.sleep(3000);

		//Enter Mob
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("7498389175");
		Thread.sleep(3000);
		driver.close();

	}

}

