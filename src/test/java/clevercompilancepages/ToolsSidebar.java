package clevercompilancepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ToolsSidebar {
	WebDriver driver;
    String url = "https://hub.staging.clevercompliance.io/";
  @Test
  public void legislationFinder() throws InterruptedException 
  {
	  driver.findElement(By.xpath("/html/body/div/aside/div/nav/ul/li[4]/a")).click();
	  driver.findElement(By.xpath("/html/body/div/section/div/div/div[3]/div/div[1]/div/div[2]/div[1]/div/div/div/a")).click();
	  driver.findElement(By.xpath("")).click();
	  if(driver.findElements(By.xpath("/html/body/div/section/div/div/div[1]/h2")).size() != 0){
		  System.out.println("Element is Present");
		  }else{
		  System.out.println("Element is Absent");
		  }
	  if(driver.findElements(By.xpath("/html/body/div/section/div/div/div[3]/div/ul/li[1]/a")).size() != 0){
		  System.out.println("Element is Present");
		  }else{
		  System.out.println("Element is Absent");
		  }
	  WebElement t1 = driver.findElement(By.xpath("/html/body/div/section/div/div/div[3]/div/ul/li[2]/a"));
	  WebElement t2 = driver.findElement(By.xpath("/html/body/div/section/div/div/div[3]/div/div/div/div[1]/div/button[1]"));
	  WebElement t3 = driver.findElement(By.xpath("/html/body/div/section/div/div/div[3]/div/div/div/div[1]/div/button[2]"));
	  WebElement t4 = driver.findElement(By.xpath("/html/body/div/section/div/div/div[3]/div/div/div/div[1]/button/div"));
	  WebElement t5 = driver.findElement(By.xpath("/html/body/div/section/div/div/div[3]/div/div/div/div[2]/div[2]/div[1]/span[1]"));
	  WebElement t6 = driver.findElement(By.xpath("/html/body/div/section/div/div/div[3]/div/div/div/div[2]/div[2]/div[1]/span[2]"));
	  WebElement t7 = driver.findElement(By.xpath("/html/body/div/section/div/div/div[3]/div/div/div/div[2]/div[2]/div[1]/span[3]"));
	  WebElement t8 = driver.findElement(By.xpath("/html/body/div/section/div/div/div[3]/div/aside/div[1]"));
	  Assert.assertEquals(true, t1.isDisplayed());
	  Assert.assertEquals(true, t2.isDisplayed());
	  Assert.assertEquals(true, t3.isDisplayed());
	  Assert.assertEquals(true, t3.isDisplayed());
	  Assert.assertEquals(true, t5.isDisplayed());
	  Assert.assertEquals(true, t6.isDisplayed());
	  Assert.assertEquals(true, t7.isDisplayed());
	  Assert.assertEquals(true,t8.isDisplayed());
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("/html/body/div/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/input")).click();
	  driver.findElement(By.xpath("/html/body/div/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/div/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/input")).click();
	  driver.findElement(By.xpath("/html/body/div/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/div/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/button[1]")).click();
	  driver.findElement(By.xpath("/html/body/div/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/button[2]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("/html/body/div/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[1]/div[1]/div/input")).click();
	  driver.findElement(By.xpath("/html/body/div/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/div/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[1]/div[1]/div/input")).click();
	  driver.findElement(By.xpath("/html/body/div/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/div/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/button[1]")).click();
	  driver.findElement(By.xpath("/html/body/div/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/button[2]")).click();
	  WebElement r1 = driver.findElement(By.xpath("/html/body/div/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/h2"));
	  Assert.assertEquals(true, r1.isDisplayed());
  }
}




