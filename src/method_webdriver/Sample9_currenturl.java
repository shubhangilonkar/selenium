package method_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample9_currenturl 
{
public static void main(String[] args) throws InterruptedException 
{
	
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com/");
  Thread.sleep(2000);
	
  String url = driver.getCurrentUrl();
   System.out.println(url);
   Thread.sleep(2000);
   
  driver.close();
	
}
}
