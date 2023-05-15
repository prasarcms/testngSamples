package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenCartRegExcercise {
	
	
	 WebDriver driver; 
	
	 @BeforeMethod
	//@BeforeTest
	public void setup() {
	driver = new ChromeDriver();
	driver.get("https://demo.opencart.com/"); //get() will reload and launch the page. used for dynamic pages.
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
	driver.manage().window().maximize();
				
		}
	
  @Test
  public void register() {
	  
	  
	  driver.findElement(By.linkText("My Account")).click();
	  driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
	  driver.findElement(By.id("input-firstname")).sendKeys("Prateek");
	  driver.findElement(By.id("input-lastname")).sendKeys("Sarangamath");
	  driver.findElement(By.id("input-email")).sendKeys("a");;
	  
	  driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("testpassword");
	  JavascriptExecutor js1  = (JavascriptExecutor)driver;
	  js1.executeScript("window.scrollBy(10, 500)");
	 
	 /* WebElement subscribe = driver.findElement(By.xpath("//input[@id='input-newsletter-no']"));
	  if(!subscribe.isSelected()) 
	  {
			subscribe.click();
	  }*/
	  
	  WebElement elem = driver.findElement(By.xpath("//input[@name='agree']"));
	  JavascriptExecutor jsagree = (JavascriptExecutor)driver;
	  jsagree.executeScript("arguments[0].click();", elem);
	  	
	  
	  WebElement cont = driver.findElement(By.cssSelector("button[type='submit']"));
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click();", cont);
	  
	  
	  //driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).submit();
	  
	  
	 
	  WebElement m = driver.findElement(By.id("input-email"));	
	  String act = m.getText();
	  System.out.println("Please enter a part following '@', 'a' is incomplete "+ act);
	  //verify error message with Assertion
	  Assert.assertEquals("Please enter a part following '@', 'a' is incomplete", act);
		
	  
	  
	  
  }
  
  @AfterMethod
  public void teardown()
  {
	  driver.close();
  }
  
}
