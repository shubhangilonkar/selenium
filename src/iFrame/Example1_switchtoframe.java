package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_switchtoframe
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	driver.manage().window().maximize();

	//driver.switchTo().frame("iframeResult");                 //   --->string frame id
	//driver.switchTo().frame("iframeResult");                      // -->string frame name
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
	//frame webelemnt
	//click on click me btn
	driver.findElement(By.xpath("//button[contains(text(), 'Click me to display')]")).click();
	
	
}
}
