package clevercompilancepages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Store {
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
	            driver.findElement(By.xpath("/html/body/div[1]/aside/div/nav/ul/li[2]/a")).click();
	            Thread.sleep(2000);
	            
    }
 }
//     driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div[3]/button")).click();

  }
  @Test (priority = 1)
  public void Services() throws InterruptedException
  {
	  driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[2]/div[2]/div/div[2]/div/div/div[1]/div[3]/button")).click();
      driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div[1]/div[2]/div/button")).click();
      WebElement a = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[2]/div[2]/div/div[2]/div/div[5]/div[2]/button"));
      a.click();
      Thread.sleep(3000);
      driver.navigate().back();
      driver.navigate().to("https://hub.staging.clevercompliance.io/store/compliance");
      Thread.sleep(1000);
      driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div[3]/button")).click();
      driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div[1]/div[2]/div")).click();
      driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div[10]/div[2]/div")).click();
      driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[2]/div[2]/div/div[2]/div/div[5]/div[2]")).click();
      Thread.sleep(1000);
      driver.navigate().back();
      driver.navigate().to("https://hub.staging.clevercompliance.io/store/compliance");
      driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[2]/div[2]/div/div[2]/div/div/div[3]/div[3]/button")).click();
      driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div[1]/div[2]/div")).click();
      driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div[4]/div[2]/div")).click();
      driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[2]/div[2]/div/div[2]/div/div[5]/div[2]/button")).click();
      driver.navigate().back();
      driver.navigate().to("https://hub.staging.clevercompliance.io/store/compliance");
      driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[2]/div[2]/div/div[2]/div/div/div[4]/div[3]/button")).click();
      driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div[1]/div[2]/div")).click();
      driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div[5]/div[2]/div")).click();
      driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[2]/div[2]/div/div[2]/div/div[5]/div[2]")).click();
      driver.navigate().back();
      
      driver.navigate().to("https://hub.staging.clevercompliance.io/store/compliance");
      driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[2]/div[2]/div/div[2]/div/div/div[5]/div[3]/button")).click();
      driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div[1]/div[2]/div")).click();
      driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[2]/div[2]/div/div[2]/div/div[5]/div[2]")).click();
      driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[2]/div[2]/div/div[2]/div/div/button")).click();
      driver.findElement(By.xpath("/html/body/div[5]/div/div[3]")).click();
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


