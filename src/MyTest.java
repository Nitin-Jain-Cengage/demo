import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyTest {
	Test123  test;
	
	
	
	
	//@BeforeMethod
	public void checkForSurvey(){
		
	}
	
	
	//test case 1
	@Test
	public void test1_Add(){
		test = new Test123();
		int addition = test.add(10, 20);
		Assert.assertEquals(addition, 50);
		Reporter.log("Done1");
	}
	
	@BeforeClass
	public void before(){
		//launch browser
		//reach base state
		System.out.println("Before all");
	}
	
	//test case 2
	@Test(dependsOnMethods={"test1_Add"})
	public void test2_Add(){
		test = new Test123();
		int addition = test.add(30, 20);
		Assert.assertEquals(addition, 50);
		Reporter.log("Done2");
		//System.out.println("Done2");
	}
	
	@AfterClass
	public void after(){
		//close browser
		// clean up?
		//can we take screenshot. lets do it.. it helps..
		System.out.println("After all");
		
	}
}
