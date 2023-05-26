package ScrollDownUp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://facebook.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	//step1 to scrool down 1parameter.0,2parameter .+ve
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
	Thread.sleep(2000);
	//ste2 toscrollup 1st parameter 0,2nd parameter -ve
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-100)");
	//step3 to scroll right 1st parametee +ve ,2nd parameter 0
	//((JavascriptExecutor)driver).executeScript("window.scroll(100,0)");
	//step4 to scrollleft 1st parameter -ve,2nd parameter 0
	//((JavascriptExecutor)driver).executeScript("window.scroll(-50,0)");
}
}
