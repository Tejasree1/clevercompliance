package clevercompilancepages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Clevercompailnce {
	WebDriver driver;
    String url = "https://hub.staging.clevercompliance.io/";

  @Test (priority = 0)
  public void IO_login() throws InterruptedException 
  {
	  driver.navigate().to(url);
       driver.findElement(By.xpath("/html/body/div[1]/header/nav/ul[2]/li[4]/button")).click();
       driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("dommithiteju950@gmail.com");
//       driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Cortexcraft123@");
//       driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/form/button")).click();
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

