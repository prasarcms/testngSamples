package testScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoteDriverTest {
	WebDriver driver; 
  @Test
  public void test() throws MalformedURLException {
	  	ChromeOptions options = new ChromeOptions();
	  	options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
	  	//options.setCapability(CapabilityType.BROWSER_VERSION, Brow);
	  
	  	String strHub = "http://192.168.0.125:4444";
	  	driver = new RemoteWebDriver(new URL(strHub), options);
	   	    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/"); //get() will reload and launch the page. used for dynamic pages.
		WebElement searchBox = driver.findElement(By.name("q"));
		
		searchBox.sendKeys("Java Tutorial");
		searchBox.submit();
		System.out.println("Page Title is..."+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
  }
	  
  }

