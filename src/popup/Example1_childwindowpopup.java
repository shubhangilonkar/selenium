package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_childwindowpopup
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/links/"); 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//get new tab from main page
	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	
	//get all window id
	Set<String> allid = driver.getWindowHandles();                  //main pageid,childwindow id
	ArrayList<String> al=new ArrayList<String>(allid);
	String childwindowid = al.get(1);

	
	//switch to childpage
	driver.switchTo().window(childwindowid);
	
	driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	
	
	
	
	
}
}
