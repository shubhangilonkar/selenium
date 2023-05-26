package popup;

import java.util.ArrayList;
import java.util.Set;

import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_childpopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//p[@class='oxd-text oxd-text--p orangehrm-copyright'])[2]")).click();
		Set<String> alllinks = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(alllinks);
	String childwin = al.get(1);
	
		//switch
		driver.switchTo().window(childwin);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn btn-ohrm btn-contact-sales'])[2]")).click();
		
		
	}

}
