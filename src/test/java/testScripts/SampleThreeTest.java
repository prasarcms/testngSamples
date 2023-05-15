package testScripts;

import org.testng.annotations.Test;

public class SampleThreeTest {
	
	@Test(groups = "feature2")
	  public void testOne() {
		System.out.println("Test12 in Sample Three");
	}
	
	@Test
	  public void testTwo() {
		System.out.println("TestTwo in Sample Three");
	}
	
	@Test(groups = "feature1")
	  public void testThree() {
		System.out.println("Test3 in Sample Three");
	}
	
	@Test(groups = "feature3")
	  public void testFour() {
		System.out.println("Test22 in Sample Three");
	}

}
