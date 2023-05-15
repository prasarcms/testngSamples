package parallelScripts;

import org.testng.annotations.Test;

public class SampleThreeTest {
	
	@Test
	  public void testOne() {
		long id=Thread.currentThread().getId();
		System.out.println("Test12 in Sample Three-"+id);
	}
	
	@Test
	  public void testTwo() {
		long id=Thread.currentThread().getId();
		System.out.println("TestTwo in Sample Three-"+id);
	}
	
	@Test
	  public void testThree() {
		long id=Thread.currentThread().getId();
		System.out.println("Test3 in Sample Three-"+id);
	}
	
	@Test
	  public void testFour() {
		long id=Thread.currentThread().getId();
		System.out.println("Test22 in Sample Three-"+id);
	}

}
