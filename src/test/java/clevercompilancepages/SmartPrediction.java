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
	public class SmartPrediction {
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
//	           driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/button")).click();
	          
		            driver.switchTo().window(parent);
		            driver.findElement(By.xpath("/html/body/div[1]/aside/div/nav/ul/li[4]/a")).click();
		            Thread.sleep(2000);
		            driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div[1]/div/div[2]/div[1]/div/div/div/a")).click();
		            Thread.sleep(2000);
		            
		           driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[1]/div/button[2]")).click(); 
		           driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[1]/div[2]/div[8]")).click();
		           driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/button")).click();
		           Thread.sleep(2000);
		        	 driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[1]/div/div[1]")).click();
		        	 Thread.sleep(2000);
		        	 
		        	 driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[1]/div[1]/div")).click();
		        	 driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/button")).click();
		        	 Thread.sleep(2000);
		        	 
		        	 driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/button[1]")).click();
		        	 Thread.sleep(1000);
		        	 driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[1]/div/div[2]")).click();
		        	 driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div")).click();
//		        	 driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[1]/div/div[2]")).click();
//		        	 
//		           boolean isEnable = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div")).isEnabled();
//			          if(isEnable) {
//			        	  System.out.println("No changes");
//			          }else {
//			        	  System.out.println("Changes");
//			          }
//			          boolean a1 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]/div/div/div[1]")).isEnabled();
//			          if(a1) {
//			        	  System.out.println("No changes are done");
//			          }else {
//			        	  System.out.println("Changes");
//			          }
//			          boolean a2 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[3]/div/div/div[1]")).isEnabled();
//			          if(a2) {
//			        	  System.out.println("No changes");
//			          }else {
//			        	  System.out.println("Changes");
//			          }
//			          boolean a3 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[4]/div/div/div[1]/div")).isEnabled();
//			          if(a3) {
//			        	  System.out.println("No changes");
//			          }else {
//			        	  System.out.println("Changes");
//			          }
//			          boolean a4 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[5]/div/div/div[1]/div/div")).isEnabled();
//			          if(a4) {
//			        	  System.out.println("No changes");
//			          }else {
//			        	  System.out.println("Changes");
//			          }
//			          boolean a5 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[5]/div/div/div[1]/div/div")).isEnabled();
//			          if(a5) {
//			        	  System.out.println("Some text changes to Orange(Pending) to Green(Valid)/Gray(Invalid)");
//			          }else {
//			        	  System.out.println("Changes");
//			          }
//			          boolean a6 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[7]/div/div/div[1]/div")).isEnabled();
//			          if(a6) {
//			        	  System.out.println("No changes");
//			          }else {
//			        	  System.out.println("Changes");
//			          }
//			          boolean a7 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[8]/div/div/div[1]/div")).isEnabled();
//			          if(a7) {
//			        	  System.out.println("No changes");
//			          }else {
//			        	  System.out.println("Changes");
//			          }
//			          boolean a8 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[9]/div/div/div[1]/div")).isEnabled();
//			          if(a8) {
//			        	  System.out.println("Data changes to Orange(Pending) to Green(Valid)/Gray(Invalid)");
//			          }else {
//			        	  System.out.println("Changes");
//			          }
//			          boolean a9 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[10]/div/div/div[1]/div")).isEnabled();
//			          if(a9) {
//			        	  System.out.println("No changes");
//			          } else {
//			        	  System.out.println("changes");
//			          }
//			          boolean a10 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[11]/div/div/div[1]/div")).isEnabled();
//			          if(a10) {
//			        	  System.out.println("data changes to Orange(Pending) to Green(Valid) /Gray(Invalid)");
//			          } else {
//			        	  System.out.println("changes");
//			          }
//			          boolean a11 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[12]/div/div/div[1]/div")).isEnabled();
//			          if(a11) {
//			        	  System.out.println("data changes to Orange(Pending) to Green(Valid) /Gray(Invalid)");
//			          } else {
//			        	  System.out.println("");
//			          }
//			          boolean a12 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[13]/div/div/div[1]/div")).isEnabled();
//			          if(a12) {
//			        	  System.out.println("data changes to Orange(Pending) to Green(Valid) /Gray(Invalid)");
//			          } else {
//			        	  System.out.println("Changes");
//			          }
//			          boolean a13 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[14]/div/div/div[1]/div")).isEnabled();
//			          if(a13) {
//			        	  System.out.println("data changes to Orange(Pending) to Green(Valid) /Gray(Invalid)");
//			          } else {
//			        	  System.out.println("changes");
//			          }
//			          boolean a14 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[15]/div/div/div[1]/div")).isEnabled();
//			          if(a14) {
//			        	  System.out.println("No changes");
//			          } else {
//			        	  System.out.println("changes");
//			          }
//			          boolean a15 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[16]/div/div/div[1]/div")).isEnabled();
//			          if(a15) {
//			        	  System.out.println("data changes to Orange(Pending) to Green(Valid) /Gray(Invalid)");
//			          } else {
//			        	  System.out.println("changes");
//			          }
//			          boolean a16 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[17]/div/div/div[1]/div")).isEnabled();
//			          if(a16) {
//			        	  System.out.println("data changes to Orange(Pending) to Green(Valid) /Gray(Invalid)");
//			          } else {
//			        	  System.out.println("changes");
//			          }
//			          boolean a17 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[18]/div/div/div[1]/div")).isEnabled();
//			          if(a17) {
//			        	  System.out.println("data changes to Orange(Pending) to Green(Valid) /Gray(Invalid)");
//			          } else {
//			        	  System.out.println("changes");
//			          }
//			          boolean a18 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[19]/div/div/div[1]/div")).isEnabled();
//			          if(a18) {
//			        	  System.out.println("data changes to Orange(Pending) to Green(Valid) /Gray(Invalid)");
//			          }else {
//			        	  System.out.println("chenges");
//			          }
//			          boolean a19 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[20]/div/div/div[1]/div")).isEnabled();
//			          if(a19) {
//			        	  System.out.println("data changes to Orange(Pending) to Green(Valid) /Gray(Invalid)");
//			          }else {
//			        	  System.out.println("changes");
//			        	  Thread.sleep(2000);
//			        	 
//			        	
//			        	  boolean b1 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div")).isEnabled();
//				          if(b1) {
//				        	  System.out.println("Data changes to Orange(pending) to Gray color(Invalid)");
//				          }else {
//				        	  System.out.println("changes");
//				          }
//				      boolean b2 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div")).isEnabled();
//					          if(b2) {
//					        	  System.out.println("Data changes to Orange(pending) to Gray color(Invalid)");
//					          }else {
//					        	  System.out.println("changes");
//					          }
//					  boolean b3 = driver.findElement(By.xpath("//html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[3]/div/div/div[1]/div")).isEnabled();
//						          if(b3) {
//						        	  System.out.println("Data changes to Orange(pending) to Gray color(Invalid)");
//						          }else {
//						        	  System.out.println("changes");
//						          }
//				      boolean b4 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[4]/div/div/div[1]/div")).isEnabled();
//							          if(b4) {
//							        	  System.out.println("Data changes to Orange(pending) to Gray color(Invalid)");
//							          }else {
//							        	  System.out.println("changes");
//							          }
//				      boolean b5 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[5]/div/div/div[1]/div")).isEnabled();
//								          if(b5) {
//								        	  System.out.println("Data changes to Orange(pending) to Gray color(Invalid)");
//								          }else {
//								        	  System.out.println("changes");
//								          }
//								          boolean b6 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[6]/div/div/div[1]/div")).isEnabled();
//								          if(b6) {
//								        	  System.out.println("Data changes to Orange(pending) to Gray color(Invalid)");
//								          }else {
//								        	  System.out.println("changes");
//								          }
//		
//               boolean c1 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div")).isEnabled();
//		          if(c1) {
//		        	  System.out.println("No changes");
//		          }else {
//		        	  System.out.println("changes");
//		          }
//		          boolean c2 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div")).isEnabled();
//		          if(c2) {
//		        	  System.out.println("ata changes to Orange(pending) to Gray color(Invalid)");
//		          }else {
//		        	  System.out.println("Changes");
//		          }
////		          driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/button")).click();
//		          
//		          boolean d1 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[1]/div/div/div[1]")).isEnabled();
//		          if(d1) {
//		        	  System.out.println("Data changes to orange(Pending) to green(valid)");
//		          }else {
//		        	  System.out.println("changes");
//		          }
//		          boolean d2 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/div")).isEnabled();
//		          if(d2) {
//		        	  System.out.println("data changes to Orange(Pending) to Gray(Invalid)");
//		          }else {
//		        	  System.out.println("changes");
//		          }
//		          boolean e1 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[1]/div/div/div[1]")).isEnabled();
//		          if(e1) {
//		        	  System.out.println("Result will change Orange color(pending) to Green(valid)");
//		          }else {
//		        	  System.out.println("Changes");
//		          }
//		          boolean e2 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]/div/div/div[1]")).isEnabled();
//		          if(e2) {
//		        	  System.out.println("Result Will change Orange color(Pending) to Gray(Invalid)");
//		          }else {
//		        	  System.out.println("Changes");
//		          }
//		          boolean f1 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div")).isEnabled();
//		          if(f1) {
//		        	  System.out.println("Result Will change Orange color(Pending) to Gray(Invalid)");
//		          }else {
//		        	  System.out.println("Changes");
//		          }
//		          boolean f2 = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div")).isEnabled();
//		          if(f2) {
//		        	  System.out.println("Result Will change Orange color(Pending) to Gray(Invalid)");
//		          }else {
//		        	  System.out.println("Changes");
//		          }
//		          
//			          }
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
		// TODO Auto-generated method stub
		
	}
	//public void Dashboard() throws InterruptedException 
	//{
//		if(driver.getTitle().equalsIgnoreCase("Any of\n" + 
//				"Skip - I want to go through it all\n" + 
//				"Is electrical"))
//		    //Pass
//		    System.out.println("would Results in No Changes");
//		else
//		    //Fail
//		    System.out.println("would Result Changes");
	//}
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

