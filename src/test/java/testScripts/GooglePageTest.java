package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GooglePageTest {
	
	 WebDriver driver; 
	@BeforeMethod
	//@BeforeTest
  public void setup() {
		    driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
			driver.manage().window().maximize();
	}
 /*	 
  @Test(priority = 1) // If we comment the ANNOTATION then the whole method below wont be run.
  public void javaSearchTest() {
	  
	  	driver.get("https://www.google.com/"); //get() will reload and launch the page. used for dynamic pages.
		WebElement searchBox = driver.findElement(By.name("q"));
		
		searchBox.sendKeys("Java Tutorial");
		searchBox.submit();
		Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
  }
  
  //Hard Assertion
  @Test(priority = 2)
  public void seleniumSearchTest() {
	  
	  	driver.get("https://www.google.com/"); //get() will reload and launch the page. used for dynamic pages.
	  	Assert.assertEquals(driver.getTitle(), "Google");
		WebElement searchBox = driver.findElement(By.name("q"));
		
		searchBox.sendKeys("Selenium Tutorial");
		searchBox.submit();
		Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search");
	  
  } 
  
  //Soft Assertion
  @Test
  public void seleniumSearchTest1() {
	  
	  	driver.get("https://www.google.com/"); //get() will reload and launch the page. used for dynamic pages.
	  	SoftAssert SA = new SoftAssert();
	  	SA.assertEquals(driver.getTitle(), "Google Page");
		WebElement searchBox = driver.findElement(By.name("q"));
		
		searchBox.sendKeys("Selenium Tutorial");
		searchBox.submit();
		SA.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search Page");
		SA.assertAll();
	  
  }
  
  
  
  @Test //(priority = 3)
  public void cucumberSearchTest() {
	  
	  	driver.get("https://www.google.com/"); //get() will reload and launch the page. used for dynamic pages.
	  	Assert.assertEquals(driver.getTitle(), "Google");
		WebElement searchBox = driver.findElement(By.name("q"));
		
		searchBox.sendKeys("Cucumber Tutorial");
		searchBox.submit();
		Assert.assertEquals(driver.getTitle(), "Cucumber Tutorial - Google Search1");
	  
  } 
  
  
  @Test(priority = 4)
  public void appiumSearchTest() {
	  
	  	driver.get("https://www.google.com/"); //get() will reload and launch the page. used for dynamic pages.
	  	Assert.assertEquals(driver.getTitle(), "Google");
		WebElement searchBox = driver.findElement(By.name("q"));
		
		searchBox.sendKeys("Appium Tutorial");
		searchBox.submit();
		Assert.assertEquals(driver.getTitle(), "Appium Tutorial - Google Search");
	  
  } */
  
	/*//Dependency: depends on another method. But fails if the method dependent on fails
	
	@Test(dependsOnMethods = "seleniumSearchTest")
	  public void javaSearchTest() {
		  
		  	driver.get("https://www.google.com/"); //get() will reload and launch the page. used for dynamic pages.
			WebElement searchBox = driver.findElement(By.name("q"));
			
			searchBox.sendKeys("Java Tutorial");
			searchBox.submit();
			Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
	  }*/
	
	//AlwaysRun = true, will run even if method depended on fails.
	@Test(alwaysRun = true, dependsOnMethods = "seleniumSearchTest")
	  public void javaSearchTest() {
		  
		  	driver.get("https://www.google.com/"); //get() will reload and launch the page. used for dynamic pages.
			WebElement searchBox = driver.findElement(By.name("q"));
			
			searchBox.sendKeys("Java Tutorial");
			searchBox.submit();
			Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
	  }
	  
	  
	  @Test
	  public void seleniumSearchTest() {
		  
		  	driver.get("https://www.google.com/"); //get() will reload and launch the page. used for dynamic pages.
		  	Assert.assertEquals(driver.getTitle(), "Google");
			WebElement searchBox = driver.findElement(By.name("q"));
			
			searchBox.sendKeys("Selenium Tutorial");
			searchBox.submit();
			Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search1");
		  
	  } 
	
  
  //@AfterTest
  @AfterMethod  //aftermethod will execute even if test is passed or failed
  public void teardown() {
	  driver.close();
  }
}

//testng heirarchy
// TestSuite -> Tests -> TestClasses -> TestMethods
