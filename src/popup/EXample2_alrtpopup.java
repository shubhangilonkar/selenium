package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EXample2_alrtpopup 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
	 	driver.get("https://demo.guru99.com/test/delete_customer.php"); 
	 	
	 driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("444");
	 	
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	 	
	 Alert alt = driver.switchTo().alert();
	 //gettext
	 String text = alt.getText();
	 System.out.println(text);
	 //click on cancle
	// alt.dismiss();
	 //click on ok1
	 alt.accept();
	 
	//click on ok2
	 alt.accept();
	}

}
