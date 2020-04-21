package clevercompilancepages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Signin {
	WebDriver driver;
    String url = "https://hub.staging.clevercompliance.io/";
  @Test
  public void Signinpage() throws InterruptedException 
  {
	  driver.navigate().to(url);
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
