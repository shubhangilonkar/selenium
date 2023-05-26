
package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_childwindow 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/links/");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//get new tab from main page
	driver.findElement(By.xpath("//input[@name='NewTab']")).click();;
	//get allId 
	Set<String> AllId = driver.getWindowHandles();
	ArrayList<String> al=new ArrayList<String>(AllId);
	String childwindowID = al.get(1);
	//get to switch
	driver.switchTo().window(childwindowID);
	
	driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	
	//get to nwe window from main page
	String mainpageID = al.get(0);
	driver.switchTo().window(mainpageID);
	driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	
}
}
