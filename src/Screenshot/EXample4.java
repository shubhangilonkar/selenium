package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class EXample4 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		 String Rs = RandomString.make(2);
		
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	File dest =new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Screenshot\\image" +Rs+ ".jpg");	
	FileHandler.copy(src, dest);
	
	//send us
	
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("absfd");
	
	File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	System.out.println(src1);
	 File dest1=new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Screenshot\\image" +Rs+ ".jpg");
	 
	 FileHandler.copy(src1, dest1);
	}

}
