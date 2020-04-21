package clevercompilancepages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Register {
	WebDriver driver;
    String url = "https://hub.staging.clevercompliance.io/";

  @Test (priority = 0)
  public void IO_login() throws InterruptedException 
  {
	  driver.navigate().to(url);
	  driver.findElement(By.xpath("/html/body/div[1]/header/nav/ul[2]/li[4]/button")).click();
		String parent=driver.getWindowHandle();
		Set<String>s1=driver.getWindowHandles();
		 java.util.Iterator<String> I1= s1.iterator();
		 java.util.Iterator<String> it = null;
		 while(I1.hasNext())
		 {
		    String child_window=I1.next();
		    if(!parent.equals(child_window))
		    {
		    driver.switchTo().window(child_window);
		    System.out.println(driver.switchTo().window(child_window).getTitle());

	             Thread.sleep(1000);
	            
	             driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div[2]/a[1]")).click();
	             Thread.sleep(2000);
	             driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("tejasree.dommithi@cortexcraft.com");
	             Thread.sleep(2000);
	             driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
	             driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("tejureddy817@");
           driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span")).click();
//           driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/button")).click();
          
	            driver.switchTo().window(parent);
	            driver.findElement(By.xpath("/html/body/div[1]/aside/div/nav/ul/li[4]/a")).click();
	            driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div[1]/div/div[2]/div[1]/div/div/div/a")).click();
	            Thread.sleep(2000);
	            
	            driver.findElement(By.xpath("//*[@id=\"__BVID__114\"]/div[1]")).click();
	            
	            driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/button")).click();
	            Thread.sleep(2000);
	            
	            driver.findElement(By.xpath("//*[@id=\"__BVID__164\"]/div[2]")).click();
	            driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/button")).click();
	            Thread.sleep(2000);
	            
	            driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/button[1]")).click();
	            Thread.sleep(2000);
	            driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/button[1]")).click();
	            Thread.sleep(2000);
	            driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[1]/div[1]/div")).click();
	            driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/button")).click();
	            Thread.sleep(2000);
	            driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/button[1]")).click();
	            driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/button[2]")).click();

	            Thread.sleep(2000);
	           driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/aside/div[3]/div/div[1]")).click();
	           driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/aside/div[3]/div/div[2]")).click();
	           driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/aside/div[3]/div/div[3]")).click();
	           Thread.sleep(1000);
	           driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/aside/div[3]/div/div[4]")).click();
	           driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/aside/div[3]/div/div[5]")).click();
	           driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/aside/div[3]/div/div[6]")).click();
	           Thread.sleep(1000);
	           driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/aside/div[3]/div/div[7]")).click();
	           driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[1]/div/button[2]")).click();
	         }
		    
	  }
		 
	}	  
private void waitForElement(WebDriver driver2, By xpath) {
	// TODO Auto-generated method stub
	
}
private void assertTrue(String string, Object verifyElementPresent) {
	// TODO Auto-generated method stub
	
}
private Object verifyElementPresent(WebDriver driver2, By xpath) {
	// TODO Auto-generated method stub
	return null;
}
private void click(WebDriver driver2, By xpath) {
	// TODO Auto-generated method stub
	
}
private void vaitForElement(WebDriver driver2, By xpath) {
}
@BeforeTest
public void setup() throws InterruptedException
{
	  System.setProperty("webdriver.chrome.driver",
	            "/Users/esakkiraja/Downloads/chromedriver");
    driver = new ChromeDriver();
   
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);   
}
}
