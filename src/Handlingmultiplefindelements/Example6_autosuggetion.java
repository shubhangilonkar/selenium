package Handlingmultiplefindelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6_autosuggetion
{
public static void main(String[] args) throws InterruptedException 
{
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.google.com/");
     
     driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");;
     Thread.sleep(2000);
     List<WebElement> alllinks = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
   
     String EcpText="redmi note 11";
     for(WebElement s1:alllinks) 
     {
    	 String ActualText = s1.getText(); 
    	 
    	 
    	 if(ActualText.equals(EcpText)) 
    	 {
    		s1.click();
    		break;
    	 }
     }
     
     
     
     
}
}
