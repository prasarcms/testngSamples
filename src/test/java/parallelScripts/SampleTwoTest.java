package parallelScripts;

import org.testng.annotations.Test;

public class SampleTwoTest {
	
	@Test
	  public void testOne() {
		long id=Thread.currentThread().getId();
		System.out.println("Test1 in Sample Two-"+ id);
	}
	
	@Test
	  public void testTwo() {
		long id=Thread.currentThread().getId();
		System.out.println("Test2 in Sample Two-"+ id);
	}
	
	@Test
	  public void testThree() {
		long id=Thread.currentThread().getId();
		System.out.println("Test21 in Sample Two-"+ id);
	}
	
	@Test
	  public void testFour() {
		long id=Thread.currentThread().getId();
		System.out.println("Test11 in Sample Two-"+ id);
	}

}
