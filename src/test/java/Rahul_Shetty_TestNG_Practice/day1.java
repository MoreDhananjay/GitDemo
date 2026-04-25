package Rahul_Shetty_TestNG_Practice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {

	@Test
	public void start() {
		System.out.println("This call is from test method ");
		System.out.println("Git demo2 ");
		System.out.println("Git demo3 ");
	}
	
	@Test
	public void gitdemo() 
	{
		System.out.println("Git demo on 25Apr 2026");
	}
	
	@Test
	public void gitHubDemo() 
	{
		System.out.println("GitHubDemo demo on 25Apr 2026");
	}
	@BeforeTest()
	public void bt() {
		System.out.println("This call is from the before test execution method");
		System.out.println("Git demo on 25April2026");
	}

	@AfterTest()
	public void at() {
		System.out.println("This call is from the After test method");
		System.out.println("Git demo on 25April2026");
	}

}
